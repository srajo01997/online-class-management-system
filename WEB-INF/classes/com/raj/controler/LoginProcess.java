package com.raj.controler;

import java.io.IOException;

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


public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("user_name");
		String user_pass = request.getParameter("user_pass");
		String branch = request.getParameter("branch");
		
		 DbConnect db = new DbConnect();
         
         Connection con = db.getCon();
         Statement stmt = null;
        
         
         try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         if(branch.equalsIgnoreCase("it") )
         {	
        	  branch = "it";
        	 ResultSet rs1 = null;
			try {
				rs1 = stmt.executeQuery("select * from voter_register_it where username = '"+username+"' AND pass = '"+user_pass+"'");
					 
				     if(rs1.next()) {
				    	 HttpSession  session = request.getSession();
					     session.setAttribute("username", username);
					     session.setAttribute("branch",branch);
					     
				     RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
						dispatcher.forward(request, response);
				     }
				     else
				     {
				    	 request.setAttribute("invalidmsg", "Username or password is incorrect");
				    	 RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
							dispatcher.forward(request, response);
				     }
       } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }else if(branch.equalsIgnoreCase("comps"))
         {
        	 branch = "cs";
        	 ResultSet rs2 = null;
			try {
				rs2 = stmt.executeQuery("select * from voter_register_comps where username = '"+username+"' AND pass = '"+user_pass+"'");
					 
				     if(rs2.next()) {
				    	 HttpSession  session = request.getSession();
					     session.setAttribute("username", username);
					     session.setAttribute("branch",branch);
					    
				     RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
						dispatcher.forward(request, response);
				     }
				     else
				     {
				    	 request.setAttribute("invalidmsg", "Username or password is incorrect");
				    	 RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
							dispatcher.forward(request, response);
				     }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }else if(branch.equalsIgnoreCase("mech"))
         {
        	 branch = "mech";
        	 ResultSet rs3 = null;
			try {
				rs3 = stmt.executeQuery("select * from voter_register_mech where username = '"+username+"' AND pass = '"+user_pass+"'");
			
					 
				     if(rs3.next()) {
				    	 HttpSession  session = request.getSession();
					     session.setAttribute("username", username);
					     session.setAttribute("branch",branch);
					    
				     RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
						dispatcher.forward(request, response);
				     }
				     else
				     {
				    	 request.setAttribute("invalidmsg", "Username or password is incorrect");
				    	 RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
							dispatcher.forward(request, response);
				     }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }else if(branch.equalsIgnoreCase("ele"))
         {
        	 branch = "ele";
        	 ResultSet rs4 = null;
			try {
				rs4 = stmt.executeQuery("select * from voter_register_ele where username = '"+username+"' AND pass = '"+user_pass+"'");
			
					 
				     if(rs4.next()) {
				    	 HttpSession  session = request.getSession();
					     session.setAttribute("username", username);
					     session.setAttribute("branch",branch);
					     
				     RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
						dispatcher.forward(request, response);
				     }
				     else
				     {
				    	 request.setAttribute("invalidmsg", "Username or password is incorrect");
				    	 RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
							dispatcher.forward(request, response);
				     }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }else 
             {
        	 branch = "extc";
        	 ResultSet rs5 = null;
			try {
				rs5 = stmt.executeQuery("select * from voter_register_extc where username = '"+username+"' AND pass = '"+user_pass+"'");
					 
				     if(rs5.next()) {
				    	 HttpSession  session = request.getSession();
					     session.setAttribute("username", username);
					     session.setAttribute("branch",branch);
					    
				     RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
						dispatcher.forward(request, response);
				     }
				     else
				     {
				    	 request.setAttribute("invalidmsg", "Username or password is incorrect");
				    	 RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
							dispatcher.forward(request, response);
				     }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
             }
         try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

         
