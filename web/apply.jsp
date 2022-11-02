<%-- 
    Document   : apply
    Created on : 27 Mar, 2020, 7:44:31 PM
    Author     : G.L.Samhita
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Application submitted</title>
        <link rel="stylesheet" href="applystyle.css" type="text/css">
    </head>
    <body>
        <%
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
        %>
    </body>
</html>
