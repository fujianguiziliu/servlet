package com._520it._02_extends;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class MyHttpServlet extends MyGenericServlet{
	
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		HttpServletRequest 	request = (HttpServletRequest) req;
		HttpServletResponse response =(HttpServletResponse) res;
		service(request, response);
	}
	public void service(HttpServletRequest request, HttpServletRequest response)
			throws ServletException, IOException {
		String method = request.getMethod();
		if ("GET".equals(method)) {
			doGet(request,response);
		}else if ("POST".equals(method)) {
			doPost(request,response);
		}
			
		}
	public void doPost(HttpServletRequest request, HttpServletRequest response) {
		
		
	}
	public void doGet(HttpServletRequest request, HttpServletRequest response) {
		
		
	}
	

}
