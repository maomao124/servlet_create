package com.example.servlet_create;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Project name(项目名称)：servlet_create
 * Package(包名): com.example.servlet_create
 * Class(类名): Myservlet2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/20
 * Time(创建时间)： 20:43
 * Version(版本): 1.0
 * Description(描述)： GenericServlet 抽象类
 * javax.servlet.GenericServlet 实现了 Servlet 接口，并提供了除 service() 方法以外的其他四个方法的简单实现。
 * 通过继承 GenericServlet 类创建 Servlet ，只需要重写 service() 方法即可，大大减少了创建 Servlet 的工作量。
 * GenericServlet 类中还提供了以下方法，用来获取 Servlet 的配置信息。
 * 返回值	方法	备注
 * String	getInitParameter(String name)	返回名字为 name 的初始化参数的值，初始化参数在 web.xml 中进行配置。如果参数不存在，则返回 null。
 * Enumeration<String>	getInitParameterNames()	返回 Servlet 所有初始化参数的名字的枚举集合，若 Servlet 没有初始化参数，返回一个空的枚举集合。
 * ServletContext	getServletContext()	返回 Servlet 上下文对象的引用。
 * String	getServletName()	返回此 Servlet 实例的名称。
 */

public class Myservlet2 extends GenericServlet
{

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException
    {
        //设置字符集
        servletResponse.setContentType("text/html;charset=UTF-8");
        //使用PrintWriter.write()方法向前台页面输出内容
        PrintWriter writer = servletResponse.getWriter();
        writer.write("hello!");
        writer.close();
    }
}
