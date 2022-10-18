<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Professores</title>
<link rel="stylesheet" href="estilo.css">
</head>
<body>
	<h1>Cadastro</h1>
	<a href="adicionar.jsp">Adicionar</a>
	<h2>Bem-vindo ${name}</h2>
	<h2>${error}</h2>
	<table>
		<tr>
			<th>Nomes dos Professores</th>
			<th>Email</th>
			<th>Matriculas</th>
		</tr>
		<tr>
			<td>${nome}</td>
			<td>${email}</td>
			<td>${matriculas}</td>
		</tr>
	</table>
	<a href="sair.jsp">Sair</a>
</body>
</html>