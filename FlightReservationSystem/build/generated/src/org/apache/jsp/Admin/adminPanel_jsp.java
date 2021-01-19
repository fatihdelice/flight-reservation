package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import flight.userdao.Admin;
import flight.userdao.UsersList;
import flight.userdao.Users;
import java.util.List;

public final class adminPanel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

 List<Users> users = new UsersList().getirTumListe();
 request.setAttribute("users", users);

      out.write('\r');
      out.write('\n');

 List<Admin> adminlist = new UsersList().getirTumAdminListe();
 request.setAttribute("admin", adminlist);

      out.write('\r');
      out.write('\n');
 
    Admin admin = (Admin) session.getAttribute("logAdmin");
    if(admin==null){
        response.sendRedirect("index.jsp");
    }

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <link type=\"image/png\" rel=\"icon\" size=\"512x512\" href=\"../Assets/flighticon.png\"> \r\n");
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("    <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    <title>Admin Panel</title> \r\n");
      out.write("    <!-- CDN JS  -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\" integrity=\"sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <!-- Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <!-- Jasny Bootstrap and JS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/jasny-bootstrap/4.0.0/css/jasny-bootstrap.min.css\">\r\n");
      out.write("    <script src=\"//cdnjs.cloudflare.com/ajax/libs/jasny-bootstrap/4.0.0/js/jasny-bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap select JS -->\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.2/js/bootstrap-select.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.5/js/i18n/defaults-ua_UA.js\"></script>\r\n");
      out.write("    <!-- FontAwesome and JS -->\r\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.8.2/js/all.js\" integrity=\"sha384-DJ25uNYET2XCl5ZF++U8eNxPWqcKohUUBUpKGlNLMchM7q4Wjg2CUpjHLaL8yYPH\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("    <!-- Bootstrap select CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.2/css/bootstrap-select.min.css\">\r\n");
      out.write("</head> \r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    body { min-height: 600px; background-image: url(../Assets/fly.jpg); background-size: cover; background-position: center top; }\r\n");
      out.write("    </style>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"container-fluid bg-dark p-1 border-bottom shadow\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-4 pt-2\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-4\">\r\n");
      out.write("                <h4 class=\"w-100 text-center\">\r\n");
      out.write("                    <a href=\"#\" class=\"text-decoration-none text-black-50\">\r\n");
      out.write("                        <img src=\"../Assets/flighticon.png\" height=\"40px\" style=\"width:35px!important\" />\r\n");
      out.write("                        <a class=\"navbar-brand text-white \" href=\"index.jsp\">&nbsp DeliceJet</a>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-4 text-right pt-2\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"container mt-5 bootstrap snippet\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                        <ul class=\"list-group mb-4\">\r\n");
      out.write("                            <li class=\"list-group-item\">");
      out.print( admin.getName() );
      out.write("&nbsp");
      out.print( admin.getSurname() );
      out.write("</li>\r\n");
      out.write("                            <li class=\"list-group-item d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                Eklenen Uçuşlar\r\n");
      out.write("                                <span class=\"badge badge-primary badge-pill\">1930</span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"list-group-item d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                Kayıtlı Kullanıcılar\r\n");
      out.write("                                <span class=\"badge badge-primary badge-pill\">5</span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"list-group-item d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                Yöneticiler\r\n");
      out.write("                                <span class=\"badge badge-primary badge-pill\">1</span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"list-group-item d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                Satılan Bilet \r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"list-group-item d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                E-posta bülteni\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul> \r\n");
      out.write("                    </div><!--/col-3-->\r\n");
      out.write("                    <div class=\"col-sm-9\">\r\n");
      out.write("                        <div class=\"card text-center\">\r\n");
      out.write("                            <div class=\"card-header\">\r\n");
      out.write("                                <ul class=\"nav nav-tabs nav-fill card-header-tabs\" id=\"myTab\" role=\"tablist\">\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link active\" id=\"home-tab\" data-toggle=\"tab\" href=\"#home\" role=\"tab\" aria-controls=\"home\" aria-selected=\"true\"><i class=\"fas fa-plane\"></i> Uçuş Ekle</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link\" id=\"history-order-tab\" data-toggle=\"tab\" href=\"#history-order\" role=\"tab\" aria-controls=\"profile\" aria-selected=\"false\"><i class=\"fas fa-user\"></i> Kayıtlı Kullanıcılar</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link\" id=\"bonus-list-tab\" data-toggle=\"tab\" href=\"#bonus-list\" role=\"tab\" aria-controls=\"contact\" aria-selected=\"false\"><i class=\"fas fa-users-cog\"></i> Yöneticiler</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link\" id=\"download-file-tab\" data-toggle=\"tab\" href=\"#download-file\" role=\"tab\" aria-controls=\"contact\" aria-selected=\"false\"><i class=\"fas fa-ticket-alt\"></i> Bilet Satış</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link\" href=\"../AdminLogoutServlet\"><i class=\"fas fa-sign-out-alt\"></i>Çıkış</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"tab-content card-body\" id=\"myTabContent\">\r\n");
      out.write("                                <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-6\">\r\n");
      out.write("                                            <form class=\"needs-validation\" novalidate>\r\n");
      out.write("                                                <div class=\"form-row\">\r\n");
      out.write("                                                    <div class=\"col-md-12 mb-3\">\r\n");
      out.write("                                                        <label for=\"validationTooltip01\">İsim</label>\r\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"validationTooltip01\" placeholder=\"name\" value=\"Fatih\" required>\r\n");
      out.write("                                                        <div class=\"valid-feedback\">\r\n");
      out.write("                                                            Bitti!\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                                            Lütfen bir isim girin.\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"col-md-12 mb-3\">\r\n");
      out.write("                                                        <label for=\"validationTooltip02\">Soyadı</label>\r\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"validationTooltip02\" placeholder=\"surname\" value=\"Delice\" required>\r\n");
      out.write("                                                        <div class=\"valid-feedback\">\r\n");
      out.write("                                                            Bitti!\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                                            Lütfen soyadınızı giriniz.\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"col-md-12 mb-3\">\r\n");
      out.write("                                                        <label for=\"validationTooltip03\">E-posta</label>\r\n");
      out.write("                                                        <input type=\"email\" class=\"form-control\" id=\"validationTooltip03\" placeholder=\"E-mail\" value=\"simple@example.com\" required>\r\n");
      out.write("                                                        <div class=\"valid-feedback\">\r\n");
      out.write("                                                            Bitti!\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                                            Lütfen E-posta adresinizi girin.\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"col-md-12 mb-3\">\r\n");
      out.write("                                                        <label for=\"validationTooltip04\">Теlefon</label>\r\n");
      out.write("                                                        <input type=\"number\" class=\"form-control\" id=\"validationTooltip04\" placeholder=\"phone\" value=\"054)345-67-89\" required>\r\n");
      out.write("                                                        <div class=\"valid-feedback\">\r\n");
      out.write("                                                            Bitti!\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                                            Lütfen şifrenizi giriniz.\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <button class=\"btn btn-primary\" type=\"submit\">Devam et</button>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-6\">\r\n");
      out.write("                                            <form class=\"needs-validation\" novalidate>\r\n");
      out.write("                                                <div class=\"form-row\">\r\n");
      out.write("                                                    <div class=\"col-md-12 mb-3\">\r\n");
      out.write("                                                        <label for=\"validationTooltip05\">Parola</label>\r\n");
      out.write("                                                        <input type=\"password\" class=\"form-control\" id=\"validationTooltip05\" placeholder=\"Şifre\" required>\r\n");
      out.write("                                                        <div class=\"valid-feedback\">\r\n");
      out.write("                                                            Bitti!\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"invalid-feedback\">\r\n");
      out.write("                                                            Lütfen şifrenizi giriniz.\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <button class=\"btn btn-primary\" type=\"submit\">Devam et</button>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"history-order\" role=\"tabpanel\" aria-labelledby=\"history-order-tab\">\r\n");
      out.write("                                    <table class=\"table table-sm table-hover table-bordered table-striped\"s>\r\n");
      out.write("                                        <thead class=\"thead-light\">\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th scope=\"col\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"users\">Kullanıcı ID</th>\r\n");
      out.write("                                                <th scope=\"col\">İsim</th>\r\n");
      out.write("                                                <th scope=\"col\">Soyisim</th>\r\n");
      out.write("                                                <th scope=\"col\">E-posta Adresi</th>\r\n");
      out.write("                                                <th scope=\"col\">Telefon Numarası</th>\r\n");
      out.write("                                                <th scope=\"col\">Kayıt Tarihi</th>\r\n");
      out.write("                                                <th></th>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"bonus-list\" role=\"tabpanel\" aria-labelledby=\"bonus-list-tab\">\r\n");
      out.write("                                    <table class=\"table table-sm table-hover table-bordered table-striped\">\r\n");
      out.write("                                        <thead class=\"thead-light\">\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"users\">Yönetici ID</th>\r\n");
      out.write("                                                <th scope=\"col\">İsim</th>\r\n");
      out.write("                                                <th scope=\"col\">Soyisim</th>\r\n");
      out.write("                                                <th scope=\"col\">E-posta Adresi</th>\r\n");
      out.write("                                                <th scope=\"col\">Telefon Numarası</th>\r\n");
      out.write("                                                <th></th>                                                \r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"download-file\" role=\"tabpanel\" aria-labelledby=\"download-file-tab\">\r\n");
      out.write("                                    <table class=\"table table-sm table-hover table-bordered table-striped\">\r\n");
      out.write("                                        <caption>1 ile 1 arasında 1 gösteriliyor (toplam 1 sayfa)</caption>\r\n");
      out.write("                                        <thead class=\"thead-light\">\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th scope=\"col\">Sipariş No</th>\r\n");
      out.write("                                                <th scope=\"col\">İsim</th>\r\n");
      out.write("                                                <th scope=\"col\">Boyut</th>\r\n");
      out.write("                                                <th scope=\"col\">Ekleme Tarihi</th>\r\n");
      out.write("                                                <th scope=\"col\"></th>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th class=\"align-middle\" scope=\"row\">3</th>\r\n");
      out.write("                                                <td class=\"align-middle\">Lprl</td>\r\n");
      out.write("                                                <td class=\"align-middle\">427.85KB</td>\r\n");
      out.write("                                                <td class=\"align-middle\">18.07.2019</td>\r\n");
      out.write("                                                <td class=\"align-middle\"><a href=\"\" class=\"btn btn-primary btn-sm\"><i class=\"fas fa-download\"></i></a></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!--/col-9-->\r\n");
      out.write("                </div><!--/row-->                \r\n");
      out.write("            </div>     \r\n");
      out.write("        </div> \r\n");
      out.write("    </div>   \r\n");
      out.write("    <br>\r\n");
      out.write("    <br><br>\r\n");
      out.write("    <br><br>\r\n");
      out.write("    <br><br>\r\n");
      out.write("    <br><br>\r\n");
      out.write("    <br><br>\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template/footer.jsp", out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        // Example starter JavaScript for disabling form submissions if there are invalid fields\r\n");
      out.write("        (function() {\r\n");
      out.write("          'use strict';\r\n");
      out.write("          window.addEventListener('load', function() {\r\n");
      out.write("            // Fetch all the forms we want to apply custom Bootstrap validation styles to\r\n");
      out.write("            var forms = document.getElementsByClassName('needs-validation');\r\n");
      out.write("            // Loop over them and prevent submission\r\n");
      out.write("            var validation = Array.prototype.filter.call(forms, function(form) {\r\n");
      out.write("              form.addEventListener('submit', function(event) {\r\n");
      out.write("                if (form.checkValidity() === false) {\r\n");
      out.write("                  event.preventDefault();\r\n");
      out.write("                  event.stopPropagation();\r\n");
      out.write("                }\r\n");
      out.write("                form.classList.add('was-validated');\r\n");
      out.write("              }, false);\r\n");
      out.write("            });\r\n");
      out.write("          }, false);\r\n");
      out.write("        })();\r\n");
      out.write("        $(function () {\r\n");
      out.write("          $('[data-toggle=\"tooltip\"]').tooltip()\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("users");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                <tr>\r\n");
          out.write("                                                    <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users.surname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td class=\"align-middle\"><a href=\"../DeleteServlet?id=");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\"  onClick=\"alert('Bu kullanıcıyı gerçekten silmek istiyor musunuz?')\"  class=\"btn btn-primary btn-sm\"><i class=\"far fa-trash-alt\"></i></a></td>\r\n");
          out.write("                                                </tr>\r\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adminlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("adminlist");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                <tr>\r\n");
          out.write("                                                    <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adminlist.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adminlist.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adminlist.surname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adminlist.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adminlist.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td class=\"align-middle\"><a href=\"../DeleteServlet?id=");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\"  onClick=\"alert('Bu yöneticiyi gerçekten silmek istiyor musunuz?')\"  class=\"btn btn-primary btn-sm\"><i class=\"far fa-trash-alt\"></i></a></td>\r\n");
          out.write("                                                </tr>\r\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adminlist.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }
}
