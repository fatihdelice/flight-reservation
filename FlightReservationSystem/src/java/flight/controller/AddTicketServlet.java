/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flight.controller;

import flight.model.ticket;
import flight.model.ticketDatabase;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Time;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fatih
 */
public class AddTicketServlet extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // fetch data from registration page
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String gender = request.getParameter("gender");
            Date birthdate = Date.valueOf(request.getParameter("birthdate"));
            String phone = request.getParameter("phone");
            String tckn = request.getParameter("tckn");
            
            //make user objects
            ticket ticketModel = new ticket(name, surname, gender, birthdate, phone, tckn);
            //create a database model
            ticketDatabase regFlight = new ticketDatabase();
            if (regFlight.addTicket(ticketModel)) {
               response.sendRedirect("index.jsp");
            } else {
                String errorMessage = "Flight Available";
                HttpSession regSession = request.getSession();
                regSession.setAttribute("RegError", errorMessage);
                response.sendRedirect("Template/bookingSeat.jsp");
                }

    }
}
