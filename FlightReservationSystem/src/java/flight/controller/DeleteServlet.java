/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flight.controller;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import flight.config.ConnectionPro;
import flight.userdao.User;
import flight.userdao.UserDatabase;

/**
 *
 * @author fatih
 */
public class DeleteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int deleteid = Integer.parseInt(request.getParameter("id"));
            
        
        try{
            UserDatabase bkd = new UserDatabase(ConnectionPro.getConnection());
            bkd.deleteUser(deleteid);
            response.sendRedirect("Admin/adminPanel.jsp");
        }catch(Exception e){
            e.printStackTrace();
        }
    }       
}
