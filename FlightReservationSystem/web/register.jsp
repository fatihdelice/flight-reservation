<%-- 
    Document   : register
    Created on : 08.Oca.2021, 22:11:10
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
    <title>Kayıt</title>   
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="style.css">
    <link rel="stylesheet" href="style.css"> 
    
</head>

<body>
    
    <header>
        <nav class="navbar navbar-expand-lg navbar-light bg-dark nav justify-content-center">
            <img src="Assets/flighticon.png" height="40px" style="width:35px!important" />
        <a class="navbar-brand text-white " href="index.jsp">&nbsp DeliceJet</a>
        </nav>
    </header>
    
    <div class="Register-container">
        <div class="d-flex justify-content-left h-100">
            <div class="Register-card">
                <div class="card-header d-flex justify-content-center">
                    <h3>Kayıt Ol</h3>
                </div>
                <div class="card-body">
                    <form class="form-horizontal" action="RegisterServlet" method="post">
                        <div class="form-row" >
                            <div class="form-group">
                                  <label class="control-label col-sm-12 text-white" >Adınız</label>
                              <div class="col-sm-12">
                                <input class="form-control" placeholder="Adınızı Giriniz" name="name" required>
                              </div>
                            </div>

                            <div class="form-group">
                                  <label class="control-label col-sm-12 text-white" >Soyadınız</label>
                              <div class="col-sm-12">
                                <input class="form-control" placeholder="Soyadınızı Giriniz" name="surname" required>
                              </div>
                            </div>
                        </div>
                        <div class="form-row" >
                            <div class="form-group">
                                <label class="control-label col-sm-12 text-white" for="email">E-posta adresiniz</label>
                                <div class="col-sm-12">          
                                  <input type="email" class="form-control" placeholder="email@example.com" name="email" required>
                                </div>
                              </div>

                            <div class="form-group">
                              <label class="control-label col-sm-12 text-white" for="phone">Telefon numaranız</label>
                              <div class="col-sm-12">          
                                <input type="number" class="form-control" placeholder="5xx xxx xx xx" minlength="9999999999" maxlegnth="9999999999" name="phone" required>
                              </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group">
                                  <label class="control-label col-sm-12 text-white" for="password">Şifreniz</label>
                                  <div class="col-sm-12">          
                                    <input type="password" class="form-control" placeholder="Şifrenizi Giriniz" minlength="8" name="password" required>
                                  </div>
                                </div>
                            <div class="form-group col-3 align-self-end ml-auto">        
                                <div class="col-sm-12">
                                    <button type="submit" class="btn btn-danger">Kayıt Ol</button>
                                </div>
                            </div>
                        </div>                       
                    </form>
                </div>
                <div class="card-footer justify-content-bottom">
                    <div class="d-flex justify-content-left links ">
                        Zaten bir hesabın var mı?<a href="login.jsp">Giriş Yap</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

      <br><br>
      <br><br>
      <br><br>
    
<jsp:include page="Template/footer.jsp"/>
</body>
</html>