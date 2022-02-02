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
		<fmt:formatDate value="${empresa.dataAbertura }"/>
			<li>${empresa.nome}<fmt:formatDate value="${empresa.dataAbertura }"/></li>
		</c:forEach>
	</ul>

</body>
</html>