<%-- 
    Document   : userProfile
    Created on : 08.Oca.2021, 22:15:34
    Author     : fatih
--%>
<%@page import="flight.userdao.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    User user = (User) session.getAttribute("logUser");
    if(user==null){
        response.sendRedirect("index.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="image/png" rel="icon" size="512x512" href="Assets/flighticon.png"> 
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.3.1/css/all.min.css" rel="stylesheet">
        <link rel="stylesheet" href="Assets/css/userpanelstyle.css"> 
    <title>Profil</title>
</head>
<body>
    <div class="main-content">
    <!-- Top navbar -->
    <nav class="navbar navbar-top navbar-expand-md navbar-dark" id="navbar-main">
        <div class="container-fluid">
            <!-- Brand -->
                <img src="Assets/flighticon.png" height="40px" style="width:35px!important" />
                <a class="navbar-brand text-white " href="index.jsp">&nbsp DeliceJet</a>
            <!-- Form -->
            <form class="navbar-search navbar-search-dark form-inline mr-3 d-none d-md-flex ml-lg-auto">
                <div class="form-group mb-0">
                    <div class="input-group input-group-alternative">
                        <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fas fa-search"></i></span>
                        </div>
                        <input class="form-control" placeholder="Ara" type="text">
                    </div>
                </div>
            </form>
            <!-- User -->
            <ul class="navbar-nav align-items-center d-none d-md-flex">
                <li class="nav-item dropdown">
                    <a class="navbar-brand text-white" href="LogoutServlet">Çıkış</a>                    
                </li>
            </ul>
        </div>
    </nav>
    
    <!-- Header -->
    <div class="header pb-8 pt-5 pt-lg-8 d-flex align-items-center" style="min-height: 400px; background-image: url(Assets/fly.jpg); background-size: cover; background-position: center top;">
    
        <!-- Mask -->
        <span class="mask bg-gradient-default opacity-8"></span>

        <!-- Header container -->
        <div class="container-fluid d-flex align-items-center">
            <div class="row">
                <div class="col-lg-7 col-md-10">
                    <h1 class="display-2 text-white">Merhaba, <%= user.getName() %></h1>
                    <p class="text-white mt-0 mb-5">Burası senin profil sayfan. Profil bilgilerine ve uçuş bilgilerini buradan yönetebilirsin</p>
                </div>
            </div>
        </div>
    </div>
    
    <!-- Page content -->
    <div class="container-fluid mt--7">
        <div class="row">
            <div class="col-xl-8 order-xl-2 mb-5 mb-xl-0">
                <div class="card card-profile shadow">
                    <div class="card-header text-center border-0 pt-8 pt-md-4 pb-0 pb-md-4">
                        <div class="d-flex justify-content-between">
                            <h3 class="mb-0">Hesabım</h3>
                            
                        </div>
                    </div>
                    <div class="card-body pt-0 pt-md-4">
                        <div class="row">
                            <div class="col">
                                <div class="card-profile-stats d-flex justify-content-center mt-md-2">
                                    <form action="UpdateServlet" method="post">
                                        <h6 class="heading-small text-muted mb-4">Kullanıcı Bilgileri</h6>
                                        <div class="pl-lg-1">
                                            <div class="row">
                                                <div class="col-lg-6">
                                                    <div class="form-group focused">
                                                        <label class="form-control-label" for="input-first-name">Ad</label>
                                                        <input type="text" id="input-first-name" class="form-control form-control-alternative" placeholder="First name" name="name" value="<%= user.getName() %>">
                                                    </div>
                                                </div>
                                                <div class="col-lg-6">
                                                    <div class="form-group focused">
                                                        <label class="form-control-label" for="input-last-name">Soyad</label>
                                                        <input type="text" id="input-last-name" class="form-control form-control-alternative" placeholder="Last name" name="surname" value="<%= user.getSurname() %>">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-lg-6">
                                                    <div class="form-group">
                                                        <label class="form-control-label" for="input-email">E-posta Adresi</label>
                                                        <input type="email" id="input-email" class="form-control form-control-alternative" placeholder="Email" name="email" value="<%= user.getEmail() %>">
                                                    </div>
                                                </div>
                                                <div class="col-lg-6">
                                                    <div class="form-group focused">
                                                        <label class="form-control-label" for="input-phone">Telefon Numarası</label>
                                                        <input type="phone" id="input-username" class="form-control form-control-alternative" placeholder="Phone" name="phone" value="<%= user.getPhone() %>">
                                                    </div>
                                                </div> 
                                                    <button type="submit" class="btn btn-danger float-right">Profili Düzenle</button>
                                            </div>                                            
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>                        
                    </div>
                </div>
            </div>
            <div class="col-xl-3 order-xl-1">
                    <div class="card bg-secondary shadow">
                        <div class="card-header bg-white border-danger">
                            <div class="row align-items-center">
                                <img src="Assets/user.png" height="30px" style="width:30px!important" />
                                <a class="navbar-brand text-dark ">&nbsp  <%= user.getName() %> <%= user.getSurname() %></a>
                            </div>
                        </div>
                        <div class="card-body">
                            <div class="text-dark-200">                                
                                <ul class="navbar-nav nav align-items-lg-start" id="navbarNav">
                                    <li class="nav-item ">
                                      <h3 class="nav-link fas fa-ticket-alt" href="#" >&nbsp &nbsp Seyahat Bilgileri</h3>
                                    </li>
                                    <li class="nav-item">
                                      <h3 class="nav-link fas fa-bullhorn" href="#" >&nbsp &nbsp Kampanyalar</h3>
                                    </li>
                                    <li class="nav-item">
                                      <h3 class="nav-link text-dark fas fa-user" href="#" >&nbsp &nbsp Üyelik Ayarları</h3>
                                    </li>
                                    <li class="nav-item">
                                       <a class="btn btn-danger text-white" href="index.jsp">Ucuz Uçuş Ara</a>
                                    </li>
                                    
                                    <li class="nav-item">
                                        <br>
                                        <a>DeliceJet ile ilgili talep ve sorularınız için 0(999) 999 99 99 no’lu ücretsiz çağrı merkezimizi arayabilirsiniz.</a>
                                    </li>
                                </ul>                                
                            </div>
                        </div>
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
