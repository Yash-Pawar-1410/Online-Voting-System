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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Registration Form Candidate</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style2.css\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  </head>\n");
      out.write("    <body>\n");
      out.write("  <div class=\" container\">\n");
      out.write("        <div class=\"title\">Registration for Candidate</div>\n");
      out.write("        <form method=\"post\" action=\"NewServlet\">\n");
      out.write("            <div class=\"user-details\">\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Full Name</span>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter your name\" required name=\"t1\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Voter Id</span>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter your voter Id\" required name=\"t2\">\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Birth Date</span>\n");
      out.write("                    <input type=\"date\" placeholder=\"Enter your age\" required name=\"t3\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Child</span>\n");
      out.write("                    <select name=\"t4\" style=\"height: 44px; width: 300px; border-radius: 10px;  border-color: #e9b9fc; border-bottom-width:3px ; \n");
      out.write("                      transition: all .3s ease; \" >\n");
      out.write("                        <option  >Select</option>\n");
      out.write("                        <option>1</option>\n");
      out.write("                        <option>2</option>\n");
      out.write("                        <option>3</option>\n");
      out.write("                        <option>4</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Election type</span>\n");
      out.write("                    <select name=\"t5\" style=\"height: 44px; width: 300px; border-radius: 10px;  border-color: #e9b9fc; border-bottom-width:3px ; \n");
      out.write("                      transition: all .3s ease; \" >\n");
      out.write("                        <option  >Select</option>\n");
      out.write("                        <option>Grampanchayat</option>\n");
      out.write("                        <option>Panchayat Samiti</option>\n");
      out.write("                        <option>Jilha Parishad</option>\n");
      out.write("                        <option>Nagarpalika</option>\n");
      out.write("                        <option>Mahanagar Palika</option>\n");
      out.write("                        <option>Vidhan Sabha</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Party</span>\n");
      out.write("                    <select name=\"t6\" style=\"height: 44px; width: 300px; border-radius: 10px;  border-color: #e9b9fc; border-bottom-width:3px ; \n");
      out.write("                      transition: all .3s ease; \" >\n");
      out.write("                        <option  >Select</option>\n");
      out.write("                        <option>BJP</option>\n");
      out.write("                        <option>Congress</option>\n");
      out.write("                        <option>Shivsena</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Address</span>\n");
      out.write("                <input type=\"address\" placeholder=\"Enter your address\" required name=\"t7\">\n");
      out.write("            </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Phone No.</span>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter your phone no.\" required name=\"t8\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Email</span>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter your email\" required name=\"t9\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Username</span>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter your username\" required name=\"t10\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Password</span>\n");
      out.write("                    <input type=\"password\" placeholder=\"Enter your password\" required name=\"t11\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Confirm Password</span>\n");
      out.write("                    <input type=\"password\" placeholder=\"Confirm your password\" >\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gender-details\">\n");
      out.write("                <input type=\"radio\"  id=\"dot-1\" name=\"t12\" value=\"Male\">\n");
      out.write("                <input type=\"radio\"  id=\"dot-2\" name=\"t12\" value=\"Female\">\n");
      out.write("                <input type=\"radio\"  id=\"dot-3\" name=\"t12\" value=\"Others\">\n");
      out.write("                <span class=\"gender-title\">Gender</span>\n");
      out.write("                <div class=\"category\">\n");
      out.write("                    <label for=\"dot-1\">\n");
      out.write("                        <span class=\"dot one\"></span>\n");
      out.write("                        <span class=\"gender\">Male</span>\n");
      out.write("                    </label>\n");
      out.write("                    <label for=\"dot-2\">\n");
      out.write("                        <span class=\"dot two\"></span>\n");
      out.write("                        <span class=\"gender\">Female</span>\n");
      out.write("                    </label>\n");
      out.write("                    <label for=\"dot-3\">\n");
      out.write("                        <span class=\"dot three\"></span>\n");
      out.write("                        <span class=\"gender\">Other</span>\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"button\">\n");
      out.write("                <input type=\"submit\" value=\"Register\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
