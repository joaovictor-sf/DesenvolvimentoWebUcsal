<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<!-- Aqui ficará a tabela(agenda) e um botão com a opção de adicionar nova pessoa
		Talvez colocar botões para editar as pessoas e para excluí-las -->
		<c:if test="usuario == null">
			${response.sendRedirect("index.jsp") }
		</c:if>
		<h1>Agenda</h1>
		<a href="adicionar.jsp">Adicionar</a>
		<table>
			<tr>
				<th>Projeto</th>
				<th>ID</th>
			</tr>
		</table>
		<a href="sair.jsp">Sair</a>
	</body>
</html>