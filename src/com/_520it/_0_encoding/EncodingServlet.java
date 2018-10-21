package com._520it._0_encoding;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class EncodingServlet extends HttpServlet{


	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String username =req.getParameter("username");
		byte[] bytes = username.getBytes("ISO8859-1");
		username = new String(bytes,"UTF-8");
		System.out.println(username);
	}
	
}
