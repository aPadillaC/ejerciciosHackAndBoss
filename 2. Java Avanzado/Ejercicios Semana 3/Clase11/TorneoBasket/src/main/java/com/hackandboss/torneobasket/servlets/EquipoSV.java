
package com.hackandboss.torneobasket.servlets;

import com.hackandboss.torneobasket.logica.Controladora;
import com.hackandboss.torneobasket.logica.Equipo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EquipoSV", urlPatterns = {"/EquipoSV"})
public class EquipoSV extends HttpServlet {
    
    Controladora control = new Controladora();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Equipo> listaEquipos = control.listaEquipos();
        
        // Enviamos la respuesta con el nombre "resultados"
        request.setAttribute("resultados", listaEquipos);
        
        
        //Redirigimos de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String ciudad = request.getParameter("ciudad");
        
        if( !nombre.isEmpty() && !ciudad.isEmpty()) {
            
            Equipo equipo = new Equipo();
            
            equipo.setName(nombre);
            equipo.setCuidad(ciudad);
            
            control.crearEquipo(equipo);
            
            System.out.println("Equipo creado: " + equipo);
            response.sendRedirect("index.jsp");
        }

    }

   
}
