/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flight.model;

import flight.model.flight;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fatih
 */
public class flightList {
    public List<flight> getirTumUcusListe() {
       List<flight> r = new ArrayList<>();
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight_reservation", "root", "0000");
           String query = "Select * from flights";
           PreparedStatement psmt = conn.prepareStatement(query);
           ResultSet rs = psmt.executeQuery();

          while (rs.next()) {
           flight reh = new flight(rs.getInt("id"), rs.getString("from_location"), rs.getString("to_location"), rs.getDate("flight_date"), rs.getTime("departure_time"), rs.getTime("arrival_time"),rs.getInt("eco_price"),rs.getInt("avantage_price"),rs.getInt("business_price"));
           r.add(reh);
          }

          } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
          }
           return r;
    }
    public List<flight> getirSearchFlight(String from_location, String to_location, Date flight_date) {
       List<flight> r = new ArrayList<>();
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight_reservation", "root", "0000");
           String query = "Select * from flights where from_location=? and to_location=? and flight_date=?";
           PreparedStatement psmt = conn.prepareStatement(query);
           psmt.setString(1, from_location);
           psmt.setString(2, to_location);
           psmt.setDate(3, flight_date);
           ResultSet rs = psmt.executeQuery();

          while (rs.next()) {
           flight reh = new flight(rs.getInt("id"), rs.getString("from_location"), rs.getString("to_location"), rs.getDate("flight_date"), rs.getTime("departure_time"), rs.getTime("arrival_time"),rs.getInt("eco_price"),rs.getInt("avantage_price"),rs.getInt("business_price"));
           r.add(reh);
          }
         

          } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
          }
          return r;
    }
    
    public int getirTumFlight(){
        int num = 0;
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight_reservation", "root", "0000");
           String query = "Select count(*) as toplamFlight from flights";
           PreparedStatement psmt = conn.prepareStatement(query);
           ResultSet rs = psmt.executeQuery();
           
            while(rs.next()){
              num = (rs.getInt("toplamFlight"));
            }

          } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
          }
        return num;
    }
}
