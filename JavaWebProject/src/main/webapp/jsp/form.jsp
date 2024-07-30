<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulário</title>
</head>
<body>
    <h1>Formulário de Entrada</h1>
    
    <!-- Exibe a mensagem enviada pelo formulário -->
    <%
        String name = request.getParameter("name");
        if (name != null && !name.isEmpty()) {
    %>
    <p>Obrigado, <%= name %>!</p>
    <%
        }
    %>

    <!-- Formulário HTML -->
    <form action="form.jsp" method="get">
        <label for="name">Nome:</label>
        <input type="text" id="name" name="name" required>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
