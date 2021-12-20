package com.example.servlet_create;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Project name(项目名称)：servlet_create
 * Package(包名): com.example.servlet_create
 * Class(类名): myservlet1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/20
 * Time(创建时间)： 20:30
 * Version(版本): 1.0
 * Description(描述)：
 * Servlet 接口
 * javax.servlet.Servlet 是 Servlet API 的核心接口，所有的 Servlet 类都直接或间接地实现了这一接口。
 * Servlet 接口中定义了 5 个方法，下面我们对他们做简单的介绍。
 * 返回值	方法	备注
 * void	init(ServletConfig config)	Servlet 实例化之后，由 Servlet 容器调用，用来初始化 Servlet 对象。该方法只能被调用一次。
 * 参数 config 用来向 Servlet 传递配置信息。
 * void	service(ServletRequest req,ServletResponse res)	Servlet 容器调用该方法处理客户端请求。
 * void	destroy()	服务器关闭、重启或者 Servlet 对象被移除时，由 Servlet 容器调用，负责释放 Servlet 对象占用的资源。
 * ServletConfig	getServletConfig()	该方法用来获取 ServletConfig 对象，该对象中包含了 Servlet 的初始化参数。
 * String	getServletInfo()	该方法用于获取 Servlet 的信息，例如作者、版本、版权等。
 */

public class Myservlet1 implements Servlet
{

    @Override
    public void init(ServletConfig servletConfig) throws ServletException
    {
        //Servlet 实例被创建后，调用 init() 方法进行初始化，该方法只能被调用一次
        System.out.println("初始化");
    }

    @Override
    public ServletConfig getServletConfig()
    { //返回 ServletConfig 对象，该对象包含了 Servlet 的初始化参数
        System.out.println("返回 ServletConfig 对象");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException
    {//每次请求，都会调用一次 service() 方法
        //设置字符集
        servletResponse.setContentType("text/html;charset=UTF-8");
        //使用PrintWriter.write()方法向前台页面输出内容
        PrintWriter writer = servletResponse.getWriter();
        writer.write("hello!!!!!!!!!!");
        writer.close();
    }

    @Override
    public String getServletInfo()
    {//返回关于 Servlet 的信息，例如作者、版本、版权等
        System.out.println("返回关于 Servlet 的信息，例如作者、版本、版权等");
        return null;
    }

    @Override
    public void destroy()
    {
     //Servelet 被销毁时调用
        System.out.println("销毁！");
    }
}
