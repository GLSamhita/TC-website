<%-- 
    Document   : view
    Created on : 27 Mar, 2020, 9:36:56 PM
    Author     : G.L.Samhita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String usn = request.getParameter("usn");
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Application Details</title>
        <link rel="stylesheet" href="applystyle.css" type="text/css">
    </head>
    <body>
        <h2>CANDIDATE APPLICATION DETAILS</h2>
        <%
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
        %>
    </body>
</html>
