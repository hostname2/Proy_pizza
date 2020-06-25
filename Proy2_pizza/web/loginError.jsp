
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Sign In</title>
        <link href="CSS/login.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Poppins&display=swap" rel="stylesheet">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/js/all.min.js" charset="utf-8"></script>
    </head>
    <body>
        <form action="login.jsp" class="login-form" method="post">
            <h1>Error al ingresar</h1>
            <div class="texto">
                <p>No se pudo iniciar la sesión, vuelva a intentarlo</p>
            </div> 
             
            <button class="btn" >
                <i class ="fas fa-arrow-left"></i>
            </button>
        </form>
    </body>
</html>
