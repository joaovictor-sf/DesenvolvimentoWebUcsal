<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Saiu</title>
		<link rel="stylesheet" href="estilo.css">
	</head>
	<body>
		
		<%
			session.removeAttribute("usuario");
			session.invalidate();
		%>
		
		<h1>Sessão Finalizada</h1>
		<a href="index.jsp">Logar novamente!</a>
	</body>
</html>