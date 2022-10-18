<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Login</title>
		<link rel="stylesheet" href="estilo.css">
	</head>
	<body>
		<!-- Aqui ficará o login para o funcionario acessar a agenda -->
		<form action="./Login" method="post">
			Usuario: <input name="usuario" type="text" /><br>
			Senha: <input name="senha" type="password" /><br>
			<span style="color: red;">${erro}</span><br>
			<button type="submit">Enviar</button>
		</form>
	</body>
</html>