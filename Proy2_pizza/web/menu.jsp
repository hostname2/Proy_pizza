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
        <link href="style_menu.css" rel="stylesheet" type="text/css"/>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/js/all.min.js" charset="utf-8"></script>
        <link href="https://fonts.googleapis.com/css2?family=Oswald:wght@700&family=Work+Sans&display=swap" rel="stylesheet"> 
    </head>
    <body>
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
                <p>Nuestras Pizzas</p>
            </div>
            <div class="contenido">
                <!-------------------FILA 1------------------
                
                <!-------------------FILA 2-------------------->
                <div class="second-row">
                    <!-----------------PIZZA 1------------------>
                    <div class="pizza-1">
                        <div class="nombre">
                            <p>Pizza Pepperoni</p>
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
                        <div class="tamaño">
                            <select>
                                <option value="grande">Grande</option>
                                <option value="familiar">Familiar</option>
                                <option value="personal">Personal</option>
                            </select>
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
                        <div class="tamaño">
                            <select>
                                <option value="grande">Grande</option>
                                <option value="familiar">Familiar</option>
                                <option value="personal">Personal</option>
                            </select>
                        </div>
                    </div>
                    <!-----------------PIZZA 3------------------>
                    <div class="pizza-3">
                        <div class="nombre">
                            <p>Pizza Hawaiana</p>
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
                        <div class="tamaño">
                            <select>
                                <option value="grande">Grande</option>
                                <option value="familiar">Familiar</option>
                                <option value="personal">Personal</option>
                            </select>
                        </div>
                    </div>
                </div>
                <!-------------------FILA 3-------------------->
                <div class="third-row">
                    <!-----------------PIZZA 4------------------>
                    <div class="pizza-4">
                        <div class="nombre">
                            <p>Pizza Margarita</p>
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
                        <div class="tamaño">
                            <select>
                                <option value="grande">Grande</option>
                                <option value="familiar">Familiar</option>
                                <option value="personal">Personal</option>
                            </select>
                        </div>
                    </div>
                    <!-----------------PIZZA 5------------------>
                    <div class="pizza-5">
                        <div class="nombre">
                            <p>Pizza Chicago Style</p>
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
                        <div class="tamaño">
                            <select>
                                <option value="grande">Grande</option>
                                <option value="familiar">Familiar</option>
                                <option value="personal">Personal</option>
                            </select>
                        </div>
                    </div>
                    <!-----------------PIZZA 6------------------>
                    <div class="pizza-6">
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
                        <div class="tamaño">
                            <select>
                                <option value="grande">Grande</option>
                                <option value="familiar">Familiar</option>
                                <option value="personal">Personal</option>
                            </select>
                        </div>
                    </div>
                </div>
                <!-------------------FILA 4-------------------->
                <div class="fourth-row">
                    <!-----------------COMPLEMENTO 1------------------>
                    <div class="comp-1">
                        <div class="nombre">
                            <p>Palitos que se comen con salsa</p>
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
                        <div class="tamaño">
                            <select>
                                <option value="grande">Grande</option>
                                <option value="familiar">Familiar</option>
                                <option value="personal">Personal</option>
                            </select>
                        </div>
                    </div>
                    <!-----------------COMPLEMENTO 2------------------>
                    <div class="comp-2">
                        <div class="nombre">
                            <p>Papas</p>
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
                        <div class="tamaño">
                            <select>
                                <option value="grande">Grande</option>
                                <option value="familiar">Familiar</option>
                                <option value="personal">Personal</option>
                            </select>
                        </div>
                    </div>
                    <!-----------------COMPLEMENTO 3------------------>
                    <div class="comp-3">
                        <div class="nombre">
                            <p>Coca cola</p>
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
                        <div class="tamaño">
                            <select>
                                <option value="grande">Grande</option>
                                <option value="familiar">Familiar</option>
                                <option value="personal">Personal</option>
                            </select>
                        </div>
                    </div>
                </div>
                <!-------------------TERMINA FILA 4-------------------->
            </div>
        </div>
    </div>
</body>
</html>
