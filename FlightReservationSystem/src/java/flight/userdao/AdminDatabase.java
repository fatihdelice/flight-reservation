/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flight.userdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author fatih
 */
public class AdminDatabase {
    Connection con ;
    public int id;
    public AdminDatabase(Connection con) {
        this.con = con;
    }
    
    public Admin logAdmin(String email, String password){
        Admin admin=null;
        try{
            String query ="SELECT * FROM admin where email=? and password=?";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, password);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                admin = new Admin();
                admin.setId(rs.getInt("id"));
                admin.setName(rs.getString("name"));
                admin.setSurname(rs.getString("surname"));
                admin.setEmail(rs.getString("email"));
                admin.setPhone(rs.getString("phone"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return admin;
    }
}

