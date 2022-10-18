<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Novo</title>
		<link rel="stylesheet" href="estilo.css">
	</head>
	<body>
		<h2>Adicionar professor</h2>
		<form action="./Novo" method="post">
			Nome: <input type="text" name="pessoas" required>
			Email: <input type="email" name="email" required>
			Matricula: <input type="text" name="matricula"required>
			<button type="submit">Enviar</button>
			<a href="professores">Voltar a agenda</a>
		</form>
	</body>
</html>