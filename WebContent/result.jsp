<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <%
      //Scriptlet
     String user=(String) session.getAttribute("user");
     String password=(String)session.getAttribute("pass");
     
     String user1=(String)application.getAttribute("user");
     String password1=(String)application.getAttribute("pass");
     
     String user2=(String)request.getAttribute("user");
     String password2=(String)request.getAttribute("pass");
     
     
   %>
   <div style="padidng:10px;
   background-color: yellow; color: blue; font-size: 10px;">
    User is ,<%=user%> <br/>
    Password is, <%=password%><br/>
    <u>Application variables</u><br/>
     User is ,<%=user1%> <br/>
    Password is, <%=password1%><br/>
     <u>Request variables</u><br/>
     User is ,<%=user2%> <br/>
    Password is, <%=password2%><br/>
   </div>
   
   <p>
   <B><u>Programmers</u></B> <br>
   <ul>
      <%
      List<String> l=(List<String>)request.getAttribute("programmers");
      for(String temp:l){
      %>
      <li><%=temp%></li>
      <%
      }
      %>
   </ul>
   
   </p>
</body>
</html>