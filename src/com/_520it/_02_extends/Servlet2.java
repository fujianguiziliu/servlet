package com._520it._02_extends;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public  class Servlet2 extends HttpServlet{

	//1直接写httpservlet中带有http请求跟响应的service
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {	
		super.service(req, resp);
	}
	//2使用doget方法调用dopost，然后在dopost方法执行具体逻辑

	/*protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}*/

	//3使用dopost方法调用doget，然后在doget方法执行具体逻辑
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doGet(req, resp);
	}
	
	
	
	
	
	
	
	
	
}
