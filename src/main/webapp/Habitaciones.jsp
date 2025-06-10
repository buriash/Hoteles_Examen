<%@page import="com.ipartek.modelo.I_Constantes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ipartek.modelo.Habitacion"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
List<Habitacion> listaHabitacion = new ArrayList<>();

if (request.getAttribute(I_Constantes.ATR_LISTA_HABITACIONES) != null) {

	listaHabitacion = (List<Habitacion>) request.getAttribute(I_Constantes.ATR_LISTA_HABITACIONES);

}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>Hotel Roshar</title>
  <link rel="icon" href="imagenes/logoHotel.png" />
  <link rel="stylesheet" href="styles/style.css" >
  <link rel="stylesheet" href="styles/style_habitaciones.css" >
</head>
<body>
<%@include file="includes/cabecera.jsp" %>

   	<%@include file="includes/menu.jsp" %>

    <main>
    <section class="lista-habitaciones">
        <h2>Nuestras Habitaciones</h2>
        <div class="habitaciones-grid">
            <% for (Habitacion hab : listaHabitacion) { %>
                <article class="habitacion-card">
                    <div class="habitacion-foto">
                        <img src="imagenes/hab3.jpg" alt="Habitación <%= hab.getNumeroHabitacion() %>" />
                    </div>
                    <div class="habitacion-info">
                        <h3>Habitación Nº <%= hab.getNumeroHabitacion() %></h3>
                        <p><strong>Metros:</strong> <%= hab.getMetros() %> m²</p>
                        <p><strong>Precio:</strong> $<%= String.format("%.2f", hab.getPrecio()) %></p>
                        <p><strong>Número de camas:</strong> <%= hab.getNumeroCamas() %></p>
                        <p><strong>Exterior:</strong> <%= hab.isExterior() ? "Sí" : "No" %></p>
                    </div>
                </article>
            <% } %>
        </div>
    </section>
</main>

   	<%@include file="includes/pie.jsp" %>
</body>
</html>