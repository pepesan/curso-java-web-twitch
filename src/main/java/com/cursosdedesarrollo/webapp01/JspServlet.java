package com.cursosdedesarrollo.webapp01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(
        name = "JspServlet",
        urlPatterns = "/jsp",
        loadOnStartup = 1
)
public class JspServlet extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
        String datos = "Algunos datos"; // Definimos una string
        Integer numero = 12; // Definimos un número
        String cadena = "Hola Youtube";
        request.setAttribute("data", datos); // pasamos mediante la request el atributo
        request.setAttribute("numero", numero); // Aquí pasamos el otro atributo
        request.setAttribute("saludo", cadena);
        request.getRequestDispatcher("/WEB-INF/page.jsp") // definimos el jsp a presentar
                .forward(request, response); // hacemos el forward pasándole la petición y la respuesta
    }
}
