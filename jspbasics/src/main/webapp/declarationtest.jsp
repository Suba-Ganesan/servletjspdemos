<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
		public static String makeItLower(String dat) {
			return dat.toLowerCase();
		}
	%>
	
	Lower case "Hello world": <%= makeItLower("HELLO WORLD") %> <!-- fn call -->
</body>
</html>