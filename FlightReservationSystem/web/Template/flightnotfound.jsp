<%-- 
    Document   : foundflights
    Created on : 11.Oca.2021, 20:19:21
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
    </div>
    
    <!-- Page content -->
    <div class="container-fluid mt--7">
        <div class="row">
            <div class="col-xl-12 order-xl-2 mb-5 mb-xl-0">
                <div class="card card-profile shadow">
                    <div class="card-header text-center border-0 pt-8 pt-md-4 pb-0 pb-md-4">
                        <div class="d-flex justify-content-between">
                            
                        </div>
                    </div>
                    <div class="card-body pt-0 pt-md-4">
                        <div class="text-center" >
                            <img src="../Assets/oops.png" height="403px" style="width:619px!important" />
                            <h3 style="font-size: 50px"> Uçuş Bulunamadı!</h3>
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
    </script>
</body>
</html>
