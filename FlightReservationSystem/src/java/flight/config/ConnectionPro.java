/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flight.config;

/**
 *
 * @author fatih
 */
import java.sql.*;

public class ConnectionPro {
    
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight_reservation","root","0000");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}