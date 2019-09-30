<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>dispatcher5.jsp</h4>
			
		name:<%=application.getAttribute("name")%><br/>
		age:<%=application.getAttribute("age")%> <br/>
		<%--HOW1 
		
		name:<%=request.getAttribute("name")%><br/>
		age:<%=request.getAttribute("age")%> <br/>
--%>			
		<%--HOW2(Expression Language =EL --%>
		name: ${name} <br/>
		age:${age}<br/>
</body>
</html>

