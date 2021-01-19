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
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String logemail = request.getParameter("email");
        String logpass = request.getParameter("password");

        UserDatabase db =  new UserDatabase(ConnectionPro.getConnection());
        User user = db.logUser(logemail, logpass);


        if(user!=null){
            HttpSession session = request.getSession();
            session.setAttribute("logUser", user);
            response.sendRedirect("userProfile.jsp");
        }else{
            System.out.println("user not found");
        }
    }


}
