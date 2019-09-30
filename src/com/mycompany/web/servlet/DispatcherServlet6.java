package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet6 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DispatcherServlet6 doGet 실행");
		
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		
		//request 에 setAttribute 로 저장하느 이유?
		//이 jsp 에서 바로 데이터를 줄수있는 방법이ㅇ없음 그럼어케?
		//공유객체 (request) 서블릿에서도 쓰고 jsp 에서도 쓰고
		request.setAttribute("title", title);
		request.setAttribute("content", content);
		
		//공유객체 통해서 jsp에 데이터 넘겨줌 (포워드)
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/dispatcher6.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DispatcherServlet6 doPost 실행");
		
		//요청 내용 UTF-8 로 변환
		//request.setCharacterEncoding("UTF-8"); 필터에서 정의했으니 필없음 , 필터로 정의하는 이유  인코딩타입에 따라 수정할것도 많고 작성할것도 많으니 전처리해서 나눠주는게 
		//유지보수성 좋음
		
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		
		//request 에 setAttribute 로 저장하느 이유?
		//이 jsp 에서 바로 데이터를 줄수있는 방법이ㅇ없음 그럼어케?
		//공유객체 (request) 서블릿에서도 쓰고 jsp 에서도 쓰고
		request.setAttribute("title", title);
		request.setAttribute("content", content);
		
		//공유객체 통해서 jsp에 데이터 넘겨줌 (포워드)
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/dispatcher6.jsp");
		rd.forward(request, response);
	}
	
}
