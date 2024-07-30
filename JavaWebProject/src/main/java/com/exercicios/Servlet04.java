package com.exercicios;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "Servlet04", urlPatterns = {"/Servlet04"})
public class Servlet04 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        var out = response.getWriter();

        HttpSession session = request.getSession();

        // Obtemos o nome do parâmetro da requisição, se disponível
        String name = request.getParameter("username");

        if (name != null && !name.isEmpty()) {
            // Se um nome for fornecido, armazenamos na sessão
            session.setAttribute("username", name);
        } 

        // Recuperamos o nome da sessão
        name = (String) session.getAttribute("username");
        if (name == null || name.isEmpty()) {
            // Se não há nome na sessão, usamos "Visitante" como padrão
            name = "Visitante";
            session.setAttribute("username", name);
        }

        // Exibe a mensagem de boas-vindas
        out.println("<html><body>");
        out.println("<h1>Bem-vindo, " + name + "!</h1>");
        out.println("</body></html>");
    }
}


