<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
The student registration is confirmed: ${param.firstname} ${param.lastname}
	<br/>
	Welcome <%= request.getParameter("firstname") %> <%= request.getParameter("lastname") %>
	<p>You are from ${param.country}</p>
	Your State:  ${param.state }
	<%-- <ul>
		<%
			String[] native = request.getParameterValues("state");
			for (String element : native) {
				out.println(element);
			}
		%>
	
	</ul> --%>
</body>
</html>