package com.king;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by pd on 2018/10/24 9:27
 */
@WebServlet(name = "OfflineTestServlet",
        urlPatterns = {"/d","/b","/c"},
        loadOnStartup = 3,
        initParams = {
                @WebInitParam(name = "name",value = "king"),
                @WebInitParam(name = "name1",value = "king1")})  // 多个跳转路径

public class OfflineTestServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        boolean hasNet = checkNetwork();

        getServletContext().setAttribute("hasNet",hasNet);
    }

    private boolean checkNetwork() {

        boolean flag = true;

        boolean res = false;

        Runtime runtime = Runtime.getRuntime();

        Process process = null;

        String line = null;

        InputStream is = null;

        InputStreamReader isr = null;

        BufferedReader br = null;

        String ip = "www.baidu.com";

        try {
            process = runtime.exec("ping " + ip);

            is = process.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            while ((line = br.readLine()) != null) {
                if (line.contains("TTL")) {
                    res = true;
                    break;
                }
            }

            is.close();
            isr.close();
            br.close();

            if(res) {
                System.out.println("网络正常，已经连接到外网");
            }else {
                flag = false;
                System.out.println("网络异常，ping不通");
            }
        } catch (IOException e) {
            e.printStackTrace();
            res = false;
            System.out.println("网络异常，ping不通");
        }

        return flag;

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行到offline");
    }
}
