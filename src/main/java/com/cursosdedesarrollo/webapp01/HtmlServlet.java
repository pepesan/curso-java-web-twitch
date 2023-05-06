package com.cursosdedesarrollo.webapp01;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "HtmlServlet",
        urlPatterns = {"/html"},
        loadOnStartup = 1
)
public class HtmlServlet extends HttpServlet {


    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        // Definir el tipo de salida
        response.setContentType("text/html;charset=UTF-8");
        ServletOutputStream out = response.getOutputStream();
        // Imprimir datos en la salida HTML
        out.print("<html>" +
                "<head><title>Pagina Servlet</title></head>"+
                "<body><h2>" +
                "Pagina generada desde Un Servlet"+
                "</h2></body>"+
                "</html>");
        // Cerrar la salida
        out.close();
    }
}
