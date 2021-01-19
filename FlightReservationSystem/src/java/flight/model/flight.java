/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flight.model;

import java.sql.Date;
import java.sql.Time;


/**
 *
 * @author fatih
 */
public class flight {

    
   
    int id;
    String from_location;
    String to_location;
    Date flight_date;
    Time departure_time;
    Time arrival_time;    
    int eco_price;
    int avantage_price;
    int business_price;
    
    public flight() {
    }

    public flight(String from_location, String to_location, Date flight_date, Time departure_time, Time arrival_time, int eco_price, int avantage_price, int business_price) {
        this.from_location = from_location;
        this.to_location = to_location;
        this.flight_date = flight_date;
            this.departure_time = departure_time;
        this.arrival_time = arrival_time;
        this.eco_price = eco_price;
        this.avantage_price = avantage_price;
        this.business_price = business_price;
    }
    
    public flight(int id, String from_location, String to_location, Date flight_date, Time departure_time, Time arrival_time, int eco_price, int avantage_price, int business_price) {
       this.id = id;
       this.from_location = from_location;
       this.to_location = to_location;
       this.flight_date = flight_date;
       this.departure_time = departure_time;
       this.arrival_time = arrival_time;
       this.eco_price = eco_price;
       this.avantage_price = avantage_price;
       this.business_price = business_price;
    }
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom_location() {
        return from_location;
    }

    public void setFrom_location(String from_location) {
        this.from_location = from_location;
    }

    public String getTo_location() {
        return to_location;
    }

    public void setTo_location(String to_location) {
        this.to_location = to_location;
    }

    public Date getFlight_date() {
        return flight_date;
    }

    public void setFlight_date(Date flight_date) {
        this.flight_date = flight_date;
    }

    public Time getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(Time departure_time) {
        this.departure_time = departure_time;
    }

    public Time getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(Time arrival_time) {
        this.arrival_time = arrival_time;
    }

    public int getEco_price() {
        return eco_price;
    }

    public void setEco_price(int eco_price) {
        this.eco_price = eco_price;
    }

    public int getAvantage_price() {
        return avantage_price;
    }

    public void setAvantage_price(int avantage_price) {
        this.avantage_price = avantage_price;
    }

    public int getBusiness_price() {
        return business_price;
    }

    public void setBusiness_price(int business_price) {
        this.business_price = business_price;
    }
}
