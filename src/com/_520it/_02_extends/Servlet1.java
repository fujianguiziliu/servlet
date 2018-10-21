package com._520it._02_extends;



import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;




 public  class Servlet1 extends MyHttpServlet{

	public void doGet(HttpServletRequest request, HttpServletRequest response) {		
		super.doGet(request, response);
	}
	 
	public void doPost(HttpServletRequest request, HttpServletRequest response) {
		super.doPost(request, response);
	}
	
	/*public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
	super.init(config);
	System.out.println("子类初始化");
}

public void service(ServletRequest req, ServletResponse res)
		throws ServletException, IOException {
	String encoding =super.getInitParameter("encoding");
	System.out.println(encoding);
}*/


	
}
