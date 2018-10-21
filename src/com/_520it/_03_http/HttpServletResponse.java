package com._520it._03_http;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/res")
public class HttpServletResponse extends HttpServlet{

	
	protected void service(HttpServletRequest req,
			javax.servlet.http.HttpServletResponse resp)
			throws ServletException, IOException {
		
		//获取响应流
		//OutputStream out = resp.getOutputStream();
		//向客户端输出数据
		//out.write("paol".getBytes());
		
		//resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("你好啊");
		printWriter.println("nihaoa");
		
		
		
		
		
		
	}
}
