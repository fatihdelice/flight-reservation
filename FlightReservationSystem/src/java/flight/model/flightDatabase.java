/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flight.model;

import flight.model.flight;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

/**
 *
 * @author fatih
 */
public class flightDatabase {
    private flight flight;
    public boolean addFlight(flight flight){
        boolean set = false;
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight_reservation", "root", "0000");
           String query = "INSERT INTO flights(from_location, to_location, flight_date, departure_time, arrival_time, eco_price, avantage_price, business_price) values(?,?,?,?,?,?,?,?)";
           PreparedStatement pt = conn.prepareStatement(query);
           
           pt.setString(1, flight.getFrom_location());
           pt.setString(2, flight.getTo_location());
           pt.setDate(3, flight.getFlight_date());
           pt.setTime(4, flight.getDeparture_time());
           pt.setTime(5, flight.getArrival_time());
           pt.setInt(6, flight.getEco_price());
           pt.setInt(7, flight.getAvantage_price());
           pt.setInt(8, flight.getBusiness_price());
           
           pt.executeUpdate();
           } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
          }
           return set;
    }
    
    public flight searchFlight(String from_location, String to_location, Date flight_date){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight_reservation", "root", "0000");
            String query ="SELECT * FROM flights where from_location=? and to_location=? and flight_date=?";

           PreparedStatement pst = conn.prepareStatement(query);
           pst.setString(1, from_location);
           pst.setString(2, to_location);
           pst.setDate(3, flight_date);
           
           ResultSet rs = pst.executeQuery();
           if(rs.next()){
                flight flight = new flight();
                flight.setId(rs.getInt("id"));
                flight.setFrom_location(rs.getString("from_location"));
                flight.setTo_location(rs.getString("to_location"));
                flight.setFlight_date(rs.getDate("flight_date"));
                flight.setDeparture_time(rs.getTime("departure_time"));
                flight.setArrival_time(rs.getTime("arrival_time"));
                flight.setEco_price(rs.getInt("eco_price"));
                flight.setAvantage_price(rs.getInt("avantage_price"));
                flight.setBusiness_price(rs.getInt("business_price"));

            }
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
          }
        return flight;
    }
    
    public boolean deleteFlight(int id){
        boolean set = false;
        try{
           //Insert register data to database
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight_reservation", "root", "0000");
           String query = "DELETE FROM flights where id=?";
           
           PreparedStatement pst = conn.prepareStatement(query);
           
           pst.setInt(1, id);
           
           pst.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
}
