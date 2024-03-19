
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.hackandboss.ejerciciovotaciones.logica.Voto"%>
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
        
        <div class="container mt-4">
            
            <!-- RadioButton -->
            <h1 class="d-flex justify-content-center mb-2">Votaciones</h1>
            <form action="VotoSV" method="post" class="d-flex flex-column align-content-center flex-wrap">
                <div class="option">
                    <input type="radio" id="option1" name="vote" value="A">
                    <label for="option1">Party A</label>
                </div>
                <div class="option">
                    <input type="radio" id="option2" name="vote" value="B">
                    <label for="option2">Party B</label>
                </div>
                <div class="option">
                    <input type="radio" id="option3" name="vote" value="C">
                    <label for="option3">Party C</label>
                </div>
                <button type="submit" class="btn btn-primary">Votar</button>
            </form>
            
            
            <!-- Button "mostrar resultados -->
            <form action="VotoSV" method="get" class="mt-5 d-flex flex-column align-content-center flex-wrap">
                <button type="submit" class="btn btn-success">Mostrar resultados</button>
            </form>
            
            
            <!-- Tabla de resultados -->
            <div class="container mt-5">
                <% if (request.getAttribute("resultados") != null) { %>
                    <h2>Resultados de la Votación:</h2>
                    <table class="table mt-3">
                        <thead>
                            <tr>
                                <th>Candidato</th>
                                <th>Votos Totales</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% 
                            Map<String, Long> votosPartidos = (Map<String, Long>) request.getAttribute("resultados");
                            for (Map.Entry<String, Long> partido : votosPartidos.entrySet()) { 
                            %>
                                <tr>
                                    <td>Partido <%= partido.getKey() %></td>
                                    <td><%= partido.getValue() %></td>
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
