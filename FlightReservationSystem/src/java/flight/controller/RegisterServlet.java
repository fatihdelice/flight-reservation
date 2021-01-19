/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flight.controller;

import flight.config.ConnectionPro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import flight.userdao.User;
import flight.userdao.UserDatabase;

/**
 *
 * @author fatih
 */
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // fetch data from registration page
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String password = request.getParameter("password");
            
            //make user objects
            User userModel = new User(name, surname, email, phone, password);
            
            //create a database model
            UserDatabase regUser = new UserDatabase(ConnectionPro.getConnection());
            if (regUser.saveUser(userModel)) {
               response.sendRedirect("index.jsp");
            } else {
                String errorMessage = "User Available";
                HttpSession regSession = request.getSession();
                regSession.setAttribute("RegError", errorMessage);
                response.sendRedirect("register.jsp");
                }

    }
}
