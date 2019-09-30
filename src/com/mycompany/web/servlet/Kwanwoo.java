package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Kwanwoo extends HttpServlet{
	private String x;
	private String y;
	@Override
	public void init(ServletConfig config) throws ServletException {
		x=config.getInitParameter("x");
		y=config.getInitParameter("y");
		System.out.println("실행");
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("서블릿실행");
		int x1=Integer.parseInt(x);
		int y1=Integer.parseInt(y);
		int result=(x1+y1);
		System.out.println(result);
	}
}
