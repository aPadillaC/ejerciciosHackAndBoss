
package com.hackandboss.ejerciciovotaciones.servlets;

import com.hackandboss.ejerciciovotaciones.logica.Controladora;
import com.hackandboss.ejerciciovotaciones.logica.Voto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "VotoSV", urlPatterns = {"/VotoSV"})
public class VotoSV extends HttpServlet {
    
    private Controladora control = new Controladora();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
        Map<String, Long> votosPartidos = control.totalVoto();
        
        // Enviamos la respuesta con el nombre "resultados"
        request.setAttribute("resultados", votosPartidos);
        
        
        //Redirigimos de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String selectedOption = request.getParameter("vote");
        
        if (selectedOption != null && !selectedOption.isEmpty()) {
            
            Voto voto = new Voto();
            
            voto.setPartido(selectedOption);
            
            control.crearVoto(voto);
            System.out.println("Voto seleccionado: " + selectedOption);
            response.sendRedirect("index.jsp");
        } else {
          response.sendRedirect("index.jsp?message=Por+favor+selecciona+una+opción+antes+de+votar.");
        }
    }

}
