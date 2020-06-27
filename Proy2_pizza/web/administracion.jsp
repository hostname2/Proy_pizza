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
        <link href="administracion.css" rel="stylesheet" type="text/css"/>
        <script src="js/getJSON.js" type="text/javascript"></script>
        <script src="js/menuscript.js" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/js/all.min.js" charset="utf-8"></script>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Poppins&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Oswald:wght@700&family=Work+Sans&display=swap" rel="stylesheet"> 
    </head>
    <body onload="initCarrito();">
        <!-----------------INICIO NAVBAR---------------->
        <div class="navbar-container">
            <div class="nav-contenido">
                <!--logo
                <div class="logo">
                    <a href="index.jsp"><img src="imagenes/logo.png"></a>
                </div>
                -->
                <!--menu-->
                <div class="menu">
                    <ul>

                        <li><a href="administracion.jsp">&nbsp;Administrar Menú</a></li>
                        <li><a href="ventas.jsp">Ventas</a></li>
                        <li><a href="#">Clientes</a></li>
                    </ul>
                </div>
                <!--Carrito-->
                <div class="carro">

                    <a href="#"> <i class="fas fa-sign-out-alt"></i> Logout</a>
                </div>
            </div>
        </div>
        <!-----------------FIN NAVBAR---------------->

        <!-----------------COMIENZA LA PARTE DEL CONTENIDO---------------->
        <div class="contenido-container">
            <!-----------------INICIO CONTENIDO---------------->
            <div class="pizzas">
                <p>Administración del Menú</p>
            </div>
            <div class="contenido">
                <!-------------------FILA 1-------------------->
                <div class="first-row">
                    <div class="new">
                        <table class="tablaCuentas">
                            <thead>
                            <th style="width: 60px">Tipo</th>
                            <th style="width: 120px">Nombre</th>
                            <th style="width: 60px">Tamaño</th>
                            <th style="width: 90px;">Cant.</th>
                            <th style="width: 60px">Precio</th>
                            <th style="width: 60px"></th>
                            <th style="width: 60px"></th>
                            </thead>
                            <tbody  id="cuerpoTabla">
                                
                            </tbody>
                            <!--
                            <tfoot>
                            <td></td>
                            <td class="c2b" colspan="3">Total:</td>
                            <td id="total" class="c2c">

                            </td>
                            <td>
                                <button type="submit" onclick="EnviarFactura();" formaction="tiempo.jsp">Facturar</button>
                            </td>
                            </tfoot>
                            -->
                        </table>
                    </div>
                    <!----------------------------------------->                   
                </div>
            </div>
        </div>
    </div>
</body>
</html>
