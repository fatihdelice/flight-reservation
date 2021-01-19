<%-- 
    Document   : index
    Created on : 08.Oca.2021, 22:07:56
    Author     : fatih
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    
  <head>
      <!-- Meta -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link type="image/png" rel="icon" size="512x512" href="Assets/flighticon.png">  
        
      <!-- CSS -->  
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>    
<link rel="stylesheet" href="style.css"> 
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">    
    <title>Delice Jet</title>  
    
  </head>
  
  <body>
  <header>
    <!-- Nav Bar -->  
    <nav class="navbar navbar-expand-lg navbar-light bg-dark">
        <img src="Assets/flighticon.png" height="40px" style="width:35px!important" />
        <a class="navbar-brand text-white " href="index.jsp">&nbsp DeliceJet</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse nav justify-content-end" id="navbarNav">
            <ul class="navbar-nav nav justify-content-center" id="navbarNav">
              <li class="nav-item">
                <a class="nav-link text-white" href="#">KAMPANYALAR</a>
              </li>
              <li class="nav-item">
                <a class="nav-link text-white" href="#">İLETİŞİM</a>
              </li>
              <li class="nav-item">
                <a class="nav-link text-white" href="register.jsp">Kayıt Ol</a>
              </li>
              <li class="nav-item ">
                  <div class="btn-group">
                    <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      GİRİŞ
                    </button>
                    <div class="dropdown-menu dropdown-menu-right signin text-white">
                        <form class="px-4 py-3" action="LoginServlet" method="post">
                          <div class="input-group form-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text"><i class="fas fa-user"></i></span>
                            </div>
                            <input type="email" class="form-control" placeholder="E-posta" name="email" required>
                        </div>
                        <div class="input-group form-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text"><i class="fas fa-key"></i></span>
                            </div>
                            <input type="password" class="form-control" placeholder="Şifre" name="password" required>
                        </div>
                          <div class="form-group">
                            <div class="form-check">
                              <input type="checkbox" class="form-check-input" id="dropdownCheck">
                              <label class="form-check-label" for="dropdownCheck">
                                Beni hatırla
                              </label>
                            </div>
                          </div>
                          <button type="submit" class="btn btn-danger float-right">Giriş Yap</button>
                        </form>
                        <div class="dropdown-divide"></div>
                        <a class="dropdown-item text-white" href="register.jsp">Buralarda yeni misiniz? Kayıt Ol</a>
                        <a class="dropdown-item text-white" href="passwordResetEmail.jsp">Şifrenizi mi unuttunuz?</a>
                      </div>
                  </div>
              </li>
            </ul>
        </div>    
    </nav>
  </header>
      
      <jsp:include page="Template/searchFlight.jsp"/>
      
      <br>
      <br><br>
      <br><br>
      <br><br>
      <br><br>
      <br><br>
      <br>
      
      
      <jsp:include page="Template/footer.jsp"/>
      
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
</body>
</html>