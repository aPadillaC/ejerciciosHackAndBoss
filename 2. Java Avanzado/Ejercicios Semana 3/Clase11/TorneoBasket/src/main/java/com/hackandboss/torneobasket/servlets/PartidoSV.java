
package com.hackandboss.torneobasket.servlets;

import com.hackandboss.torneobasket.logica.Controladora;
import com.hackandboss.torneobasket.logica.Equipo;
import com.hackandboss.torneobasket.logica.Partido;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "PartidoSV", urlPatterns = {"/PartidoSV"})
public class PartidoSV extends HttpServlet {
    
    Controladora control = new Controladora();
    

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Partido> listaPartidos = control.listaPartidos();
        
        // Enviamos la respuesta con el nombre "resultados"
        request.setAttribute("resultadosPartidos", listaPartidos);
               
        
        //Redirigimos de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        DateTimeFormatter  formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate fecha = null;
        fecha = LocalDate.parse(request.getParameter("fecha"));
        int id1 = Integer.parseInt(request.getParameter("idEquipo1"));
        int id2 = Integer.parseInt(request.getParameter("idEquipo2"));
        int res1 = Integer.parseInt(request.getParameter("res1"));
        int res2 = Integer.parseInt(request.getParameter("res2"));

            
        Partido partido = new Partido();
        
        System.out.println("fecha " + formatoFecha);


        Equipo equipo1 = control.buscarEquipo(id1);        
        Equipo equipo2 = control.buscarEquipo(id2);

        partido.setEquipo1(equipo1);        
        partido.setEquipo2(equipo2);

        partido.setFecha(fecha);
        
        partido.setResEquip1(res1);        
        partido.setResEquip2(res2);

        control.crearPartido(partido);

        System.out.println("Partido creado: " + partido.toString());
        response.sendRedirect("index.jsp");
    }

    
    
}
