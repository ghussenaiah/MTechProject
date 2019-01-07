package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index0_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--               <li><a href=\"blog.jsp\">Blog</a></li>\n");
      out.write("               <li><a href=\"contacts.jsp\">Contacts</a></li>-->\n");
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
      out.write("<section id=\"content\"><div class=\"ic\">More Website Templates @ TemplateMonster.com - July 28, 2014!</div>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"grid_12\">\n");
      out.write("        <h3>Abstract</h3>\n");
      out.write("\n");
      out.write("        <div class=\"extra_wrapper\">\n");
      out.write("           <p style=\" font-size: 24px; text-align: justify;\n");
      out.write("    padding-top: 5px;    \n");
      out.write("/*padding-bottom: 600px;*/\n");
      out.write("    font-style:italic;\n");
      out.write("    margin-bottom:30px;\n");
      out.write("    margin-left: 15px;\n");
      out.write("    margin-right: 15px;\n");
      out.write("    color: black;\n");
      out.write("    line-height: 40px;\n");
      out.write("    \n");
      out.write("/*    font-weight: 500px;*/\n");
      out.write("    \n");
      out.write("/*    border-bottom:1px dashed #00CA79;*/\n");
      out.write("font-family:Times New Roman ; \">Social networks have been recently employed as a\n");
      out.write("source of information for event detection, with particular refer-ence to road traffic congestion and car accidents. In this paper, we\n");
      out.write("present a real-time monitoring system fortraffic event detection\n");
      out.write("from Twitter stream analysis. The system fetches tweets from\n");
      out.write("Twitter according to several search criteria; processes tweets, by\n");
      out.write("applying text mining techniques; and finally performs the classifi-cation of tweets. The aim is to assign the appropriate class label to\n");
      out.write("each tweet, as related to atrafficevent or not. The traffic detection\n");
      out.write("system was employed for real-time monitoring of several areas of\n");
      out.write("the Italian road network, allowing for detection of traffic events\n");
      out.write("almost in real time, often before online traffic news web sites. We\n");
      out.write("employed the support vector machine as a classification model,\n");
      out.write("and we achieved an accuracy value of 95.75% by solving a binary\n");
      out.write("classification problem (traffic versus nontraffic tweets). We were\n");
      out.write("also able to discriminate if traffic is caused by an external event or\n");
      out.write("not, by solving a multiclass classification problem and obtaining\n");
      out.write("an accuracy value of 88.89%.\n");
      out.write("              </p>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <br/>\n");
      out.write("            \n");
      out.write("            <br/>\n");
      out.write("            \n");
      out.write("            <br/>\n");
      out.write("            \n");
      out.write("            <br/>\n");
      out.write("            \n");
      out.write("            <br/>\n");
      out.write("            \n");
      out.write("            <br/>\n");
      out.write("            \n");
      out.write("            <br/>\n");
      out.write("            \n");
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
