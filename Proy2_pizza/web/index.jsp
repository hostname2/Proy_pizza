<%--
// index.jsp
//
// EIF209 - Programación 4 – Proyecto #2
// Junio 2020
//
// Autores:
// - 402380848 Grelvin Morales  
// -  Sebastian Grisati 
//
//
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>La Pizza de tu MAMA</title>
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/js/all.min.js" charset="utf-8"></script>
        <link href="https://fonts.googleapis.com/css2?family=Oswald:wght@700&family=Work+Sans&display=swap" rel="stylesheet"> 
    </head>
    <body>
        <!-----------------INICIO NAVBAR---------------->
        <div class="navbar-container">
            <div class="nav-contenido">
                <!--logo-->
                <div class="logo">
                    <img src="imagenes/logo.png">
                </div>
                <!--menu-->
                <div class="menu">
                    <ul>
                        
                        <li><a href="#"><i class="fas fa-pizza-slice"></i>&nbsp;Menú</a></li>
                        <li><a href="#">Mis pedidos</a></li>
                        <li><a href="#">Ingresar</a></li>
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
                <p>Nuetras Pizzas xd</p>
            </div>
            <div class="contenido">
                <!-------------------FILA 1-------------------->
                <div class="first-row">
                    <div class="new">
                        <p>Hasta pa los come yerva</p>
                        <p>no mate animales</p>
                        <button>VEGANO</button>
                    </div>
                    <!----------------------------------------->
                    <div class="tools">
                        <div class="search">
                            <p>Encuentre las</p><strong>&nbsp;MEJORES&nbsp;</strong><p>Pizzas</p>
                        </div>
                        <div class="order">
                            <a href="#">HAGA <font style="color: #f0ff00">AQUÍ</font> SU ORDEN</a>
                        </div>
                    </div>
                </div>
                <!-------------------FILA 2-------------------->
                <div class="second-row">
                    <!-----------------PIZZA 1------------------>
                    <div class="pizza-1">
                        <div class="nombre">
                            <p>Pizza Jamón y Queso</p>
                        </div>
                        <div class="ingredientes">
                            <p>Aqui los ingredientes</p>
                        </div>
                        <div class="precio">
                            <p>aqui va el precio</p>
                        </div>
                        <div class="ordenar">
                            <button> <i class="fas fa-plus"></i>&nbsp;Añadir al carrito</button>
                        </div>
                    </div>
                    <!-----------------PIZZA 2------------------>
                    <div class="pizza-2">
                        <div class="nombre">
                            <p>Pizza Suprema</p> 
                        </div>
                        <div class="ingredientes">
                            <p>Aqui los ingredientes</p>
                        </div>
                        <div class="precio">
                            <p>aqui va el precio</p>
                        </div>
                        <div class="ordenar">
                            <button> <i class="fas fa-plus"></i>&nbsp;Añadir al carrito</button>
                        </div>
                    </div>
                    <!-----------------PIZZA 3------------------>
                    <div class="pizza-3">
                        <div class="nombre">
                            <p>Pizza con Piña</p>
                        </div>
                        <div class="ingredientes">
                            <p>Aqui los ingredientes</p>
                        </div>
                        <div class="precio">
                            <p>aqui va el precio</p>
                        </div>
                        <div class="ordenar">
                            <button> <i class="fas fa-plus"></i>&nbsp;Añadir al carrito</button>
                        </div>
                    </div>
                </div>
                <!-------------------FILA 3-------------------->
                <div class="third-row">

                </div>
            </div>
        </div>
    </div>
</body>
</html>
