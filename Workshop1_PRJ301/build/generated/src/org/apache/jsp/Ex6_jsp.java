package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ex6_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ex6</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

          String result="";
          if(request.getAttribute("result")!= null)
            result = (String)request.getAttribute("result");
            
        
      out.write("\n");
      out.write("        <form action=\"bai6\" method='get'>\n");
      out.write("            <h1 style=\"color: blue; text-align: center\">GIAI PHUONG TRINH\n");
      out.write("            <br> BAC NHAT</h1>\n");
      out.write("            <div style=\"margin-left: 40px\">Nhap a: <input type='text' name='a'></div>\n");
      out.write("            <div style=\"margin-top: 20px; margin-left: 40px\">Nhap b: <input type='text' name='b'></div>\n");
      out.write("            <div style=\"margin-top: 20px; margin-left:150px\"><input type='submit' name='Tim' value='Tìm'></div>\n");
      out.write("            <div style=\"margin-left: 40px\">Ket luan nghiem: <br><input style=\"padding-right: 70px;width:200px; height:50px;\" type='text' cols=\"40\" rows=\"5\"  name='result' value=\"");
      out.print(result);
      out.write("\" readonly></div>\n");
      out.write("        </form>  \n");
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
