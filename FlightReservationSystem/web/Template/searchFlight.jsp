<%-- 
    Document   : searchFlight
    Created on : 08.Oca.2021, 22:30:19
    Author     : fatih
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div class="search-flight-container">
    <div class="d-flex justify-content-left h-100">
        <div class="search-flight-card">
            <div class="card-header d-flex justify-content-left">
                <ul class="nav nav-tabs" id="myTab" role="tablist">
                   <li class="nav-item" role="presentation">
                      <a class="nav-link active links" id="ticket-tab" data-toggle="tab" href="#ticket" role="tab" aria-controls="ticket" aria-selected="true">Uçak Bileti</a>
                   </li>
                   <li class="nav-item" role="presentation">
                       <a class="nav-link links" id="checkin-tab" data-toggle="tab" href="#checkin" role="tab" aria-controls="checkin" aria-selected="false">Online Check-in</a>
                   </li>
                </ul>
                                
            </div>
            
            <div class="card-body">
                <div class="tab-content" id="pills-tabContent">
                    <div class="tab-pane fade show active" id="ticket" role="tabpanel" aria-labelledby="ticket-tab">
                        <div class="text-white">
                            <input id="one_way" type="radio" name="tab-group-1" checked /><label for="one_way">Tek Yön</label>
                            <input id="return" type="radio" name="tab-group-1" /><label for="return">Gidiş-Dönüş</label>                            
                        </div>
                        <div class="tab-content">                            
                            <div class="tab-pane  active" id="tekyon" role="tabpanel" aria-labelledby="tekyon-tab">
                                <form class="needs-validation"  action="Template/foundflights.jsp" method="post">
                                    <div class="form-row">
                                        <div class="col-md-3 mb-3 text-white">
                                            <label for="validationTooltip01">Nereden</label>
                                            <select class="browser-default custom-select" name="from_location" required>
                                                <option selected>Seç...</option>
                                                <jsp:include page="iller.jsp"/>
                                            </select>
                                        </div>
                                        <div class="col-md-3 mb-3 text-white">
                                            <label for="validationTooltip02">Nereye</label>
                                            <select class="browser-default custom-select" name="to_location" required>
                                                <option selected>Seç...</option>
                                                <jsp:include page="iller.jsp"/>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-row">
                                        <div class="col-md-3 mb-3 text-white">
                                            <label for="validationTooltip02">Gidiş</label>
                                            <input class="form-control" type="date" id="example-date-input" name="flight_date" required>
                                        </div>
                                        <div class="col-md-3 mb-3 text-white">
                                            <label for="validationTooltip02">Yolcular</label>
                                            <select class="browser-default custom-select" required>
                                                <option selected>Seç...</option>
                                                <option value="ytskn">Yetişkin</option>
                                                <option value="cck">Çocuk</option>
                                                <option value="bbk">Bebek</option>
                                            </select>
                                        </div>
                                        <div class="col-md-10 mb-3 text-white">
                                            <button type="submit" class="btn btn-danger">Uçuş Ara</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="tab-pane" id="gidisdonus" role="tabpanel" aria-labelledby="return-tab">
                                <form class="needs-validation" action="Template/foundflights.jsp" method="post">
                                    <div class="form-row">
                                        <div class="col-md-3 mb-3 text-white">
                                            <label for="validationTooltip01">Nereden</label>
                                            <select class="browser-default custom-select" name="from_location" required>
                                                <option selected>Seç...</option>
                                                <jsp:include page="iller.jsp"/>
                                            </select>
                                        </div>
                                        <div class="col-md-3 mb-3 text-white">
                                            <label for="validationTooltip02">Nereye</label>
                                            <select class="browser-default custom-select" name="to_location" required>
                                                <option selected>Seç...</option>
                                                <jsp:include page="iller.jsp"/>
                                            </select>
                                        </div>

                                    </div>
                                    <div class="form-row">
                                        <div class="col-md-3 mb-3 text-white">
                                            <label for="validationTooltip02">Gidiş</label>
                                            <input class="form-control" type="date" id="example-date-input" name="flight_date"required>
                                        </div>
                                        <div class="col-md-3 mb-3 text-white">
                                            <label for="validationTooltip02">Dönüş</label>
                                            <input class="form-control" type="date" id="example-date-input" name="flight_date" required>
                                        </div>
                                        <div class="col-md-3 mb-3 text-white">
                                            <label for="validationTooltip02">Yolcular</label>
                                            <select class="browser-default custom-select" required>
                                                <option selected>Seç...</option>
                                                <option value="ytskn">Yetişkin</option>
                                                <option value="cck">Çocuk</option>
                                                <option value="bbk">Bebek</option>
                                            </select>
                                        </div> 
                                        <div class="col-md-4 mb-3 text-white">
                                            <button type="submit" class="btn btn-danger">Uçuş Ara</button>
                                        </div> 
                                    </div>    
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="checkin" role="tabpanel" aria-labelledby="checkin-tab">
                        <form class="needs-validation">
                            <div class="form-row field">
                                <div class="col-md-6 mb-3 text-white">
                                    <input type="text"  autocomplete="off" id="surname" required/>
                                    <label for="surname" title="Yolcunun Soyadı" data-title="Yolcunun Soyadı">
                                </div>
                                <div class="col-md-6 mb-3 text-white field">
                                    <input type="text" style="text-transform: uppercase !important" maxlength="6" minlength="6" autocomplete="off" id="reservationcode" required/>
                                    <label for="reservationcode" title="Rezervasyon Kodu (PNR)" data-title="Rezervasyon Kodu (PNR)">
                                </div>
                            </div>
                            <div class="form-group">
                                <button type="submit" class="btn btn-danger float-right">Devam</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>                          
        </div>
    </div>
</div>
                                            
<script type="text/javascript">
    
    document.getElementById("return").addEventListener("change", function(){
        document.getElementById("gidisdonus").classList.add("active");
        document.getElementById("tekyon").classList.remove("active");
        
    })
    document.getElementById("one_way").addEventListener("change", function(){
        document.getElementById("tekyon").classList.add("active");
        document.getElementById("gidisdonus").classList.remove("active");
        
    })
    
    
</script>