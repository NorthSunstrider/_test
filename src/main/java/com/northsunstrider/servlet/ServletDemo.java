package com.northsunstrider.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: servlet实例<br/>
 *               1.新建一个类继承自httpServlet<br/>
 *               2.在web.xml文件中配置servlet<br/>
 *               <servlet> <servlet-name>HelloWorld</servlet-name>
 *               <servlet-class>com.northsunstrider.servlet.HelloWorld</servlet-class>
 *               </servlet>
 * 
 *               <servlet-mapping> <servlet-name>HelloWorld</servlet-name>
 *               <url-pattern>/HelloWorld</url-pattern> </servlet-mapping>
 * @author: North
 * @date: 2018年5月18日 下午3:54:47
 */
public class ServletDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置响应内容类型
		response.setContentType("text/html");

		// 实际的逻辑是在这里
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello World</h1>");
	}

}
