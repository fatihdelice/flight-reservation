<%-- 
    Document   : passwordReset
    Created on : 08.Oca.2021, 22:09:49
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
    <link type="image/png" rel="icon" size="512x512" href="Assets/flighticon.png">  
    <title>Şifre Yenileme</title>   
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="style.css">
    <link rel="stylesheet" href="style.css"> 
    
</head>

<body>
    
    <header>
        <nav class="navbar navbar-expand-lg navbar-light bg-dark nav justify-content-center fixed-top">
            <img src="Assets/flighticon.png" height="40px" style="width:35px!important" />
            <a class="navbar-brand text-white " href="index.jsp">&nbsp DeliceJet</a>
        </nav>
    </header>
    
    <div class="Reset-container">
            <div class="d-flex justify-content-left h-100">
                    <div class="Reset-card">
                            <div class="card-header d-flex justify-content-center">
                                    <h3>Şifre Yenileme</h3>
                            </div>
                            <div class="card-body">
                                    <form>
                                            <div class="input-group form-group">
                                                    <div class="input-group-prepend">
                                                            <span class="input-group-text"><i class="fas fa-user"></i></span>
                                                    </div>
                                                    <input type="text" class="form-control" placeholder="E-posta">

                                            </div>
                                            <div class="input-group form-group">
                                                    <div class="input-group-prepend">
                                                            <span class="input-group-text"><i class="fas fa-key"></i></span>
                                                    </div>
                                                    <input type="password" class="form-control" placeholder=" Yeni Şifre">
                                            </div>
                                        <div class="input-group form-group">
                                                    <div class="input-group-prepend">
                                                            <span class="input-group-text"><i class="fas fa-key"></i></span>
                                                    </div>
                                                    <input type="password" class="form-control" placeholder=" Yeni Şifre (Tekrar)">
                                            </div>
                                            <div class="form-group">
                                                <button type="submit" class="btn btn-danger float-right">Şifre Yenile</button>
                                            </div>
                                    </form>
                            </div>
                    </div>
            </div>
    </div>

<jsp:include page="Template/footer.jsp"/>
</body>
</html>