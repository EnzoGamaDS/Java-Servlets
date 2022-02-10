<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> 
<title>Empresas cadastradas</title>
</head>
<body>
	Lista de empresas :
	<br>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura }"/></li>
			<a href="/gerenciador/editarEmpresa?id=${empresa.id}">editar</a>
			<a href="/gerenciador/deletarEmpresas?id=${empresa.id}">Remover</a>
		</c:forEach>
	</ul>

</body>
</html>