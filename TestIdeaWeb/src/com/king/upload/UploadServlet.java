package com.king.upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

/**
 * Created by pd on 2018/10/26 13:47
 */
@WebServlet(name = "UploadServlet",urlPatterns = "/upload")
@MultipartConfig   // 多媒体
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String savePath = request.getServletContext().getRealPath("/WEB-INF/uploadFile");
        File temp = new File(savePath);

        if (!temp.exists()) {
            temp.mkdirs();
        }


        // 获取多个文件
        Collection<Part> parts = request.getParts();

        if (parts.size() == 1) {
            // 单个文件
            Part part = request.getPart("file");

            String header = part.getHeader("content-disposition");

            String filename = System.currentTimeMillis() + "_"+getFileName(header);

            part.write(savePath+File.separator+filename);


        } else {
            // 多个文件
        }

        PrintWriter out = response.getWriter();
        out.print("上传成功");
        out.flush();
        out.close();

    }

    public String getFileName(String header) {

        String[] tempArr1 = header.split(";");
        String[] tempArr2 = tempArr1[2].split("=");
        String fileName = tempArr2[1].substring(tempArr2[1].lastIndexOf("\\")+1).replaceAll("\"","");
                return fileName;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
