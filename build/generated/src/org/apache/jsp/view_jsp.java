package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String usn = request.getParameter("usn");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Application Details</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"applystyle.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>CANDIDATE APPLICATION DETAILS</h2>\n");
      out.write("        ");

            try
            {
               Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TC", "sam", "sam"); 
               String sql="select * from tcapps where usn=?";
               PreparedStatement ps=conn.prepareStatement(sql);
               ps.setString(1,usn);
               ResultSet rs=ps.executeQuery();
               if(rs.next())
               {
                   out.println("<br>Name:"+rs.getString(1));
                   out.println("<br>Class:"+rs.getString(2));
                   out.println("<br>Section:"+rs.getString(3));
                   out.println("<br>6-Digit USN:"+rs.getString(4));
                   out.println("<br>Gender:"+rs.getString(5));
                   out.println("<br>Current Class Teacher:"+rs.getString(6));
                   out.println("<br>Class in which student joined:"+rs.getString(7));
                   out.println("<br>Attendance percentage for the current academic year:"+rs.getString(8));
                   out.println("<br>Parent's Name:"+rs.getString(9));
                   out.println("<br>Parent's Phone number:"+rs.getString(10));
                   out.println("<br>Date of Birth:"+rs.getString(11));
                   
               }
               else
               {
                   out.println("Student has not applied for TC");
               }
               conn.close();
               
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        
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
