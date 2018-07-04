package com.northsunstrider.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: servlet实例<br/>
 *               访问路径：localhost:port/项目名/servletByAnotation
 * @author: North
 * @date: 2018年5月18日 下午3:54:47
 */
@WebServlet(name = "servletByAnotation", urlPatterns = { "/servletByAnotation" }, loadOnStartup = 1)
public class ServletByAnotation extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置响应内容类型
		response.setContentType("text/html");

		// 实际的逻辑是在这里
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello World</h1>");
	}

}
