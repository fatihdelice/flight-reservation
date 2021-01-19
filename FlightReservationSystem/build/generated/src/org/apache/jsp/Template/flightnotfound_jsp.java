package org.apache.jsp.Template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class flightnotfound_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link type=\"image/png\" rel=\"icon\" size=\"512x512\" href=\"../Assets/flighticon.png\"> \r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("\r\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.3.1/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Assets/css/userpanelstyle.css\"> \r\n");
      out.write("    <title>DeliceJet</title>\r\n");
      out.write("    \r\n");
      out.write("    <style>\r\n");
      out.write("                .user-row {\r\n");
      out.write("                    margin-bottom: 14px;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .user-row:last-child {\r\n");
      out.write("                    margin-bottom: 0;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .dropdown-user {\r\n");
      out.write("                    margin: 13px 0;\r\n");
      out.write("                    padding: 5px;\r\n");
      out.write("                    height: 100%;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .dropdown-user:hover {\r\n");
      out.write("                    cursor: pointer;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .table-user-information > tbody > tr {\r\n");
      out.write("                    border-top: 1px solid rgb(221, 221, 221);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .table-user-information > tbody > tr:first-child {\r\n");
      out.write("                    border-top: 0;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                .table-user-information > tbody > tr > td {\r\n");
      out.write("                    border-top: 0;\r\n");
      out.write("                }\r\n");
      out.write("                * {\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .columns {\r\n");
      out.write("                float: left;\r\n");
      out.write("                width: 33.3%;\r\n");
      out.write("                padding: 8px;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .price {\r\n");
      out.write("                list-style-type: none;\r\n");
      out.write("                border: 1px solid #eee;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                -webkit-transition: 0.3s;\r\n");
      out.write("                transition: 0.3s;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .price:hover {\r\n");
      out.write("                box-shadow: 0 8px 12px 0 rgba(0,0,0,0.2)\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .price .header {\r\n");
      out.write("                background-color: #111;\r\n");
      out.write("                color: white;\r\n");
      out.write("                font-size: 25px;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .price li {\r\n");
      out.write("                border-bottom: 1px solid #eee;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .price .grey {\r\n");
      out.write("                background-color: #eee;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .button {\r\n");
      out.write("                background-color: #4CAF50;\r\n");
      out.write("                border: none;\r\n");
      out.write("                color: white;\r\n");
      out.write("                padding: 10px 25px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              @media only screen and (max-width: 600px) {\r\n");
      out.write("                .columns {\r\n");
      out.write("                  width: 100%;\r\n");
      out.write("                }\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("            </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"main-content\">\r\n");
      out.write("    <!-- Top navbar -->\r\n");
      out.write("    <nav class=\"navbar navbar-top navbar-expand-md navbar-dark\" id=\"navbar-main\">\r\n");
      out.write("        &nbsp&nbsp&nbsp&nbsp&nbsp<img src=\"../Assets/flighticon.png\" height=\"40px\" style=\"width:35px!important\" />\r\n");
      out.write("        <a class=\"navbar-brand text-white \" href=\"../index.jsp\">DeliceJet</a>\r\n");
      out.write("    </nav>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Header -->\r\n");
      out.write("    <div class=\"header pb-8 pt-5 pt-lg-8 d-flex align-items-center\" style=\"min-height: 400px; background-image: url(../Assets/fly.jpg); background-size: cover; background-position: center top;\">\r\n");
      out.write("    \r\n");
      out.write("        <!-- Mask -->\r\n");
      out.write("        <span class=\"mask bg-gradient-default opacity-8\"></span>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Page content -->\r\n");
      out.write("    <div class=\"container-fluid mt--7\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-xl-12 order-xl-2 mb-5 mb-xl-0\">\r\n");
      out.write("                <div class=\"card card-profile shadow\">\r\n");
      out.write("                    <div class=\"card-header text-center border-0 pt-8 pt-md-4 pb-0 pb-md-4\">\r\n");
      out.write("                        <div class=\"d-flex justify-content-between\">\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-body pt-0 pt-md-4\">\r\n");
      out.write("                        <div class=\"text-center\" >\r\n");
      out.write("                            <img src=\"../Assets/oops.png\" height=\"403px\" style=\"width:619px!important\" />\r\n");
      out.write("                            <h3 style=\"font-size: 50px\"> Uçuş Bulunamadı!</h3>\r\n");
      out.write("                        </div>                     \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("        \r\n");
      out.write("   <script>\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("    var panels = $('.user-infos');\r\n");
      out.write("    var panelsButton = $('.dropdown-user');\r\n");
      out.write("    panels.hide();\r\n");
      out.write("\r\n");
      out.write("    //Click dropdown\r\n");
      out.write("    panelsButton.click(function() {\r\n");
      out.write("        //get data-for attribute\r\n");
      out.write("        var dataFor = $(this).attr('data-for');\r\n");
      out.write("        var idFor = $(dataFor);\r\n");
      out.write("\r\n");
      out.write("        //current button\r\n");
      out.write("        var currentButton = $(this);\r\n");
      out.write("        idFor.slideToggle(400, function() {\r\n");
      out.write("            //Completed slidetoggle\r\n");
      out.write("            if(idFor.is(':visible'))\r\n");
      out.write("            {\r\n");
      out.write("                currentButton.html('<i class=\"glyphicon glyphicon-chevron-up text-muted\"></i>');\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("            {\r\n");
      out.write("                currentButton.html('<i class=\"glyphicon glyphicon-chevron-down text-muted\"></i>');\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $('[data-toggle=\"tooltip\"]').tooltip();\r\n");
      out.write("\r\n");
      out.write("    $('button').click(function(e) {\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        alert(\"This is a demo.\\n :-)\");\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
