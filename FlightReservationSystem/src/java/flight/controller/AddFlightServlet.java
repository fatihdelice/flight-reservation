/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flight.controller;

import flight.config.ConnectionPro;
import flight.model.flight;
import flight.model.flightDatabase;
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
public class AddFlightServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // fetch data from registration page
            String from_location = request.getParameter("from_location");
            String to_location = request.getParameter("to_location");
            Date flight_date = Date.valueOf(request.getParameter("flight_date"));
            Time departure_time = Time.valueOf(request.getParameter("departure_time"));
            Time arrival_time = Time.valueOf(request.getParameter("arrival_time"));
            int eco_price = Integer.valueOf(request.getParameter("eco_price"));
            int avantage_price = Integer.valueOf(request.getParameter("avantage_price"));
            int business_price = Integer.valueOf(request.getParameter("business_price"));
            
            //make user objects
            flight flightModel = new flight(from_location, to_location, flight_date, departure_time, arrival_time, eco_price, avantage_price, business_price);
            //create a database model
            flightDatabase regFlight = new flightDatabase();
            if (regFlight.addFlight(flightModel)) {
               response.sendRedirect("index.jsp");
            } else {
                String errorMessage = "Flight Available";
                HttpSession regSession = request.getSession();
                regSession.setAttribute("RegError", errorMessage);
                response.sendRedirect("Admin/adminPanel.jsp");
                }

    }

}
