package com.exercicios;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet06", urlPatterns = {"/Servlet06"})
public class Servlet06 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();

        Integer visitCount = (Integer) session.getAttribute("visitCount");
        if (visitCount == null) {
            visitCount = 0;
        }
        visitCount++;
        session.setAttribute("visitCount", visitCount);

        out.println("<html><body>");
        out.println("<h2>Contador de Visitas</h2>");
        out.println("<p>Número de Visitas: " + visitCount + "</p>");
        out.println("<form method='post' action='Servlet06'>");
        out.println("<input type='submit' name='reset' value='Resetar Contador'>");
        out.println("</form>");

        if (request.getParameter("reset") != null) {
            session.setAttribute("visitCount", 0);
            out.println("<p>Contador resetado!</p>");
        }

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
