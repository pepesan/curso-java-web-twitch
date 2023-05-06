package com.cursosdedesarrollo.webapp01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
@WebServlet(
        name = "JstlServlet",
        urlPatterns = {"/jstl"},
        loadOnStartup = 1
// , asyncSupported = false
)

public class JstlServlet extends HttpServlet {
        @Override
        protected void doGet(
                HttpServletRequest request,
                HttpServletResponse response)
                throws IOException, ServletException {
            String datos = "Algunos datos";
            request.setAttribute("data", datos);
            Boolean bool = true;
            request.setAttribute("bool", bool);
            List<String> listado = new LinkedList<>();
            listado.add("Hola");
            listado.add("Mundo");
            request.setAttribute("list", listado);
            request.getRequestDispatcher("/WEB-INF/jstl.jsp").forward(request, response);

        }

}