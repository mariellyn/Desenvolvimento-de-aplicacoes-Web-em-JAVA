package com.exercicios;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet05", urlPatterns = {"/Servlet05"})
public class Servlet05 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Calculadora Simples</h2>");
        out.println("<form method='post' action='Servlet05'>");
        out.println("Número 1: <input type='text' name='num1'><br>");
        out.println("Número 2: <input type='text' name='num2'><br>");
        out.println("Operação: ");
        out.println("<select name='operation'>");
        out.println("<option value='add'>Adicionar</option>");
        out.println("<option value='subtract'>Subtrair</option>");
        out.println("<option value='multiply'>Multiplicar</option>");
        out.println("<option value='divide'>Dividir</option>");
        out.println("</select><br>");
        out.println("<input type='submit' value='Calcular'>");
        out.println("</form>");
        
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operation = request.getParameter("operation");

        if (num1Str != null && num2Str != null && operation != null) {
            try {
                double num1 = Double.parseDouble(num1Str);
                double num2 = Double.parseDouble(num2Str);
                double result = 0;

                switch (operation) {
                    case "add":
                        result = num1 + num2;
                        break;
                    case "subtract":
                        result = num1 - num2;
                        break;
                    case "multiply":
                        result = num1 * num2;
                        break;
                    case "divide":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            out.println("<p>Não é possível dividir por zero.</p>");
                            out.println("</body></html>");
                            return;
                        }
                        break;
                }
                
                out.println("<h3>Resultado: " + result + "</h3>");
            } catch (NumberFormatException e) {
                out.println("<p>Por favor, insira números válidos.</p>");
            }
        }

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}

