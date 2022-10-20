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
		<link rel="stylesheet" href="css/estilo.css">
	</head>
	<body>
		<div id="main3"> 
			<h2>Adicionar professor</h2>
			<form action="./Novo" method="post" id="formula">
				Nome: <input type="text" name="pessoas">
				Email: <input type="email" name="email">
				Matricula: <input type="text" name="matricula">
				<div id="botoes">
					<button type="submit" id="botao">Enviar</button>
					<a href="professores.jsp">Voltar o cadastro dos professores</a>
				</div>
			</form>
		</div>
	</body>
</html>