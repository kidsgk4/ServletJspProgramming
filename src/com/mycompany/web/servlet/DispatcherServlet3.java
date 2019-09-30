package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet3 extends HttpServlet{
	
	//service재정의할떄: 요청방식에 상관없이
	//doget:get방식으로 요청하겠따
	//doPost:post방식으로 요청
	//doGet,doPost 둘다 재정의: 두겟은 이렇게 두포스트는 저렇게
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dispatcher servlet 3 service run");
	
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dispatcher servlet 3 doGet run");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dispatcher servlet 3 doPost run");
	}
}
