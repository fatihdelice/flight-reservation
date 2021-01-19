<%-- 
    Document   : adminPanel
    Created on : 08.Oca.2021, 22:26:16
    Author     : fatih
--%>

<%@page import="flight.model.flightList"%>
<%@page import="flight.model.flight"%>
<%@page import="flight.userdao.Admin"%>
<%@page import="flight.userdao.UsersList"%>
<%@page import="flight.userdao.Users"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
 List<Users> users = new UsersList().getirTumListe();
 request.setAttribute("users", users);
%>
<%
 List<Admin> adminlist = new UsersList().getirTumAdminListe();
 request.setAttribute("adminlist", adminlist);
%>
<%
 List<flight> flightlist = new flightList().getirTumUcusListe();
 request.setAttribute("flightlist", flightlist);
%>
<%
 int toplamUser = new UsersList().getirTumKullanici();
 request.setAttribute("toplamUser",toplamUser);
%>
<%
 int toplamAdmin = new UsersList().getirTumAdmin();
 request.setAttribute("toplamAdmin",toplamAdmin);
%>
<%
 int toplamFlight = new flightList().getirTumFlight();
 request.setAttribute("toplamFlight",toplamFlight);
%>
<% 
    Admin admin = (Admin) session.getAttribute("logAdmin");
    if(admin==null){
        response.sendRedirect("index.jsp");
    }
%>
<!DOCTYPE html>
<html>
<head>
    <link type="image/png" rel="icon" size="512x512" href="../Assets/flighticon.png"> 
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <title>Admin Panel</title> 
    <!-- CDN JS  -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <!-- Jasny Bootstrap and JS -->
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/jasny-bootstrap/4.0.0/css/jasny-bootstrap.min.css">
    <script src="//cdnjs.cloudflare.com/ajax/libs/jasny-bootstrap/4.0.0/js/jasny-bootstrap.min.js"></script>
    <!-- Bootstrap select JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.2/js/bootstrap-select.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.5/js/i18n/defaults-ua_UA.js"></script>
    <!-- FontAwesome and JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.8.2/js/all.js" integrity="sha384-DJ25uNYET2XCl5ZF++U8eNxPWqcKohUUBUpKGlNLMchM7q4Wjg2CUpjHLaL8yYPH" crossorigin="anonymous"></script>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <!-- Bootstrap select CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.2/css/bootstrap-select.min.css">
</head> 

<body>
    
    <style type="text/css">
    body { min-height: 600px; background-image: url(../Assets/fly.jpg); background-size: cover; background-position: center top; }
    </style>
    
    <div class="container-fluid bg-dark p-1 border-bottom shadow">
        <div class="row">
            <div class="col-4 pt-2">
            </div>
            <div class="col-4">
                <h4 class="w-100 text-center">
                    <a href="#" class="text-decoration-none text-black-50">
                        <img src="../Assets/flighticon.png" height="40px" style="width:35px!important" />
                        <a class="navbar-brand text-white " href="index.jsp">&nbsp DeliceJet</a>
                    </a>
                </h4>
            </div>
            <div class="col-4 text-right pt-2">
            </div>
        </div>
    </div>
    
    
    <div class="container-fluid">
        <div class="row">
            <div class="container mt-5 bootstrap snippet">
                <div class="row">
                    <div class="col-sm-12">
                        <ul class="list-group mb-4">
                            <li class="list-group-item"><h5>Yönetici: <%= admin.getName() %>&nbsp<%= admin.getSurname() %></h5></li>
                            <li class="list-group-item d-flex justify-content-between align-items-center">
                                Eklenen Toplam Uçuşlar
                                <span class="badge badge-primary badge-pill"><%= toplamFlight %></span>
                            </li>
                            <li class="list-group-item d-flex justify-content-between align-items-center">
                                Sisteme Kayıtlı Kullanıcılar
                                <span class="badge badge-primary badge-pill"><%= toplamUser %></span>
                            </li>
                            <li class="list-group-item d-flex justify-content-between align-items-center">
                                Sisteme Kayıtlı Yöneticiler
                                <span class="badge badge-primary badge-pill"><%= toplamAdmin %></span>
                            </li>
                            <li class="list-group-item d-flex justify-content-between align-items-center">
                                Satılan Bilet 
                                <span class="badge badge-primary badge-pill">0</span>
                            </li>
                        </ul> 
                    </div><!--/col-3-->
                    <div class="col-sm-12">
                        <div class="card text-center">
                            <div class="card-header">
                                <ul class="nav nav-tabs nav-fill card-header-tabs" id="myTab" role="tablist">
                                    <li class="nav-item">
                                        <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true"><i class="fas fa-plane"></i> Uçuş Ekle</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" id="users-list-tab" data-toggle="tab" href="#users-list" role="tab" aria-controls="users" aria-selected="false"><i class="fas fa-user"></i> Kayıtlı Kullanıcılar</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" id="admin-list-tab" data-toggle="tab" href="#admin-list" role="tab" aria-controls="admin" aria-selected="false"><i class="fas fa-users-cog"></i> Yöneticiler</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" id="ticket-sale-tab" data-toggle="tab" href="#ticket-sale" role="tab" aria-controls="ticket" aria-selected="false"><i class="fas fa-ticket-alt"></i> Bilet Satış</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="../AdminLogoutServlet"><i class="fas fa-sign-out-alt"></i>Çıkış</a>
                                    </li>
                                </ul>
                            </div>
                            <div class="tab-content card-body" id="myTabContent">
                                <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                    <div class="row">
                                        <div class="col-12">
                                            <form class="needs-validation" action="../AddFlightServlet" method="post">
                                                <div class="form-row justify-content-end">
                                                    <div class="col-md-3 mb-3 text-dark">
                                                        <label for="validationTooltip01">Nereden</label>
                                                        <select class="browser-default custom-select" name="from_location" required>
                                                            <option selected>Seç...</option>
                                                            <jsp:include page="../Template/iller.jsp"/>
                                                        </select>
                                                    </div>
                                                    <div class="col-md-3 mb-3 text-dark">
                                                        <label for="validationTooltip02">Nereye</label>
                                                        <select class="browser-default custom-select" name="to_location" required>
                                                            <option selected>Seç...</option>
                                                            <jsp:include page="../Template/iller.jsp"/>
                                                        </select>
                                                    </div>
                                                    <div class="col-md-3 mb-3 text-dark">
                                                        <label for="validationTooltip02">Tarih</label>
                                                        <input class="form-control" type="date" id="example-date-input" name="flight_date" required>
                                                    </div>
                                                    <div class="col-md-3 mb-3 text-dark">
                                                        <label for="validationTooltip02">Kalkış Saati</label>
                                                        <input class="form-control" type="text" id="departure-time-input" placeholder="00:00:00" name="departure_time" required>
                                                    </div> 
                                                    <div class="col-md-3 mb-3 text-dark">
                                                        <label for="validationTooltip02">Varış Saati</label>
                                                        <input class="form-control" type="text" id="arrival-time-input" placeholder="00:00:00" name="arrival_time" required>
                                                    </div>    
                                                    <div class="col-md-3 mb-3 text-dark">
                                                        <label for="validationTooltip02">EKO Ücreti</label>
                                                        <input class="form-control" type="number" placeholder="000" id="example-fee-input" name="eco_price" required>
                                                    </div>
                                                    <div class="col-md-3 mb-3 text-dark">
                                                        <label for="validationTooltip02">AVANTAJ Ücreti</label>
                                                        <input class="form-control" type="number" placeholder="000" id="example-fee-input" name="avantage_price" required>
                                                    </div> 
                                                    <div class="col-md-3 mb-3 text-dark">
                                                        <label for="validationTooltip02">BUSINESS FLEX Ücreti</label>
                                                        <input class="form-control" type="number" placeholder="000" id="example-fee-input" name="business_price" required>
                                                    </div>     
                                                    <div class="col-md-0 mb-2 m-3 text-white">
                                                        <button type="submit" class="btn btn-danger">Uçuş Ekle</button>
                                                    </div>    
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                    <table class="table table-sm table-hover table-bordered table-striped">
                                        <thead class="thead-light">
                                                <tr>
                                                    <th data-toggle="tooltip" data-placement="bottom" title="admin">Uçuş ID</th>
                                                    <th scope="col">Nereden</th>
                                                    <th scope="col">Nereye</th>
                                                    <th scope="col">Uçuş Tarihi</th>
                                                    <th scope="col">Kalkış Saati</th>
                                                    <th scope="col">Varış Saati</th>
                                                    <th scope="col">EKO Ücreti</th>
                                                    <th scope="col">AVANTAJ Ücreti</th>
                                                    <th scope="col">BUSINESS Ücreti</th>
                                                    <th></th>                                                
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach items="${flightlist}" var="flightlist">
                                                    <tr>
                                                        <td class="align-middle">${flightlist.id}</td>
                                                        <td class="align-middle">${flightlist.from_location}</td>
                                                        <td class="align-middle">${flightlist.to_location}</td>
                                                        <td class="align-middle">${flightlist.flight_date}</td>
                                                        <td class="align-middle">${flightlist.departure_time}</td>
                                                        <td class="align-middle">${flightlist.arrival_time}</td>
                                                        <td class="align-middle">${flightlist.eco_price}</td>
                                                        <td class="align-middle">${flightlist.avantage_price}</td>
                                                        <td class="align-middle">${flightlist.business_price}</td>
                                                        <td class="align-middle"><a href="../FlightDeleteServlet?id=<c:out value='${flightlist.id}' />"  onClick="alert('Bu uçuşu gerçekten silmek istiyor musunuz?')"  class="btn btn-primary btn-sm"><i class="far fa-trash-alt"></i></a></td>
                                                    </tr>
                                                </c:forEach>
                                            </tbody>
                                    </table>
                                </div>
                                <div class="tab-pane fade" id="users-list" role="tabpanel" aria-labelledby="users-list-tab">
                                    <table class="table table-sm table-hover table-bordered table-striped"s>
                                        <thead class="thead-light">
                                            <tr>
                                                <th scope="col" data-toggle="tooltip" data-placement="bottom" title="users">Kullanıcı ID</th>
                                                <th scope="col">İsim</th>
                                                <th scope="col">Soyisim</th>
                                                <th scope="col">E-posta Adresi</th>
                                                <th scope="col">Telefon Numarası</th>
                                                <th scope="col">Kayıt Tarihi</th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${users}" var="users">
                                                <tr>
                                                    <td class="align-middle">${users.id}</td>
                                                    <td class="align-middle">${users.name}</td>
                                                    <td class="align-middle">${users.surname}</td>
                                                    <td class="align-middle">${users.email}</td>
                                                    <td class="align-middle">${users.phone}</td>
                                                    <td class="align-middle">${users.date}</td>
                                                    <td class="align-middle"><a href="../DeleteServlet?id=<c:out value='${users.id}' />"  onClick="alert('Bu kullanıcıyı gerçekten silmek istiyor musunuz?')"  class="btn btn-primary btn-sm"><i class="far fa-trash-alt"></i></a></td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            <div class="tab-pane fade" id="admin-list" role="tabpanel" aria-labelledby="admin-list-tab">
                                <table class="table table-sm table-hover table-bordered table-striped">
                                    <thead class="thead-light">
                                            <tr>
                                                <th data-toggle="tooltip" data-placement="bottom" title="admin">Yönetici ID</th>
                                                <th scope="col">İsim</th>
                                                <th scope="col">Soyisim</th>
                                                <th scope="col">E-posta Adresi</th>
                                                <th scope="col">Telefon Numarası</th>
                                                <th></th>                                                
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${adminlist}" var="adminlist">
                                                <tr>
                                                    <td class="align-middle">${adminlist.id}</td>
                                                    <td class="align-middle">${adminlist.name}</td>
                                                    <td class="align-middle">${adminlist.surname}</td>
                                                    <td class="align-middle">${adminlist.email}</td>
                                                    <td class="align-middle">${adminlist.phone}</td>
                                                    <td class="align-middle"><a href="../DeleteServlet?id=<c:out value='${adminlist.id}' />"  onClick="alert('Bu yöneticiyi gerçekten silmek istiyor musunuz?')"  class="btn btn-primary btn-sm"><i class="far fa-trash-alt"></i></a></td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                </table>
                            </div>
                            <div class="tab-pane fade" id="ticket-sale" role="tabpanel" aria-labelledby="ticket-sale-tab">
                                <!-- bilet satis içerik -->
                            </div>
                        </div>
                    </div>
                </div><!--/col-9-->
            </div><!--/row-->
            <br>
            <br><br>
            <br><br>
            <br><br>
            <br><br>
            <br><br>
            <br>
           <jsp:include page="../Template/footer.jsp"/>
        </div>     
    </div> 
</div>    