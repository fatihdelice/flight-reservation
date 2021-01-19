package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class passwordReset_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <link type=\"image/png\" rel=\"icon\" size=\"512x512\" href=\"Assets/flighticon.png\">  \r\n");
      out.write("    <title>Şifre Yenileme</title>   \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\"> \r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    <header>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-dark nav justify-content-center fixed-top\">\r\n");
      out.write("            <img src=\"Assets/flighticon.png\" height=\"40px\" style=\"width:35px!important\" />\r\n");
      out.write("            <a class=\"navbar-brand text-white \" href=\"index.jsp\">&nbsp DeliceJet</a>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"Reset-container\">\r\n");
      out.write("            <div class=\"d-flex justify-content-left h-100\">\r\n");
      out.write("                    <div class=\"Reset-card\">\r\n");
      out.write("                            <div class=\"card-header d-flex justify-content-center\">\r\n");
      out.write("                                    <h3>Şifre Yenileme</h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                    <form>\r\n");
      out.write("                                            <div class=\"input-group form-group\">\r\n");
      out.write("                                                    <div class=\"input-group-prepend\">\r\n");
      out.write("                                                            <span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" placeholder=\"E-posta\">\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"input-group form-group\">\r\n");
      out.write("                                                    <div class=\"input-group-prepend\">\r\n");
      out.write("                                                            <span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <input type=\"password\" class=\"form-control\" placeholder=\" Yeni Şifre\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        <div class=\"input-group form-group\">\r\n");
      out.write("                                                    <div class=\"input-group-prepend\">\r\n");
      out.write("                                                            <span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <input type=\"password\" class=\"form-control\" placeholder=\" Yeni Şifre (Tekrar)\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-danger float-right\">Şifre Yenile</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
