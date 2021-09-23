package com.shanghai.cp.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

//@WebServlet("/hello")
//请求映射必须是以"/"开头，下面与上等价
//@WebServlet(name="HelloServlet",value="/hello")
@WebServlet(urlPatterns = "/hello", name = "xxx")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        request.setCharacterEncoding("utf-8");
        String msg = request.getParameter("msg");
        System.out.println("获取参数方式1：" + msg);
        msg = URLDecoder.decode(request.getParameter("msg"), "utf-8");
        System.out.println("解码之后:" + msg);
//        jsp页面虽然设置了utf-8编码，但传输的过程中使用的编码是：ISO-8859-1
//        String msg2 = new String(request.getParameter("msg").getBytes("ISO-8859-1"), "utf-8");
//        System.out.println("获取参数方式2：" + msg2);
//        获取参数方式2：chinese中文字符串乱码测试

        response.setCharacterEncoding("utf-8");

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        response.getWriter().println("<h2 style=\"color:orange\">请求成功，显示参数：" + msg + "</h2>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }

}
