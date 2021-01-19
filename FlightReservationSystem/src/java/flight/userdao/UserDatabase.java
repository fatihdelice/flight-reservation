/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flight.userdao;

/**
 *
 * @author fatih
 */
import java.sql.*;

public class UserDatabase {
    Connection con ;
    public int id;
    public UserDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveUser(User user){
        boolean set = false;
        
        try{
           //Insert register data to database
           String query = "INSERT INTO user(name, surname, email, phone, password) values(?,?,?,?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, user.getName());
           pt.setString(2, user.getSurname());
           pt.setString(3, user.getEmail());
           pt.setString(4, user.getPhone());
           pt.setString(5, user.getPassword());
           
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    
    //user login
    
    public User logUser(String email, String password){
        User user=null;
        try{
            String query ="SELECT * FROM user where email=? and password=?";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, password);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setSurname(rs.getString("surname"));
                user.setEmail(rs.getString("email"));
                user.setPhone(rs.getString("phone"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
    
    // update user
    public boolean updateUser(User user){
        boolean set = false;
        try{
           //Insert register data to database
           String query = "UPDATE user set name=?, surname=?, email=?, phone=? where id=?";
           
           PreparedStatement pst = this.con.prepareStatement(query);
           
           pst.setString(1, user.getName());
           pst.setString(2, user.getSurname());
           pst.setString(3, user.getEmail());
           pst.setString(4, user.getPhone());
           pst.setInt(5, user.getId());
           
           pst.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    
    public boolean deleteUser(int id){
        boolean set = false;
        try{
           //Insert register data to database
           String query = "DELETE FROM user where id=?";
           
           PreparedStatement pst = this.con.prepareStatement(query);
           
           pst.setInt(1, id);
           
           pst.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
}
