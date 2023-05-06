<%--
  Created by IntelliJ IDEA.
  User: pepesan
  Date: 6/5/23
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Ejemplo de JSP con datos</h2>
<p><a href="${pageContext.request.contextPath}/index.jsp">Inicio</a> </p>
<p>The data from servlet: ${data}</p> <!-- presentamos la variable data -->
<p>Numero pasado a la vista: ${numero}</p> <!-- presentamos la variable numero -->
<p>Saludo: ${saludo}</p>
</body>
</html>
