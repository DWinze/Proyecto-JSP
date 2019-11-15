<%@page import="principal.LucaAlberto"%>
 <%@ page language="java" contentType="text/html;
  charset=ISO-8859-1" 
 pageEncoding="ISO-8859-1"%>
 <html>
<head>
<%
LucaAlberto la = new LucaAlberto();


%>

</head>
<body>
<h1>
    El ataque de las bases de datos 
    </h1>
<p>

<% out.print(la.getVida()); %>
</p>
</body>
</html>