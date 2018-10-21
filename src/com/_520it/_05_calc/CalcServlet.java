package com._520it._05_calc;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet{


	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;text/html; charset=UTF-8");
		String sNum1 = req.getParameter("num1");
		String sNum2 = req.getParameter("num2");
		String op = req.getParameter("op");
		int num1=0;
		int num2=0;
		
		if (hasLength(sNum1) && hasLength(sNum2)) {
			num1=Integer.valueOf(sNum1);
			num2=Integer.valueOf(sNum2);
		}
		int ret=0;
		if ("+".equals(op)) {
			ret = num1+num2;
			
		}else if ("-".equals(op)){
			ret =num1-num2;
		}
		/*int ret =0;
		if ("+".equals(op)) {
			ret = num1+num2;
			
		}else if ("-".equals(op)){
			ret =num1-num2;
		}else if ("*".equals(op)) {
			ret =num1 * num2;
		}else {
			ret =num1 / num2;
		}*/
		
		PrintWriter writer = resp.getWriter();
		
		writer.write("<form action='/pss/calc' method='POST'>");
		writer.write("<input type='text' name='num1' value='"+num1+"'/>");
		writer.write("<select>'name='op");
		writer.write("<option>+</option>");
		writer.write("<option>-</option>");
		writer.write("<option>*</option>");
		writer.write("<option>/</option>");
		writer.write("</select>");
		writer.write("<input type='text' name='num2' value='"+num2+"'/>");
		writer.write("<input type='submit' value='='/>");
		writer.write("<input type='text' name='ret' value='"+ret+"'/>");
		writer.write("</form>");
			
		
		
	}
	
	private boolean hasLength(String str){
		return  str != null && !"".equals(str.trim());
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
