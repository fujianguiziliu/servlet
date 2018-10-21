package com._520it._02_extends;

import java.io.IOException;
import java.io.Serializable;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

abstract public class MyGenericServlet 
	implements Servlet,ServletConfig,Serializable{

	private static final long serialVersionUID=1L;
	private ServletConfig config ;
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		
	}
	
	
	abstract public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException; 
		
	
	
	public ServletConfig getServletConfig() {
		return this.config;
	}
	

	public String getServletInfo() {
		return null;
	}

	
	public void destroy() {
		
	}


	public String getServletName() {
		
		return this.config.getServletName();
	}

	public String getInitParameter(String name) {
		
		return this.config.getInitParameter(name);
	}


	public ServletContext getServletContext() {
	
		return this.config.getServletContext();
	}


	public Enumeration<String> getInitParameterNames() {
		
		return this.config.getInitParameterNames();
	}



	
}
