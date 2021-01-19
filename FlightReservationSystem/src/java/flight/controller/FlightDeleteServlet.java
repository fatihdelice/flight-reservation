/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flight.controller;

import flight.config.ConnectionPro;
import flight.model.flightDatabase;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fatih
 */
public class FlightDeleteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            int deleteid = Integer.parseInt(request.getParameter("id"));


            try{
                flightDatabase bkd = new flightDatabase();
                bkd.deleteFlight(deleteid);
                response.sendRedirect("Admin/adminPanel.jsp");
            }catch(Exception e){
                e.printStackTrace();
            }
        }   

}
