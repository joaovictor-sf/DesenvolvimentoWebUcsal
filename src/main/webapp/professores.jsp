<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Professores</title>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body>
		
	<div id="main2"> 
		<h1>Cadastro</h1>
		<br>
		<h2>Bem-vindo ${name}</h2>
		<a href="adicionar.jsp" class="link">Adicionar</a>
		<table>
			<tr>
				<th>Nome do professor</th>
				<th>Email</th>
				<th>Matricula</th>
			</tr>
			<tr>
				<td>${nome}</td>
				<td>${email}</td>
				<td>${matriculas}</td>
			</tr>
		</table>
		<a href="sair.jsp" class="link">Sair</a>
	</div>
</body>
</html>