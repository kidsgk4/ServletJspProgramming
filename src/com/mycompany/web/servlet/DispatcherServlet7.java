package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mycompany.web.dto.Counter;

public class DispatcherServlet7 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//application 범위에 객체를 저장
		Counter applicationCounter=new Counter();
		ServletContext sc=request.getServletContext();
		
		if(sc.getAttribute("applicationCounter")==null) { //데이터를 가져와 보고 가져온게 없다면 새로 설정
			sc.setAttribute("applicationCounter", applicationCounter);
		}
		
		//session 범위에 객체를 저장
		HttpSession session=request.getSession();
		
		if(session.getAttribute("sessionCounter")==null) {
			Counter sessionCounter=new Counter();
			session.setAttribute("sessionCounter", sessionCounter);
		}
		
		//request 범위에[ 객체를 저장
		if(request.getAttribute("requestCounter")==null) {
			Counter requestCounter=new Counter();
			request.setAttribute("requestCounter", requestCounter);
		}
		
//		//포워드
		RequestDispatcher rd=request.getRequestDispatcher("/dispatcher8");
		rd.forward(request, response);
	}
}





