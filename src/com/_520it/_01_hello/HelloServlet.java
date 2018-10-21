package com._520it._01_hello;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.tools.JavaCompiler;



//自定义普通servlet
public class HelloServlet implements javax.servlet.Servlet{


	private ServletConfig config ;
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		
	}


	public ServletConfig getServletConfig() {
		return null;

	
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
//		System.out.println("HelloServlet.service() ");
//		String encoding = "UTF-8";
		String encoding = this.config.getInitParameter("encoding");
		if ("UTF-8".equals(encoding)) {
			System.out.println("你好，世界");
		}else if ("ISO5589-1".equals(encoding)){
			System.out.println("hello,world");
		}
		System.out.println("-------------");
		Enumeration<String> enumeration = this.config.getInitParameterNames();
		while (enumeration.hasMoreElements()) {
			String string = enumeration.nextElement();
			System.out.println(string +"---" + this.config.getInitParameter(string));
		}
	}

	@Override
	public String getServletInfo() {

		return null;
	}

	@Override
	public void destroy() {

		
	}

}
