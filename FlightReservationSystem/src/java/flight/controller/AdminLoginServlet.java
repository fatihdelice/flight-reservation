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
import flight.userdao.Admin;
import flight.userdao.AdminDatabase;

/**
 *
 * @author fatih
 */
public class AdminLoginServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String adminemail = request.getParameter("email");
        String adminpass = request.getParameter("password");

        AdminDatabase db =  new AdminDatabase(ConnectionPro.getConnection());
        Admin admin = db.logAdmin(adminemail, adminpass);


        if(admin!=null){
            HttpSession session = request.getSession();
            session.setAttribute("logAdmin", admin);
            response.sendRedirect("Admin/adminPanel.jsp");
        }else{
            System.out.println("user not found");
        }
    }

}
