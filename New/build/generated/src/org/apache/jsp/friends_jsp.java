package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class friends_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Home</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"format-detection\" content=\"telephone=no\" />\n");
      out.write("<link rel=\"icon\" href=\"images/favicon.ico\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/jquery-migrate-1.1.1.js\"></script>\n");
      out.write("<script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("<script src=\"js/script.js\"></script> \n");
      out.write("<script src=\"js/superfish.js\"></script>\n");
      out.write("<script src=\"js/jquery.equalheights.js\"></script>\n");
      out.write("<script src=\"js/jquery.mobilemenu.js\"></script>\n");
      out.write("<script src=\"js/tmStickUp.js\"></script>\n");
      out.write("<script src=\"js/jquery.ui.totop.js\"></script>\n");
      out.write("<script>\n");
      out.write(" $(window).load(function(){\n");
      out.write("  $().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("  $('#stuck_container').tmStickUp({});  \n");
      out.write(" }); \n");
      out.write("</script>\n");
      out.write("<!--[if lt IE 8]>\n");
      out.write(" <div style=' clear: both; text-align:center; position: relative;'>\n");
      out.write("   <a href=\"http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode\">\n");
      out.write("     <img src=\"http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg\" border=\"0\" height=\"42\" width=\"820\" alt=\"You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today.\" />\n");
      out.write("   </a>\n");
      out.write("</div>\n");
      out.write("<![endif]-->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"js/html5shiv.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\" href=\"css/ie.css\">\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--==============================\n");
      out.write("              header\n");
      out.write("=================================-->\n");
      out.write("<header>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"grid_12 rel\">\n");
      out.write("          <br/>\n");
      out.write("          <h1 style=\"color: black; font-size: 50px;\" >Real-Time Detection of Traffic From Twitter Stream Analysis\n");
      out.write("\n");
      out.write("        </h1>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<!--    String name = session.getAttribute(\"name\").toString();-->\n");
      out.write("  \n");
      out.write("  <section id=\"stuck_container\">\n");
      out.write("  <!--==============================\n");
      out.write("              Stuck menu\n");
      out.write("  =================================-->\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"grid_12 \">\n");
      out.write("          <div class=\"navigation \">\n");
      out.write("            <nav>\n");
      out.write("              <ul class=\"sf-menu\">\n");
      out.write("               <li class=\"current\"><a href=\"index0.jsp\">Home</a></li>\n");
      out.write("               <li ><a href=\"sign_in.jsp\">Sign In</a></li>\n");
      out.write("               <li><a href=\"sign_up.jsp\">Sign Up</a></li>\n");
      out.write("               <li><a href=\"blog.jsp\">Blog</a></li>\n");
      out.write("               <li><a href=\"contacts.jsp\">Contacts</a></li>\n");
      out.write("             </ul>\n");
      out.write("            </nav>\n");
      out.write("<!--            <div class=\"clear\"></div>-->\n");
      out.write("          </div>       \n");
      out.write("<!--         <div class=\"clear\"></div>  -->\n");
      out.write("        </div>\n");
      out.write("     </div> \n");
      out.write("    </div> \n");
      out.write("  </section>\n");
      out.write("</header>\n");
      out.write("<!--=====================\n");
      out.write("          Content\n");
      out.write("======================-->\n");
      out.write("<section id=\"content\"><div class=\"ic\"></div>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"grid_12\">\n");
      out.write("<!--        <h3>Welcome   </h3>-->\n");
      out.write("\n");
      out.write("        <div class=\"extra_wrapper\">\n");
      out.write("             <form id=\"contact-form1\" action=\"sign_up0\"   >\n");
      out.write("                  <div class=\"contact-form-loader\"></div>\n");
      out.write("                   <table  style=\" margin-top: 50px; margin-left:20px;width:98%;\">\n");
      out.write("                    <tr style=\"background-color:  white; line-height: 50px; border-radius: 3px;color:lightseagreen;font-family:verdana;font-size:18px;font-weight: bold; \">\n");
      out.write("<!--                                    <td height=\"36\">File id</td>-->\n");
      out.write("                                    <td>Twitts</td>\n");
      out.write("                                    <td>By</td>\n");
      out.write("                                   \n");
      out.write("                                   \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                
try
{
 
// String user_name = session.getAttribute("username").toString();

Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost/traffic_from_twitter";
String username="root";
String password="root";
String query="select * from twitts ";
Connection con=DriverManager.getConnection(url,username,password);
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{
int id=rs.getInt("id"); 
 session.setAttribute("file_id", id);



                                
      out.write("\n");
      out.write("                                <tr style=\" color: black; font-size: 15px; font-weight: bold;  line-break: 80px; line-height: 40px; margin-top: 100px;\" >\n");
      out.write("                                     \n");
      out.write("   \n");
      out.write("   \n");
      out.write("    <td><font style =\"color: black\">");
      out.print(rs.getString("twitts") );
      out.write("</td>\n");
      out.write("    <td><font style =\"color: black\">");
      out.print(rs.getString("uname") );
      out.write("</td>\n");
      out.write("     <td> <font color=\"#FF0000\"><a href=\"remove_twitt.jsp?");
      out.print(id);
      out.write(',');
      out.print(rs.getString("uname"));
      out.write("\">remove</a></font> </td>\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("<!--    <td align=\"center\"><a href=\"DBFileDownloadServlet?");
      out.print(id);
      out.write("\">Download</a></td>\n");
      out.write("    <td align=\"center\"><a href=\"FileReadPdf?");
      out.print(id);
      out.write("\">View</a></td>\n");
      out.write("    <td align=\"center\"><a href=\"pdfdelete?");
      out.print(id);
      out.write("\">Delete</a></td>\n");
      out.write("    <td align=\"center\"><a href=\"DBImageShow?");
      out.print(id);
      out.write("\">delete</a></td>-->\n");
      out.write("    \n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("\n");
      out.write("                                    ");

                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }

                                    
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("<!--                  <fieldset>\n");
      out.write("                    <label class=\"name\">\n");
      out.write("                        <input type=\"text\" name=\"name\" placeholder=\"Name:\" value=\"\" required=\"\" />\n");
      out.write("                      \n");
      out.write("                    </label>\n");
      out.write("                      <br/>\n");
      out.write("                       <br/>\n");
      out.write("                        <br/>\n");
      out.write("                          <label class=\"name\">\n");
      out.write("                        <input type=\"password\" name=\"password\" placeholder=\"Password:\" value=\"\" required=\"\" />\n");
      out.write("                      \n");
      out.write("                    </label>\n");
      out.write("                      <br/>\n");
      out.write("                       <br/>\n");
      out.write("                        <br/>\n");
      out.write("                          <label class=\"name\">\n");
      out.write("                        <input type=\"password\" name=\"cpassword\" placeholder=\"Confirm Password:\" value=\"\" required=\"\" />\n");
      out.write("                      \n");
      out.write("                    </label>\n");
      out.write("                      <br/>\n");
      out.write("                       <br/>\n");
      out.write("                        <br/>\n");
      out.write("                   \n");
      out.write("                    <label class=\"email\">\n");
      out.write("                        <input type=\"email\" name=\"email\" placeholder=\"E-mail:\" value=\"\"  required=\"\" />\n");
      out.write("                 \n");
      out.write("                    </label>\n");
      out.write("                         <br/>\n");
      out.write("                       <br/>\n");
      out.write("                        <br/>\n");
      out.write("                    <label class=\"phone\">\n");
      out.write("                      <input type=\"text\" name=\"phone\" placeholder=\"Phone:\" value=\"\" required=\"\" />\n");
      out.write("                 \n");
      out.write("                    </label>\n");
      out.write("                   \n");
      out.write("                    <label class=\"message\">\n");
      out.write("                      <textarea name=\"message\" placeholder=\"Message:\" data-constraints='@Required @Length(min=20,max=999999)'></textarea>\n");
      out.write("                      <span class=\"empty-message\">*This field is required.</span>\n");
      out.write("                      <span class=\"error-message\">*The message is too short.</span>\n");
      out.write("                    </label>\n");
      out.write("                  \n");
      out.write("                    <div>\n");
      out.write("                        \n");
      out.write("                        <button  style=\"margin-right: 800px;\" class=\"btn\" type=\"submit\">Register</button>  <button  style=\"margin-right: 100px;\" class=\"btn\" type=\"reset\">Clear</button>\n");
      out.write("                    </div>\n");
      out.write("                  </fieldset> -->\n");
      out.write("<!--                  <div class=\"modal fade response-message\">\n");
      out.write("                    <div class=\"modal-dialog\">\n");
      out.write("                      <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                          <h4 class=\"modal-title\">Modal title</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                          You message has been sent! We will be in touch soon.\n");
      out.write("                        </div>      \n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>-->\n");
      out.write("                </form> \n");
      out.write("          \n");
      out.write("           <br/> \n");
      out.write("            <br/> \n");
      out.write("             <br/> \n");
      out.write("              <br/> \n");
      out.write("               <br/> \n");
      out.write("                   <br/> \n");
      out.write("            <br/> \n");
      out.write("             <br/> \n");
      out.write("              <br/> \n");
      out.write("               <br/> \n");
      out.write("                   <br/> \n");
      out.write("            <br/> \n");
      out.write("             <br/> \n");
      out.write("              <br/> \n");
      out.write("               <br/> \n");
      out.write("                   <br/> \n");
      out.write("            <br/> \n");
      out.write("             <br/> \n");
      out.write("              <br/> \n");
      out.write("               <br/> \n");
      out.write("                   <br/> \n");
      out.write("            <br/> \n");
      out.write("             <br/> \n");
      out.write("              <br/> \n");
      out.write("               <br/> \n");
      out.write("                   <br/> \n");
      out.write("            <br/> \n");
      out.write("             <br/> \n");
      out.write("              <br/> \n");
      out.write("               <br/> \n");
      out.write("                   <br/> \n");
      out.write("            <br/> \n");
      out.write("             <br/> \n");
      out.write("              <br/> \n");
      out.write("               <br/> \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("</section>\n");
      out.write("<!--==============================\n");
      out.write("              footer\n");
      out.write("=================================-->\n");
      out.write("<footer id=\"footer\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"grid_12\"> \n");
      out.write("        <div class=\"copyright\">  <a href=\"#\"></a>\n");
      out.write("          <div class=\"sub-copy\"> <a href=\"#\" rel=\"nofollow\"></a></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>  \n");
      out.write("</footer>\n");
      out.write("<a href=\"#\" id=\"toTop\" class=\"fa fa-chevron-up\"></a>\n");
      out.write("</body>\n");
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