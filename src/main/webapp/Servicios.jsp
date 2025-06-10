<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotel Roshar</title>
<link rel="icon" href="imagenes/logoHotel.png" />
<link rel="stylesheet" href="styles/style.css" >
<link rel="stylesheet" href="styles/style_servicios.css" >
</head>
<body>
<%@include file="includes/cabecera.jsp" %>
<%@include file="includes/menu.jsp" %>

<main>
    <section class="servicios-container">
        <h1>Servicios Exclusivos para Ti</h1>
        <p class="introduccion">En Hotel Roshar nos preocupamos por tu comodidad y experiencia. Descubre todo lo que ofrecemos para que tu estancia sea inolvidable.</p>
        
        <div class="servicios-grid">
            <article class="servicio">
                <img src="imagenes/spa.png" alt="Spa" class="icono-servicio">
                <h2>Spa y Bienestar</h2>
                <p>Relájate y renueva energías con nuestros tratamientos exclusivos, sauna y masajes profesionales.</p>
            </article>
            <article class="servicio">
                <img src="imagenes/piscina.png" alt="Piscina" class="icono-servicio">
                <h2>Piscina Climatizada</h2>
                <p>Disfruta de nuestra piscina durante todo el año con áreas de descanso y bar.</p>
            </article>
            <article class="servicio">
                <img src="imagenes/restaurante.png" alt="Restaurante" class="icono-servicio">
                <h2>Restaurante Gourmet</h2>
                <p>Saborea platos internacionales y locales preparados por chefs reconocidos.</p>
            </article>
            <article class="servicio">
                <img src="imagenes/gimnasio.png" alt="Gimnasio" class="icono-servicio">
                <h2>Gimnasio Equipado</h2>
                <p>Mantente en forma con nuestro gimnasio moderno y personal trainer disponible.</p>
            </article>
            <article class="servicio">
                <img src="imagenes/wifi.png" alt="Wi-Fi" class="icono-servicio">
                <h2>Wi-Fi Gratis</h2>
                <p>Conéctate desde cualquier punto del hotel con nuestra red rápida y segura.</p>
            </article>
            <article class="servicio">
                <img src="imagenes/conserjeria.png" alt="Conserjería" class="icono-servicio">
                <h2>Conserjería 24h</h2>
                <p>Asistencia personalizada para reservas, tours y cualquier necesidad durante tu estancia.</p>
            </article>
        </div>
    </section>
</main>

<%@include file="includes/pie.jsp" %>
</body>
</html>