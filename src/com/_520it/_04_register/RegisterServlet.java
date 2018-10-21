package com._520it._04_register;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regist")
public class RegisterServlet extends HttpServlet{

	
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {	
		//name
		String username = req.getParameter("username");
		System.out.println(username);
		//
		String[] hobbies = req.getParameterValues("hobby");
		System.out.println(Arrays.toString(hobbies));
		
		Map<String, String[]> parameterMap = req.getParameterMap();
		
	
		Enumeration<String> parameterNames = req.getParameterNames();
		while (parameterNames.hasMoreElements()) {
			System.out.println(parameterNames.nextElement());
		}
	}
}
