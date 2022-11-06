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

/**
 *
 * @author Lenovo
 */
public class NewServlet2 extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            String field1=request.getParameter("t1");
            int field2=Integer.parseInt(request.getParameter("t2"));
            String field3=request.getParameter("t3");
            String field4=request.getParameter("t4");
            String field5=request.getParameter("t5");
            String field6=request.getParameter("t6");
            String field7=request.getParameter("t7");
            String field8=request.getParameter("t8");
            String field9=request.getParameter("t9");
            String field10=request.getParameter("t10");
            String field11=request.getParameter("t11");
            
               
           
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
                PreparedStatement pst=con.prepareStatement("insert into registrationforvoter values(?,?,?,?,?,?,?,?,?,?)");
              if(field9.equals(field11))
              {
                pst.setString(1,field1);
                pst.setInt(2,field2);
                pst.setString(3,field3);
                pst.setString(4,field4);
                pst.setString(5,field5);
                pst.setString(6,field6);
                pst.setString(7,field7);
                pst.setString(8,field8);
                pst.setString(9,field9);
                pst.setString(10,field10);
                
              
                int k=pst.executeUpdate();
              request.getRequestDispatcher("index.html").forward(request, response);
               
              }
              else
                  request.getRequestDispatcher("newjsp.jsp").forward(request, response);
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
