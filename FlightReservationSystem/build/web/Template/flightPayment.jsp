<%-- 
    Document   : flightPayment
    Created on : 19.Oca.2021, 03:44:14
    Author     : fatih
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
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
                    <img src="../Assets/creditcard-panel.png" height="50px" style="color:white;width:260px!important" />
                    <h1 class="display-2 text-white">Ödeme...</h1>
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
                                        <i class="fas fa-check" style="color: green">&nbsp </i>Uçuş Seçimi
                                    </li>
                                    <li class="list-group-item d-flex justify-content-between align-items-center">
                                        <i class="fas fa-check" style="color: green">&nbsp </i>Yolcu Bilgileri
                                    </li>
                                    <li class="list-group-item d-flex justify-content-between align-items-center">
                                        <i class="fas fa-check" style="color: green">&nbsp </i>Koltuk Seçimi
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

                        <div class="card-header align-items-center text-center border-5 pt-8 pt-md-4 pb-0 pb-md-4">

                        </div>
                        <div class="card-body pt-lg-5 pt-md-5">
                            <div class="row">
                                <div class="col">
                                    <div class="card-profile-stats d-flex justify-content-center mt-md-2">                                    
                                        <div class="card ">
                                            <div class="card-header">
                                                <div class="row">
                                                    <h3 class="text-xs-center">Ödeme Detayları</h3>
                                                    <img class="img-fluid cc-img" src="http://www.prepbootstrap.com/Content/images/shared/misc/creditcardicons.png">
                                                </div>
                                            </div>
                                            <div class="card-block">
                                                <form role="form">
                                                    <div class="row">
                                                        <div class="col-xs-12">
                                                            <div class="form-group">
                                                                <label>KREDİ KARTI NUMARASI</label>
                                                                <div class="input-group">
                                                                    <input type="tel" class="form-control" placeholder="Kart Numarası" required/>
                                                                    <span class="input-group-addon"><span class="fa fa-credit-card"</span></span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-xs-7 col-md-7">
                                                            <div class="form-group">
                                                                <label><span class="hidden-xs">SON</span><span class="visible-xs-inline">KULLANMA</span> TARİHİ</label>
                                                                <input type="tel" class="form-control" placeholder="AA / YY" required/>
                                                            </div>
                                                        </div>
                                                        <div class="col-xs-5 col-md-5 float-xs-right">
                                                            <div class="form-group">
                                                                <label>CVV/CVC2</label>
                                                                <input type="tel" class="form-control" placeholder="CVV/CVC2" required/>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-xs-12">
                                                            <div class="form-group">
                                                                <label>KART ÜZERİNDEKİ İSİM</label>
                                                                <input type="text" class="form-control" placeholder="Kart Üzerindeki İsim" required/>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="card-footer">
                                                        <div class="row">
                                                            <div class="col-xs-12">
                                                                <button type="submit" onclick="bas();" class="btn btn-warning btn-lg btn-block">ÖDEME</button>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </form>
                                            </div>                                            
                                        </div>                              
                                    </div>                                
                                </div>
                            </div>                        
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
        
        function bas(){
            window.alert("Ödeme Yapıldı!");
        }
    </script>
</body>
</html>
