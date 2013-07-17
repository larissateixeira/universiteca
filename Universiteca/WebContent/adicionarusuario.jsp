<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Universiteca - Adicionar Usuario</title>
</head>
<body>
	<form action="AdicionarUsuario" method="post">
	    <label>Nome</label>
	    <input type="text" placeholder="Nome" name="nome">
	   
	    <label>CPF</label>
	    <input type="text" placeholder="CPF" name="cpf">

	    <label>Senha</label>
	    <input type="password" placeholder="Senha" name="senha">

	    <button type="submit" class="btn">Enviar</button>
	 
	</form>
</body>
</html>