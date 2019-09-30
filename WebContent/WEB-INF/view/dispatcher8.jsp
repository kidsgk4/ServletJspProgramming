<%@page import="com.mycompany.web.dto.Counter"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>dispatcher8.jsp</h4>
			
		<!--HOW1 자바코드로 표기						(내장변수 ) 이미 저장되있는 변수-->
		<%Counter applicationCounter=(Counter)application.getAttribute("applicationCounter"); %>
		applicationCounter:<%=applicationCounter.getValue()%><br/>
					
		<%Counter sessionCounter=(Counter)session.getAttribute("sessionCounter"); %>
		sessionCounter:<%=sessionCounter.getValue()%><br/>
		
		<%Counter requestCounter=(Counter)request.getAttribute("requestCounter"); %>
		requestCounter:<%=requestCounter.getValue()%><br/><br/>
		<hr/>
		<%--HOW2(Expression Language =EL --%>
		applicationCounter:${applicationCounter.value}<br/>
		sessionCounter:${sessionCounter.value}<br/>
		requestCounter:${requestCounter.value}<br/><br/>
		
</body>
</html>

