package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class apply_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Application submitted</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"applystyle.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String studentname=request.getParameter("studentname");
            String classs=request.getParameter("classs");
            String section=request.getParameter("section");
            String usn=request.getParameter("usn");
            String dob=request.getParameter("dob");
            String gender=request.getParameter("gender");
            String classteacher=request.getParameter("classteacher");
            String coj=request.getParameter("coj");
            String attendance=request.getParameter("attendance");
            String parentname=request.getParameter("parentname");
            String phno=request.getParameter("phno");
            try
            {//try
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/TC","sam","sam");
                Statement st=conn.createStatement();
                int i=st.executeUpdate("insert into tcapps(studentname,classs,section,usn,gender,classteacher,coj,attendance,parentname,phno,dob)"+ "values('"+(studentname+"','"+classs+"','"+section+"','"+usn+"','"+gender+"','"+classteacher+"','"+coj+"','"+attendance+"','"+parentname+"','"+phno+"','"+dob+"')"));
                out.println("<h2>Application submitted successsfully.<br>The school will get in touch with you soon for further formalities.</h2>");
            }//try
            catch(Exception e)
            {//catch
                out.print(e);
                e.printStackTrace();
            }//catch
        
      out.write("\n");
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
