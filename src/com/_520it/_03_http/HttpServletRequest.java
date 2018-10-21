package com._520it._03_http;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import com._520it._02_extends.MyHttpServlet;


@WebServlet("/req")
public class HttpServletRequest extends HttpServlet{
	@Override
	protected void service(javax.servlet.http.HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
	String method=req.getMethod();
	System.out.println(method);
	System.out.println(req.getRequestURI());
	System.out.println(req.getRequestURL());
	System.out.println(req.getContextPath());
	
	
	System.out.println(req.getRemoteAddr());
	System.out.println(req.getHeader("User-Agent"));
	Enumeration<String> headerNames = req.getHeaderNames();
	}

	
}
