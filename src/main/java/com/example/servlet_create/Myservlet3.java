package com.example.servlet_create;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Project name(项目名称)：servlet_create
 * Package(包名): com.example.servlet_create
 * Class(类名): Myservlet3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/20
 * Time(创建时间)： 20:46
 * Version(版本): 1.0
 * Description(描述)： HttpServlet 抽象类
 * javax.servlet.http.HttpServlet 继承了 GenericServlet 抽象类，用于开发基于 HTTP 协议的 Servlet 程序。
 * 由于 Servlet 主要用来处理 HTTP 的请求和响应，所以通常情况下，编写的 Servlet 类都继承自 HttpServlet。
 * 在 HTTP/1.1 协议中共定义了 7 种请求方式，即 GET、POST、HEAD、PUT、DELETE、TRACE 和 OPTIONS。
 * HttpServlet 针对这 7 种请求方式分别定义了 7 种方法，即 doGet()、doPost()、doHead()、doPut()、doDelete()、doTrace() 和 doOptions()。
 * HttpServlet 重写了 service() 方法，该方法会先获取客户端的请求方式，然后根据请求方式调用对应 doXxx 方法。
 *
 * HttpServlet 是 GenericServlet 的子类，它在 GenericServlet 的基础上专门针对 HTPP 协议进行了处理。HttpServlet 为 HTTP 协议的每种请求方式都提供了对应的方法，名字为 doXxx()，例如：
 * 处理 GET 请求的方法为 doGet()；
 * 处理 POST 请求的方法为 doPost()。
 */

public class Myservlet3 extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //使用PrintWriter.write()方法向前台页面输出内容
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write("hello!!!");
        writer.close();
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //使用PrintWriter.write()方法gaifang向前台页面输出内容
        PrintWriter writer = resp.getWriter();
        writer.write("56546");
        writer.close();
        doGet(req, resp);
    }
}
