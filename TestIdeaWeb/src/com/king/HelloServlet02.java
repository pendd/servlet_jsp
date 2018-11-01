package com.king;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by pd on 2018/10/23 14:25
 */
public class HelloServlet02 extends HttpServlet {


    @Override
    public void init() throws ServletException {
        System.out.println("初始化-----");
        super.init();

        // 通过key获取value
        String name = getServletConfig().getInitParameter("name");
        String name1 = getServletConfig().getInitParameter("name1");

        System.out.println(name + "-----------" +name1);

        Enumeration<String> names = getServletConfig().getInitParameterNames();

        while (names.hasMoreElements()){
            String key = names.nextElement();
            String v = getServletConfig().getInitParameter(key);
            System.out.println(key + "=====" + v);
        }
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service服务-----" + req.getRequestedSessionId());
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("摧毁-----");
        super.destroy();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决乱码问题
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String sex = request.getParameter("sex");

        Enumeration<String> names = request.getParameterNames();

        StringBuilder sb = new StringBuilder();

        while (names.hasMoreElements()) {
            String s = names.nextElement();
            String value = request.getParameter(s);

            sb.append("<p>"+s+":"+value+"</p>");
        }



//        out.print("name:"+name + "                sex:"+sex);

        out.print("<!DOCTYPE html>");
        out.print("<html lang=\"en\">");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("<title>Title</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<p>"+name+"</p>");
        out.print("<p>"+sex+"</p>");
//        out.print(sb);
        out.print("<p>"+request.getHeader("User-Agent")+"---------"+"</p>");
//        out.print("<p>"+request.getPathInfo()+"====="+"</p>");
        // 返回int型数值   不是int型会触发numberFormatException  后面的代码不输出
//        out.print("<p>"+request.getIntHeader("User-Agent")+"</p>");
        out.print("</body>");
        out.print("</html>");

        // 获取所有的请求头名称
        Enumeration<String> headerNames = request.getHeaderNames();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

//        out.write("123中文");
        doPost(request,response);

        // 获取上下文路径
        request.getContextPath();



    }
}
