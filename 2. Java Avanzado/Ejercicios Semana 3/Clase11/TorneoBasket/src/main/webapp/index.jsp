
<%@page import="com.hackandboss.torneobasket.logica.Partido"%>
<%@page import="java.util.List"%>
<%@page import="com.hackandboss.torneobasket.logica.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Agregar estilos de Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
        <h1>Formulario</h1>
        <form action="EquipoSV" method="post">
          <div class="form-group">
            <label for="nombre">Nombre:</label>
            <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Ingrese su nombre">
          </div>
          <div class="form-group">
            <label for="ciudad">Ciudad:</label>
            <input type="text" class="form-control" id="ciudad" name="ciudad" placeholder="Ingrese su ciudad">
          </div>
          <button type="submit" class="btn btn-primary" name="guardar">Guardar</button>
        </form>
        
        <hr>
        
        <form action="EquipoSV" method="get">
            <button type="submit" class="btn btn-secondary">Ver Equipos</button>
        </form>
        
        
        <!-- Tabla de equipos -->
        <div class="container mt-5">
            <% if (request.getAttribute("resultados") != null) { %>
                <h2>Listado de equipos:</h2>
                <table class="table mt-3">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Ciudad</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% 
                        List<Equipo> listaEquipos = (List<Equipo>) request.getAttribute("resultados");
                        for ( Equipo equipo : listaEquipos) { 
                        %>
                            <tr>
                                <td><%= equipo.getId() %></td>
                                <td><%= equipo.getName()%></td>
                                <td><%= equipo.getCuidad()%></td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            <% } %>
        </div>
        
        
        <!<!-- Parte de los partidos -->
        
        <h1 class="mt-5">Formulario Partido</h1>
        <form action="PartidoSV" method="post">
          <div class="form-group">
            <label for="fecha">Fecha:</label>
            <input type="text" class="form-control" name="fecha" id="fecha" placeholder="aaaa-mm-dd">
          </div>
          <div class="form-group">
            <label for="equipo1">ID Equipo 1:</label>
            <input type="text" class="form-control" name="idEquipo1" id="idEquipo1" placeholder="ID Equipo 1">
          </div>
          <div class="form-group">
            <label for="equipo2">ID Equipo 2:</label>
            <input type="text" class="form-control" name="idEquipo2" id="idEquipo2" placeholder="ID Equipo 2">
          </div>
          <div class="form-group">
            <label for="resultado1">Resultado Equipo 1:</label>
            <input type="number" class="form-control" name="res1" id="resultado1" placeholder="Resultado Equipo 1">
          </div>
          <div class="form-group">
            <label for="resultado2">Resultado Equipo 2:</label>
            <input type="number" class="form-control" name="res2" id="resultado2" placeholder="Resultado Equipo 2">
          </div>
          <button type="submit" class="btn btn-primary" id="guardar">Guardar</button>
        </form>
            
        <hr>
        
        <form action="PartidoSV" method="get">
            <button type="submit" class="btn btn-secondary">Ver Partidos</button>
        </form>
            
        
        <!-- Tabla de resultados -->
        <div class="container mt-5">
            <% if (request.getAttribute("resultadosPartidos") != null) { %>
                <h2>Listado de equipos:</h2>
                <table class="table mt-3">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Fecha</th>
                            <th>Equipo Local</th>
                            <th>Equipo Visitante</th>
                            <th>Resultado Local</th>
                            <th>Resultado Visitante</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% 
                        List<Partido> listaPartidos = (List<Partido>) request.getAttribute("resultadosPartidos");
                        for ( Partido partido : listaPartidos) { 
                        %>
                            <tr>
                                <td><%= partido.getId() %></td>                  
                                <td><%= partido.getFecha()%></td>
                                <td><%= partido.getEquipo1().getName()%></td>
                                <td><%= partido.getEquipo2().getName()%></td>
                                <td><%= partido.getResEquip1()%></td>
                                <td><%= partido.getResEquip2()%></td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            <% } %>
        </div>
            
            
      </div>       
        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
