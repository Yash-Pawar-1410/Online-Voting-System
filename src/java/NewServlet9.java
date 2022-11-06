/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lenovo
 */
public class NewServlet9 extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
 try
            {
                String dbDriver="com.mysql.jdbc.Driver";
                String dbURL="jdbc:mysql://localhost:3306/";
                //Database name to access
                String dbName="online voting sysytem";
                String dbUsername="root";
                String dbPassword="";
                Class.forName(dbDriver);
                Connection con=DriverManager.getConnection(dbURL+dbName,dbUsername,dbPassword);
                 Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
  ResultSet rs=st.executeQuery("select * from registrationforcandidate order by vcount desc");
  List dt=new ArrayList();
            while(rs.next())
            {
           dt.add(rs.getString("FullName")+":"+rs.getInt("VoterId")+":"+rs.getString("BirthDate")+":"+rs.getString("Electiontype")+":"+rs.getString("Address")+":"+rs.getString("Gender")+":"+rs.getInt("vcount"));
            }
            request.setAttribute("Yash3", dt);
            request.getRequestDispatcher("newjsp9.jsp").forward(request, response);
    
            }catch(Exception ee){out.println(ee);}  
               } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
