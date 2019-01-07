package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Blog</title>\n");
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
      out.write("        <h1>\n");
      out.write("          <a href=\"index.jsp\">\n");
      out.write("            <img src=\"images/logo.png\" alt=\"Logo alt\">\n");
      out.write("          </a>\n");
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
      out.write("               <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("               <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("               <li><a href=\"services.jsp\">Services</a></li>\n");
      out.write("               <li class=\"current\"><a href=\"blog.jsp\">Blog</a></li>\n");
      out.write("               <li><a href=\"contacts.jsp\">Contacts</a></li>\n");
      out.write("             </ul>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("          </div>       \n");
      out.write("         <div class=\"clear\"></div>  \n");
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
      out.write("        <h3>Our Blog</h3>\n");
      out.write("        <div class=\"blog\">\n");
      out.write("          <time datetime=\"2014-01-01\"><span class=\"count\">02</span><strong>July</strong>2014</time>\n");
      out.write("          <img src=\"images/page4_img1.jpg\" alt=\"\" class=\"img_inner fleft\">\n");
      out.write("          <div class=\"extra_wrapper\">\n");
      out.write("            <a href=\"#\" class=\"comment\"><span class=\"fa fa-comments\"></span> 3</a>\n");
      out.write("            <p><span class=\"fwn\"><a href=\"#\">Livamus at magna non nunc tristique rhoncus. Aliquam nibh ante, egestas id dictum.</a></span><em>Posted by <a href=\"#\">Admin</a></em></p>Curabitur vel lorem sit amet nulla ullamcorper fermentum. In vitae varius augue, eu consectetur ligula. Etiam dui eros, laoreet site amet est vel, commodo venenatis eros. Fusce adipiscing quam id risus sagittis, non consequat lacus interdumertolo mokiju werto <br>\n");
      out.write("            nulla, eu sodales arcu. Quisque viverra nulla nunc, eu ultrices libero ultricies eget. Phasellus accumsan justo vitae feugiat placerat. Praesent vel ultrices velit. Suspendisse risus justo, lacinia vitae eleifend sed, cursus sit amet. Huisque viverra nulla nunc, eu ultrices libero ultricies eget. Ohasellus accumsajusto vitae feugiat placerat. Praesent vel ultrices velit. Suspendisse risus justo, lacinia vitae eleifend sed, cursus sit amet ertolomino kolinomi holo. \n");
      out.write("            <br>\n");
      out.write("            <a href=\"#\" class=\"link-1\">more</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"blog\">\n");
      out.write("          <time datetime=\"2014-01-01\"><span class=\"count\">05</span><strong>July</strong>2014</time>\n");
      out.write("          <img src=\"images/page4_img2.jpg\" alt=\"\" class=\"img_inner fleft\">\n");
      out.write("          <div class=\"extra_wrapper\">\n");
      out.write("            <a href=\"#\" class=\"comment\"><span class=\"fa fa-comments\"></span> 1</a>\n");
      out.write("            <p><span class=\"fwn\"><a href=\"#\">Deliquam nibh ante, egestas id dictum. Phasellus erat nisl, auctor vel velit sed, pharetra.</a></span><em>Posted by <a href=\"#\">Admin</a></em></p>Curabitur vel lorem sit amet nulla ullamcorper fermentum. In vitae varius augue, eu consectetur ligula. Etiam dui eros, laoreet site amet est vel, commodo venenatis eros. Fusce adipiscing quam id risus sagittis, non consequat lacus interdumertolo mokiju werto <br>\n");
      out.write("            nulla, eu sodales arcu. Quisque viverra nulla nunc, eu ultrices libero ultricies eget. Phasellus accumsan justo vitae feugiat placerat. Praesent vel ultrices velit. Suspendisse risus justo, lacinia vitae eleifend sed, cursus sit amet. Huisque viverra nulla nunc, eu ultrices libero ultricies eget. Ohasellus accumsajusto vitae feugiat placerat. Praesent vel ultrices velit. Suspendisse risus justo, lacinia vitae eleifend sed, cursus sit amet ertolomino kolinomi holo. \n");
      out.write("            <br>\n");
      out.write("            <a href=\"#\" class=\"link-1\">more</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"blog\">\n");
      out.write("          <time datetime=\"2014-01-01\"><span class=\"count\">12</span><strong>July</strong>2014</time>\n");
      out.write("          <img src=\"images/page4_img3.jpg\" alt=\"\" class=\"img_inner fleft\">\n");
      out.write("          <div class=\"extra_wrapper\">\n");
      out.write("            <a href=\"#\" class=\"comment\"><span class=\"fa fa-comments\"></span> 2</a>\n");
      out.write("            <p><span class=\"fwn\"><a href=\"#\">Ellus erat nisl, auctor vel velit sed, pharetraiue rhoncliquam nibh ante, egestas id dictuy.</a></span><em>Posted by <a href=\"#\">Admin</a></em></p>Curabitur vel lorem sit amet nulla ullamcorper fermentum. In vitae varius augue, eu consectetur ligula. Etiam dui eros, laoreet site amet est vel, commodo venenatis eros. Fusce adipiscing quam id risus sagittis, non consequat lacus interdumertolo mokiju werto <br>\n");
      out.write("            nulla, eu sodales arcu. Quisque viverra nulla nunc, eu ultrices libero ultricies eget. Phasellus accumsan justo vitae feugiat placerat. Praesent vel ultrices velit. Suspendisse risus justo, lacinia vitae eleifend sed, cursus sit amet. Huisque viverra nulla nunc, eu ultrices libero ultricies eget. Ohasellus accumsajusto vitae feugiat placerat. Praesent vel ultrices velit. Suspendisse risus justo, lacinia vitae eleifend sed, cursus sit amet ertolomino kolinomi holo. \n");
      out.write("            <br>\n");
      out.write("            <a href=\"#\" class=\"link-1\">more</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"blog\">\n");
      out.write("          <time datetime=\"2014-01-01\"><span class=\"count\">22</span><strong>July</strong>2014</time>\n");
      out.write("          <img src=\"images/page4_img4.jpg\" alt=\"\" class=\"img_inner fleft\">\n");
      out.write("          <div class=\"extra_wrapper\">\n");
      out.write("            <a href=\"#\" class=\"comment\"><span class=\"fa fa-comments\"></span> 0</a>\n");
      out.write("            <p><span class=\"fwn\"><a href=\"#\">Mamus at magna non nunc tristique rhoncus. Aliquam nibh ante, egestas id dictumo.</a></span><em>Posted by <a href=\"#\">Admin</a></em></p>Curabitur vel lorem sit amet nulla ullamcorper fermentum. In vitae varius augue, eu consectetur ligula. Etiam dui eros, laoreet site amet est vel, commodo venenatis eros. Fusce adipiscing quam id risus sagittis, non consequat lacus interdumertolo mokiju werto <br>\n");
      out.write("            nulla, eu sodales arcu. Quisque viverra nulla nunc, eu ultrices libero ultricies eget. Phasellus accumsan justo vitae feugiat placerat. Praesent vel ultrices velit. Suspendisse risus justo, lacinia vitae eleifend sed, cursus sit amet. Huisque viverra nulla nunc, eu ultrices libero ultricies eget. Ohasellus accumsajusto vitae feugiat placerat. Praesent vel ultrices velit. Suspendisse risus justo, lacinia vitae eleifend sed, cursus sit amet ertolomino kolinomi holo. \n");
      out.write("            <br>\n");
      out.write("            <a href=\"#\" class=\"link-1\">more</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<!--==============================\n");
      out.write("              footer\n");
      out.write("=================================-->\n");
      out.write("<footer id=\"footer\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"grid_12\"> \n");
      out.write("        <div class=\"copyright\"><span class=\"brand\">Stable</span> &copy; <span id=\"copyright-year\"></span> | <a href=\"#\">Privacy Policy</a>\n");
      out.write("          <div class=\"sub-copy\">Website designed by <a href=\"http://www.templatemonster.com/\" rel=\"nofollow\">TemplateMonster.com</a></div>\n");
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
