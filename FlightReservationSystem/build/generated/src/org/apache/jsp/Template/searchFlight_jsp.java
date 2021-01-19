package org.apache.jsp.Template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class searchFlight_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<div class=\"search-flight-container\">\r\n");
      out.write("    <div class=\"d-flex justify-content-left h-100\">\r\n");
      out.write("        <div class=\"search-flight-card\">\r\n");
      out.write("            <div class=\"card-header d-flex justify-content-left\">\r\n");
      out.write("                <ul class=\"nav nav-tabs\" id=\"myTab\" role=\"tablist\">\r\n");
      out.write("                   <li class=\"nav-item\" role=\"presentation\">\r\n");
      out.write("                      <a class=\"nav-link active links\" id=\"ticket-tab\" data-toggle=\"tab\" href=\"#ticket\" role=\"tab\" aria-controls=\"ticket\" aria-selected=\"true\">Uçak Bileti</a>\r\n");
      out.write("                   </li>\r\n");
      out.write("                   <li class=\"nav-item\" role=\"presentation\">\r\n");
      out.write("                       <a class=\"nav-link links\" id=\"checkin-tab\" data-toggle=\"tab\" href=\"#checkin\" role=\"tab\" aria-controls=\"checkin\" aria-selected=\"false\">Online Check-in</a>\r\n");
      out.write("                   </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("                <div class=\"tab-content\" id=\"pills-tabContent\">\r\n");
      out.write("                    <div class=\"tab-pane fade show active\" id=\"ticket\" role=\"tabpanel\" aria-labelledby=\"ticket-tab\">\r\n");
      out.write("                        <div class=\"text-white\">\r\n");
      out.write("                            <input id=\"one_way\" type=\"radio\" name=\"tab-group-1\" checked /><label for=\"one_way\">Tek Yön</label>\r\n");
      out.write("                            <input id=\"return\" type=\"radio\" name=\"tab-group-1\" /><label for=\"return\">Gidiş-Dönüş</label>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"tab-content\">                            \r\n");
      out.write("                            <div class=\"tab-pane  active\" id=\"tekyon\" role=\"tabpanel\" aria-labelledby=\"tekyon-tab\">\r\n");
      out.write("                                <form class=\"needs-validation\"  action=\"Template/foundflights.jsp\" method=\"post\">\r\n");
      out.write("                                    <div class=\"form-row\">\r\n");
      out.write("                                        <div class=\"col-md-3 mb-3 text-white\">\r\n");
      out.write("                                            <label for=\"validationTooltip01\">Nereden</label>\r\n");
      out.write("                                            <select class=\"browser-default custom-select\" name=\"from_location\" required>\r\n");
      out.write("                                                <option selected>Seç...</option>\r\n");
      out.write("                                                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "iller.jsp", out, false);
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-3 mb-3 text-white\">\r\n");
      out.write("                                            <label for=\"validationTooltip02\">Nereye</label>\r\n");
      out.write("                                            <select class=\"browser-default custom-select\" name=\"to_location\" required>\r\n");
      out.write("                                                <option selected>Seç...</option>\r\n");
      out.write("                                                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "iller.jsp", out, false);
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-row\">\r\n");
      out.write("                                        <div class=\"col-md-3 mb-3 text-white\">\r\n");
      out.write("                                            <label for=\"validationTooltip02\">Gidiş</label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"date\" id=\"example-date-input\" name=\"flight_date\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-3 mb-3 text-white\">\r\n");
      out.write("                                            <label for=\"validationTooltip02\">Yolcular</label>\r\n");
      out.write("                                            <select class=\"browser-default custom-select\" required>\r\n");
      out.write("                                                <option selected>Seç...</option>\r\n");
      out.write("                                                <option value=\"ytskn\">Yetişkin</option>\r\n");
      out.write("                                                <option value=\"cck\">Çocuk</option>\r\n");
      out.write("                                                <option value=\"bbk\">Bebek</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-10 mb-3 text-white\">\r\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-danger\">Uçuş Ara</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"tab-pane\" id=\"gidisdonus\" role=\"tabpanel\" aria-labelledby=\"return-tab\">\r\n");
      out.write("                                <form class=\"needs-validation\" action=\"Template/foundflights.jsp\" method=\"post\">\r\n");
      out.write("                                    <div class=\"form-row\">\r\n");
      out.write("                                        <div class=\"col-md-3 mb-3 text-white\">\r\n");
      out.write("                                            <label for=\"validationTooltip01\">Nereden</label>\r\n");
      out.write("                                            <select class=\"browser-default custom-select\" name=\"from_location\" required>\r\n");
      out.write("                                                <option selected>Seç...</option>\r\n");
      out.write("                                                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "iller.jsp", out, false);
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-3 mb-3 text-white\">\r\n");
      out.write("                                            <label for=\"validationTooltip02\">Nereye</label>\r\n");
      out.write("                                            <select class=\"browser-default custom-select\" name=\"to_location\" required>\r\n");
      out.write("                                                <option selected>Seç...</option>\r\n");
      out.write("                                                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "iller.jsp", out, false);
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-row\">\r\n");
      out.write("                                        <div class=\"col-md-3 mb-3 text-white\">\r\n");
      out.write("                                            <label for=\"validationTooltip02\">Gidiş</label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"date\" id=\"example-date-input\" name=\"flight_date\"required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-3 mb-3 text-white\">\r\n");
      out.write("                                            <label for=\"validationTooltip02\">Dönüş</label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"date\" id=\"example-date-input\" name=\"flight_date\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-3 mb-3 text-white\">\r\n");
      out.write("                                            <label for=\"validationTooltip02\">Yolcular</label>\r\n");
      out.write("                                            <select class=\"browser-default custom-select\" required>\r\n");
      out.write("                                                <option selected>Seç...</option>\r\n");
      out.write("                                                <option value=\"ytskn\">Yetişkin</option>\r\n");
      out.write("                                                <option value=\"cck\">Çocuk</option>\r\n");
      out.write("                                                <option value=\"bbk\">Bebek</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div> \r\n");
      out.write("                                        <div class=\"col-md-4 mb-3 text-white\">\r\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-danger\">Uçuş Ara</button>\r\n");
      out.write("                                        </div> \r\n");
      out.write("                                    </div>    \r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"checkin\" role=\"tabpanel\" aria-labelledby=\"checkin-tab\">\r\n");
      out.write("                        <form class=\"needs-validation\">\r\n");
      out.write("                            <div class=\"form-row field\">\r\n");
      out.write("                                <div class=\"col-md-6 mb-3 text-white\">\r\n");
      out.write("                                    <input type=\"text\"  autocomplete=\"off\" id=\"surname\" required/>\r\n");
      out.write("                                    <label for=\"surname\" title=\"Yolcunun Soyadı\" data-title=\"Yolcunun Soyadı\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6 mb-3 text-white field\">\r\n");
      out.write("                                    <input type=\"text\" style=\"text-transform: uppercase !important\" maxlength=\"6\" minlength=\"6\" autocomplete=\"off\" id=\"reservationcode\" required/>\r\n");
      out.write("                                    <label for=\"reservationcode\" title=\"Rezervasyon Kodu (PNR)\" data-title=\"Rezervasyon Kodu (PNR)\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-danger float-right\">Devam</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>                          \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("                                            \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    document.getElementById(\"return\").addEventListener(\"change\", function(){\r\n");
      out.write("        document.getElementById(\"gidisdonus\").classList.add(\"active\");\r\n");
      out.write("        document.getElementById(\"tekyon\").classList.remove(\"active\");\r\n");
      out.write("        \r\n");
      out.write("    })\r\n");
      out.write("    document.getElementById(\"one_way\").addEventListener(\"change\", function(){\r\n");
      out.write("        document.getElementById(\"tekyon\").classList.add(\"active\");\r\n");
      out.write("        document.getElementById(\"gidisdonus\").classList.remove(\"active\");\r\n");
      out.write("        \r\n");
      out.write("    })\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</script>");
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
