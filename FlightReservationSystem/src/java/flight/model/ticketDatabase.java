/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flight.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author fatih
 */
public class ticketDatabase {
    
    public boolean addTicket(ticket ticket){
        boolean set = false;
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight_reservation", "root", "0000");
           String query = "INSERT INTO ticket(price, seats, name, surname, gender, birthdate, phone, tckn) values(?,?,?,?,?,?,?,?)";
           PreparedStatement pt = conn.prepareStatement(query);
           
           pt.setInt(1, ticket.getPrice());
           pt.setInt(2, ticket.getSeats());
           pt.setString(3, ticket.getName());
           pt.setString(4, ticket.getSurname());
           pt.setString(5, ticket.getGender());
           pt.setDate(6, ticket.getBirthdate());
           pt.setString(7, ticket.getPhone());
           pt.setString(8, ticket.getTckn());
           
           pt.executeUpdate();
           } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
          }
           return set;
    }
}
