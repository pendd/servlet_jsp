package com.king.annotation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pd on 2018/10/25 15:45
 */
//@WebServlet(name = "AnnotationServlet")
//@WebServlet(name = "AnnotationServlet",urlPatterns = "/annotationTest")
//@WebServlet("/annotationTest") // 当前servlet没有name值 不好
//@WebServlet(name = "AnnotationServlet",urlPatterns = {"/annotationTest","ann","cccna"})
//@WebServlet(name = "AnnotationServlet",urlPatterns = "/annotationTest",loadOnStartup = 1,initParams = @WebInitParam(name="name",value="king"))
@WebServlet(name = "AnnotationServlet",urlPatterns = "/annotationTest",
        loadOnStartup = 1,initParams = {
        @WebInitParam(name="name",value="king"),
        @WebInitParam(name="sex",value="male")
})
public class AnnotationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
