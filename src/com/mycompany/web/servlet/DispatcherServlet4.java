package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet4 extends HttpServlet{
	
	//service재정의할떄: 요청방식에 상관없이
	//doget:get방식으로 요청하겠따
	//doPost:post방식으로 요청
	//doGet,doPost 둘다 재정의: 두겟은 이렇게 두포스트는 저렇게
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HOW1
		/*
		//헤드에 실려서 넘어감
		response.setContentType("text/html;charset=UTF-8");
		
		//바디에 실려서 넘어감
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("	<head>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<h4>DispatcherServlet4</h4>");
		out.println("		응답 내용");
		out.println("	</body>");
		out.println("</html>");
		*/
		
		//HOW2
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/dispatcher4.jsp");
		rd.forward(request, response); //forward = 넘어간다
	}
	
}
