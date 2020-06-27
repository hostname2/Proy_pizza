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
        <title>Sign In</title>
        <link href="CSS/login.css" rel="stylesheet" type="text/css"/>
        <script src="js/login-registro.js" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/js/all.min.js" charset="utf-8"></script>
    </head>
    <body onload ="init();">
        <form onsubmit ="ServicoLogin" class="login-form" method="post">
            <h1>Sign In</h1>
            <div class="texto">
                <input type="text" name="usuario" required>
                <div class="placeholder">Usuario</div>
            </div> 

            <div class="texto">
                <input type="password" name="password" required>
                <div class="placeholder">Contraseña</div>
            </div> 

            <div class="registrar" id="regis">
                <!---<button class="btn2" id="registrar-btn" >Regístrate</button>-->
            </div> 

            <button class="btn" type="submit">
                <i class ="fas fa-arrow-right"></i>
            </button>
        </form>

        <!------ MODAL REGISTER ------>

        <div class="bg-register">
            <div class="register-content">
                <div class="cerrar" id="close"><i class="fas fa-window-close" onclick="ceclose();"></i></div>
                <form action="" class="register-form" method="post">
                    <h1>Registro</h1>
                    <div class="texto-1">
                        <input type="text" name="nombre" id="nombre" required="" placeholder="Nombre">
                    </div> 

                    <div class="texto-1">
                        <input type="text" name="apellido" id="apellido" required="" placeholder="Apellido"> 
                    </div> 

                    <div class="texto-1">
                        <input type="text" name="identificacion" id="identificacion" required="" placeholder="Identificación">    
                    </div> 

                    <div class="texto-1">
                        <input type="text" name="direccion" id="direccion" required="" placeholder="Dirección">  
                    </div> 

                    <div class="texto-1">
                        <input type="text" name="telefono"  id="telefono" required="" placeholder="Teléfono">
                    </div> 

                    <div class="texto-1">
                        <input type="text" name="usuario" id="usuario" required="" placeholder="Usuario">
                    </div> 

                    <div class="texto-1">
                        <input type="text" name="contraseña" id="contraseña" required="" placeholder="Contraseña">
                    </div> 

                    <button class="btn-1" id="registro-btn" type="submit">
                        <i class="fas fa-sign-in-alt"></i>
                    </button>
                </form>
            </div>
        </div>
    </body>
</html>