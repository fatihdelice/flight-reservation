package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    \r\n");
      out.write("  <head>\r\n");
      out.write("      <!-- Meta -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <link type=\"image/png\" rel=\"icon\" size=\"512x512\" href=\"Assets/flighticon.png\">  \r\n");
      out.write("        \r\n");
      out.write("      <!-- CSS -->  \r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\" crossorigin=\"anonymous\"></script>    \r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\"> \r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">    \r\n");
      out.write("    <title>Delice Jet</title>  \r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  <header>\r\n");
      out.write("    <!-- Nav Bar -->  \r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-dark\">\r\n");
      out.write("        <img src=\"Assets/flighticon.png\" height=\"40px\" style=\"width:35px!important\" />\r\n");
      out.write("        <a class=\"navbar-brand text-white \" href=\"index.jsp\">&nbsp DeliceJet</a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse nav justify-content-end\" id=\"navbarNav\">\r\n");
      out.write("            <ul class=\"navbar-nav nav justify-content-center\" id=\"navbarNav\">\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link text-white\" href=\"#\">KAMPANYALAR</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link text-white\" href=\"#\">İLETİŞİM</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link text-white\" href=\"register.jsp\">Kayıt Ol</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item \">\r\n");
      out.write("                  <div class=\"btn-group\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-danger dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                      GİRİŞ\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right signin text-white\">\r\n");
      out.write("                        <form class=\"px-4 py-3\" action=\"LoginServlet\" method=\"post\">\r\n");
      out.write("                          <div class=\"input-group form-group\">\r\n");
      out.write("                            <div class=\"input-group-prepend\">\r\n");
      out.write("                                <span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input type=\"email\" class=\"form-control\" placeholder=\"E-posta\" name=\"email\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group form-group\">\r\n");
      out.write("                            <div class=\"input-group-prepend\">\r\n");
      out.write("                                <span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input type=\"password\" class=\"form-control\" placeholder=\"Şifre\" name=\"password\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                          <div class=\"form-group\">\r\n");
      out.write("                            <div class=\"form-check\">\r\n");
      out.write("                              <input type=\"checkbox\" class=\"form-check-input\" id=\"dropdownCheck\">\r\n");
      out.write("                              <label class=\"form-check-label\" for=\"dropdownCheck\">\r\n");
      out.write("                                Beni hatırla\r\n");
      out.write("                              </label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <button type=\"submit\" class=\"btn btn-danger float-right\">Giriş Yap</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <div class=\"dropdown-divide\"></div>\r\n");
      out.write("                        <a class=\"dropdown-item text-white\" href=\"register.jsp\">Buralarda yeni misiniz? Kayıt Ol</a>\r\n");
      out.write("                        <a class=\"dropdown-item text-white\" href=\"passwordResetEmail.jsp\">Şifrenizi mi unuttunuz?</a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>    \r\n");
      out.write("    </nav>\r\n");
      out.write("  </header>\r\n");
      out.write("      \r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template/searchFlight.jsp", out, false);
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      <br>\r\n");
      out.write("      <br><br>\r\n");
      out.write("      <br><br>\r\n");
      out.write("      <br><br>\r\n");
      out.write("      <br><br>\r\n");
      out.write("      <br><br>\r\n");
      out.write("      <br>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template/footer.jsp", out, false);
      out.write("\r\n");
      out.write("      \r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\" integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\" crossorigin=\"anonymous\"></script>\r\n");
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
