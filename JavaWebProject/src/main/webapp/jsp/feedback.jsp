<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Coleta de Feedback</title>
</head>
<body>
    <h2>Coleta de Feedback</h2>
    <%
        String name = request.getParameter("name");
        String feedback = request.getParameter("feedback");

        if (name != null && feedback != null) {
            out.println("<p>Obrigado pelo seu feedback, " + name + "!</p>");
            out.println("<p>Seu feedback: " + feedback + "</p>");
        }
    %>
    <form method="get" action="feedback.jsp">
        <label for="name">Nome:</label>
        <input type="text" id="name" name="name" required /><br/>
        <label for="feedback">Feedback:</label>
        <textarea id="feedback" name="feedback" rows="4" cols="50" required></textarea><br/>
        <input type="submit" value="Enviar Feedback" />
    </form>
</body>
</html>
