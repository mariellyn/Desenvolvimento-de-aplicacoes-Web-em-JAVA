<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Parâmetros da Requisição</title>
</head>
<body>
    <h1>Parâmetros da Requisição</h1>
    <p>Parâmetros Recebidos:</p>
    <ul>
        <%
            // Obtém todos os parâmetros da requisição
            java.util.Enumeration<String> paramNames = request.getParameterNames();
            while (paramNames.hasMoreElements()) {
                String paramName = paramNames.nextElement();
                String paramValue = request.getParameter(paramName);
        %>
        <li><strong><%= paramName %>:</strong> <%= paramValue %></li>
        <%
            }
        %>
    </ul>
</body>
</html>
