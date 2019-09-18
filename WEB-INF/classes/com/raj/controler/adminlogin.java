package com.raj.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.raj.util.DbConnect;

/**
 * Servlet implementation class adminlogin
 */
public class adminlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminlogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String Username = request.getParameter("Username");
		String Password = request.getParameter("Password");
		
		DbConnect db = new DbConnect();
        Connection con = db.getCon();
         Statement stmt = null;
         
         
         try {
			stmt = con.createStatement();
		
			ResultSet rs1 = stmt.executeQuery("select * from admin where Username = '"+Username+"' AND Password = '"+Password+"'");
					 HttpSession  session = request.getSession();
				     session.setAttribute("admin_username", Username);
				     
				     if(rs1.next()) {
				    	 writer.println("<script>alert('welcome Admin'+username)</script>");
				    	 	response.sendRedirect("/project/admin/appoint_leader.jsp");
						
				     }else
				     {
				    	 response.sendRedirect("/project/admin/admin_login.jsp");
				     }
         }catch(SQLException s)
         {
        	 s.printStackTrace();
         }
	}

}
