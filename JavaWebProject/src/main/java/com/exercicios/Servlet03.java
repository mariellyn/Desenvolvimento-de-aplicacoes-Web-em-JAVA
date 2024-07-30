package com.exercicios;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet03 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String num1Str = request.getParameter("num1");
            String num2Str = request.getParameter("num2");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Servlet03</title></head>");
            out.println("<body>");
            
            try {
                // Verifica se ambos parâmetros foram fornecidos
                if (num1Str != null && num2Str != null) {
                    // Converte os parâmetros para números
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);
                    
                    // Calcula a soma
                    int sum = num1 + num2;
                    
                    // Exibe o resultado
                    out.println("<h1>Resultado da Soma</h1>");
                    out.println("<p>A soma de " + num1 + " e " + num2 + " é " + sum + ".</p>");
                } else {
                    out.println("<h1>Erro</h1>");
                    out.println("<p>Por favor, forneça dois números válidos como parâmetros 'num1' e 'num2'.</p>");
                }
            } catch (NumberFormatException e) {
                out.println("<h1>Erro</h1>");
                out.println("<p>Certifique-se de que ambos os parâmetros 'num1' e 'num2' são números válidos.</p>");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }
}
