<%--
// index.jsp
//
// EIF209 - Programación 4 – Proyecto #2
// Junio 2020
//
// Autores:
// - 402380848 Grelvin Morales  
// - 116800742 Sebastian Grisati 
//
//
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>La Pizza de tu MAMA</title>
        <link href="tiempo.css" rel="stylesheet" type="text/css"/>
        <script src="js/getJSON.js" type="text/javascript"></script>
        <script src="js/menuscript.js" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/js/all.min.js" charset="utf-8"></script>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Poppins&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Oswald:wght@700&family=Work+Sans&display=swap" rel="stylesheet"> 
    </head>
    <body onload="cargarTiempo();">
        <!-----------------INICIO NAVBAR---------------->
        <div class="navbar-container">
            <div class="nav-contenido">
                <!--logo-->
                <div class="logo">
                    <a href="index.jsp"><img src="imagenes/logo.png"></a>
                </div>
                <!--menu-->
                <div class="menu">
                    <ul>

                        <li><a href="menu.jsp"><i class="fas fa-pizza-slice"></i>&nbsp;Menú</a></li>
                        <li><a href="#">Mis pedidos</a></li>
                        <li><a href="login.jsp">Ingresar</a></li>
                    </ul>
                </div>
                <!--Carrito-->
                <div class="carro">

                    <a href="#"> <img src="imagenes/carrito.png"> </a>
                </div>
            </div>
        </div>
        <!-----------------FIN NAVBAR---------------->

        <!-----------------COMIENZA LA PARTE DEL CONTENIDO---------------->
        <div class="contenido-container">
            <!-----------------INICIO CONTENIDO---------------->
            <div class="pizzas">
                <p>Su Orden estará lista en </p>
            </div>
            <div class="contenido">
                <!-------------------FILA 1-------------------->
                <div class="first-row">
                    <div class="new">
                        <p id="entregaTime"></p>
                    </div>
                    <!----------------------------------------->                   
                </div>
            </div>
        </div>
    </div>
</body>
</html>
