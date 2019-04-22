package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TestAjax_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("  $(\"button\").click(function(){\n");
      out.write("    $.get(\"DashBoardController\", function(data, status){\n");
      out.write("      //alert(\"Data: \" + data + \"\\nStatus: \" + status);\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      var a = JSON.parse(data);\n");
      out.write("//      for (x in data) {\n");
      out.write("//       // txt += \"<tr><td>\" + x.name + \"</td></tr>\";\n");
      out.write("//         $(\"#test1\").text(name.student);\n");
      out.write("//      }\n");
      out.write("\n");
      out.write("      console.log(a);\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      var car = {type:\"Fiat\", model:\"500\", color:\"white\"};\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      console.log(car);\n");
      out.write("      console.log(car.type);\n");
      out.write("     $(\"#test1\").text(a.lastname);\n");
      out.write("      \n");
      out.write("    });\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<button>Send an HTTP GET request to a page and get the result back</button>\n");
      out.write("\n");
      out.write("<span id=\"test1\">  </span>\n");
      out.write("\n");
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
