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
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/js/all.min.js" charset="utf-8"></script>
    </head>
    <body>
        <form action="#" class="login-form" method="post">
            <h1>Sign In</h1>
            <div class="texto">
                <input type="text" name="usuario" required>
                <div class="placeholder">Usuario</div>
            </div> 
            
            <div class="texto">
                <input type="password" name="password" required>
                <div class="placeholder">Contraseña</div>
            </div> 
            
            <button class="btn" type="submit">
                <i class ="fas fa-arrow-right"></i>
            </button>
        </form>
    </body>
</html>