<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa criada !</title>
</head>
<body>
	<c:if test="${not empty empresa }">
		Empresa Cadastrada com sucesso!
		<br> o nome dela é ${ empresa }
	</c:if>
	<c:if test="${empty empresa }">
		nenhuma empresa cadastrada
	</c:if>

	
</body>
</html>
