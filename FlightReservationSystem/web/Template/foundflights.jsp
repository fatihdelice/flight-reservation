<%-- 
    Document   : foundflights
    Created on : 11.Oca.2021, 20:19:21
    Author     : fatih
--%>
<%@page import="java.sql.Date"%>
<%@page import="java.util.List"%>
<%@page import="flight.model.flightList"%>
<%@page import="flight.model.flight"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
 String from_location = request.getParameter("from_location");
 String to_location = request.getParameter("to_location");
 Date flight_date = Date.valueOf(request.getParameter("flight_date"));
 List<flight> searchflightlist = new flightList().getirSearchFlight(from_location, to_location, flight_date);
 request.setAttribute("searchflightlist", searchflightlist);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="image/png" rel="icon" size="512x512" href="../Assets/flighticon.png"> 
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.3.1/css/all.min.css" rel="stylesheet">
        <link rel="stylesheet" href="../Assets/css/userpanelstyle.css"> 
    <title>DeliceJet</title>
    
    <style>
                .user-row {
                    margin-bottom: 14px;
                }

                .user-row:last-child {
                    margin-bottom: 0;
                }

                .dropdown-user {
                    margin: 13px 0;
                    padding: 5px;
                    height: 100%;
                }

                .dropdown-user:hover {
                    cursor: pointer;
                }

                .table-user-information > tbody > tr {
                    border-top: 1px solid rgb(221, 221, 221);
                }

                .table-user-information > tbody > tr:first-child {
                    border-top: 0;
                }
                .table-user-information > tbody > tr > td {
                    border-top: 0;
                }
                * {
                box-sizing: border-box;
              }

              .columns {
                float: left;
                width: 33.3%;
                padding: 8px;
              }

              .price {
                list-style-type: none;
                border: 1px solid #eee;
                margin: 0;
                padding: 0;
                -webkit-transition: 0.3s;
                transition: 0.3s;
              }

              .price:hover {
                box-shadow: 0 8px 12px 0 rgba(0,0,0,0.2)
              }

              .price .header {
                background-color: #111;
                color: white;
                font-size: 25px;
              }

              .price li {
                border-bottom: 1px solid #eee;
                padding: 20px;
                text-align: center;
              }

              .price .grey {
                background-color: #eee;
                font-size: 20px;
              }

              .button {
                background-color: #4CAF50;
                border: none;
                color: white;
                padding: 10px 25px;
                text-align: center;
                text-decoration: none;
                font-size: 18px;
              }

              @media only screen and (max-width: 600px) {
                .columns {
                  width: 100%;
                }
              }

            </style>
</head>
<body>
    <div class="main-content">
    <!-- Top navbar -->
    <nav class="navbar navbar-top navbar-expand-md navbar-dark" id="navbar-main">
        &nbsp&nbsp&nbsp&nbsp&nbsp<img src="../Assets/flighticon.png" height="40px" style="width:35px!important" />
        <a class="navbar-brand text-white " href="../index.jsp">DeliceJet</a>
    </nav>
    
    <!-- Header -->
    <div class="header pb-8 pt-5 pt-lg-8 d-flex align-items-center" style="min-height: 400px; background-image: url(../Assets/fly.jpg); background-size: cover; background-position: center top;">
        <!-- Mask -->
        <span class="mask bg-gradient-default opacity-8"></span>
        <div class="container-fluid d-flex align-items-center">
            <div class="row">
                <div class="col-lg-12 col-md-12">
                    <img src="../Assets/flight-panel.png" height="50px" style="color:white;width:260px!important" />
                    <h1 class="display-2 text-white">Uçuşlarınızı Seçiniz...</h1>
                </div>
            </div>
        </div>
    </div>
    
    <!-- Page content -->
    <div class="container-fluid mt--7">
        <div class="row">
            <div class="col-xl-2 order-xl-1">
                    <div class="card bg-secondary shadow">
                        <div class="card-body">
                            <div class="text-dark-200">                                
                                <ul class="list-group mb-4">
                                    <li class="list-group-item d-flex justify-content-between align-items-center">
                                       <i class="fas fa-times" style="color: red">&nbsp </i>Uçuş Seçimi
                                    </li>
                                    <li class="list-group-item d-flex justify-content-between align-items-center">
                                        <i class="fas fa-times" style="color: red">&nbsp </i>Yolcu Bilgileri
                                    </li>
                                    <li class="list-group-item d-flex justify-content-between align-items-center">
                                        <i class="fas fa-times" style="color: red">&nbsp </i>Koltuk Seçimi
                                    </li>
                                    <li class="list-group-item d-flex justify-content-between align-items-center">
                                       <i class="fas fa-times" style="color: red">&nbsp </i> Ödeme
                                    </li>
                                </ul>                            
                            </div>
                        </div>
                    </div>
                </div>
            <div class="col-xl-10 order-xl-2 mb-5 mb-xl-0">
                <div class="card card-profile shadow">
                    <div class="card-header text-center border-0 pt-8 pt-md-4 pb-0 pb-md-4">
                        <div class="d-flex justify-content-between">
                            
                        </div>
                    </div>
                    <div class="card-body pt-0 pt-md-4">
                        <c:forEach items="${searchflightlist}" var="searchflightlist">
                        <div class="well col-xs-8 col-sm-8 col-md-8 col-lg-8 col-xs-offset-2 col-sm-offset-2 col-md-offset-2 col-lg-offset-2" style="border-color: #323a47; background-color:#ffffff">
                            <div class="row user-row">
                                <div class="col-xs-3 col-sm-2 col-md-1 col-lg-1">
                                    <img class="img-circle"
                                         src="../Assets/flighticon.png" height="40px" style="width:35px!important"
                                         alt="User Pic">
                                </div>
                                <div class="col-xs-3 col-sm-2 col-lg-10  d-flex justify-content-between align-items-center">
                                    <i class="fas fa-plane-departure"  style="font-size:20px">&nbsp  ${searchflightlist.from_location}</i>
                                    <i class="fas fa-plane-arrival" style="font-size:20px">&nbsp  ${searchflightlist.to_location}</i>
                                    <i class="fas fa-clock" style="font-size:20px">&nbsp  ${searchflightlist.departure_time}</i>
                                    <i class="fas fa-clock" style="font-size:20px">&nbsp  ${searchflightlist.arrival_time}</i>
                                    <i class="fas fa-lira-sign" style="font-size:20px">&nbsp ${searchflightlist.eco_price} TL</i>
                                </div>
                                <div class="col-xs-1 col-sm-1 col-md-1 col-lg-1 dropdown-user" data-for=".cyruxx">
                                    <i class="glyphicon glyphicon-chevron-down text-muted"></i>
                                </div>
                            </div>
                            <div class="row user-infos cyruxx">
                                <div class="col-xs-8 col-sm-8 col-md-8 col-lg-12 col-xs-offset-0 col-sm-offset-0">
                                    <div class="panel panel-primary" style="border-color: #f5f5f5;">
                                        <div class="panel-body">
                                            <div class="columns">
                                             <ul class="price">
                                               <li class="header" style="background-color:#4CAF50">EKO</li>
                                               <li><i class="fas fa-check" style="color: green">&nbsp </i>55x40x20 cm Kabin Bagajı</li>
                                               <li><i class="fas fa-check" style="color: green">&nbsp </i>15 Kg Bagaj</li>
                                               <li style="color:gray"><i class="fas fa-times" style="color: red">&nbsp </i>Koltuk Seçimi</li>
                                               <li style="color:gray"><i class="fas fa-times" style="color: red">&nbsp </i>İade/Değişiklik hakkı</li>
                                               <li style="color:gray"><i class="fas fa-times" style="color: red">&nbsp </i>Uçak İçi Eğlence</li>
                                               <li class="grey text-white" style="background-color:#4CAF50"><a href="infoPassenger.jsp">${searchflightlist.eco_price} TL</a></li>
                                             </ul>
                                           </div>

                                           <div class="columns">
                                             <ul class="price">
                                               <li class="header" style="background-color:rgb(220, 73, 126)">AVANTAJ</li>
                                               <li><i class="fas fa-check" style="color: green">&nbsp </i>55x40x20 cm Kabin Bagajı</li>
                                               <li><i class="fas fa-check" style="color: green">&nbsp </i>20 Kg Bagaj</li>
                                               <li><i class="fas fa-check" style="color: green">&nbsp </i>Standart Koltuk Seçimi</li>
                                               <li style="color:gray"><i class="fas fa-times" style="color: red">&nbsp </i>İade/Değişiklik hakkı</li>
                                               <li><i class="fas fa-check" style="color: green">&nbsp </i>Uçak İçi Eğlence</li>
                                               <li class="grey text-white" style="background-color:rgb(220, 73, 126)"><a href="infoPassenger.jsp">${searchflightlist.avantage_price} TL</a></li>
                                             </ul>
                                           </div>

                                           <div class="columns">
                                             <ul class="price">
                                               <li class="header" style="background-color:rgb(132, 86, 188)">BUSINESS FLEX</li>
                                               <li><i class="fas fa-check" style="color: green">&nbsp </i>55x40x20 cm Kabin Bagajı</li>
                                               <li><i class="fas fa-check" style="color: green">&nbsp </i>15 Kg Bagaj</li>
                                               <li><i class="fas fa-check" style="color: green">&nbsp </i>Dilediğiniz Koltuk Seçimi</li>
                                               <li><i class="fas fa-check" style="color: green">&nbsp </i>CEZASIZ İADE/DEĞİŞİKLİK HAKKI</li>
                                               <li><i class="fas fa-check" style="color: green">&nbsp </i>Uçak İçi Eğlence</li>
                                               <li class="grey text-white" style="background-color:rgb(132, 86, 188)"><a href="infoPassenger.jsp">${searchflightlist.business_price} TL</a></li>
                                             </ul>
                                           </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div> 
                        </c:forEach>
                    </div>
                </div>
            </div>
            
            </div>
        </div>
    </div>
        
   <script>
        $(document).ready(function() {
    var panels = $('.user-infos');
    var panelsButton = $('.dropdown-user');
    panels.hide();

    //Click dropdown
    panelsButton.click(function() {
        //get data-for attribute
        var dataFor = $(this).attr('data-for');
        var idFor = $(dataFor);

        //current button
        var currentButton = $(this);
        idFor.slideToggle(400, function() {
            //Completed slidetoggle
            if(idFor.is(':visible'))
            {
                currentButton.html('<i class="glyphicon glyphicon-chevron-up text-muted"></i>');
            }
            else
            {
                currentButton.html('<i class="glyphicon glyphicon-chevron-down text-muted"></i>');
            }
        })
    });


    $('[data-toggle="tooltip"]').tooltip();

    $('button').click(function(e) {
        e.preventDefault();
        alert("This is a demo.\n :-)");
    });
});
    </script>
</body>
</html>
