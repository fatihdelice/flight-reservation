<%-- 
    Document   : adminLogin
    Created on : 08.Oca.2021, 22:26:04
    Author     : fatih
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link type="image/png" rel="icon" size="512x512" href="../Assets/flighticon.png">  
    <title>Admin Giriş</title>   
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../style.css">
        
    
</head>

<body>
   
    <div class="container">
    <div class="row m-4">
        <div class="col-4">
            <div class="login-dark p-3 shadow-lg rounded">
                <div class="pt-3">
                    <h2 class="text-white text-center">Admin Giriş</h2>
                </div>

                <form class="mt-5" action="../AdminLoginServlet" method="post">
                    <div class="form-group">
                        <input type="email" class="form-control form-control-sm" placeholder="E-posta" name="email" required>
                    </div>

                    <div class="form-group">
                        <input type="password" class="form-control form-control-sm" placeholder="Şifre" name="password" required>
                    </div>
                    <div class="mt-5">
                        <button type="submit" class="btn btn-sm btn-danger col">Login</button>
                    </div>                    
                </form>
                <div class="mt-5">
                        <a href="../index.jsp" class="btn btn-sm btn-danger col">Ana Sayfaya Dön</a>
                    </div>
            </div>
        </div>
    </div>  
    </div>    

<jsp:include page="../Template/footer.jsp"/>
</body>
</html>