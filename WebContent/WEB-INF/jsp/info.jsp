<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><u>People</u></h1>
<ul>
   <%
    String[] people= (String[]) request.getAttribute("people");
    for(String x:people){
   %>
   <li><%=x%></li>
   <%} %>
 </ul>
</body>
</html>