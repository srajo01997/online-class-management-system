package com.raj.controler;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.raj.util.DbConnect;

public class register extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String fname = request.getParameter("fname");
    	String lname = request.getParameter("sname");
    	String username = request.getParameter("user_name");
    	String email = request.getParameter("email");
    	String ph_no = request.getParameter("user_ph");
    	String branch = request.getParameter("branch");
    	String year = request.getParameter("year");
    	String enroll_no = request.getParameter("enroll_no");
    	String pass = request.getParameter("user_pass");
    	
    	
DbConnect db = new DbConnect();
        
        
        Connection con = db.getCon();
        Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
		if(branch.equalsIgnoreCase("it"))
        {
      	  try {
      	  ResultSet rs1= stmt.executeQuery("select * from voter_register_it where username = '"+username+"' OR enroll_no = '"+enroll_no+"'");
          
            if(rs1.next()){
          	  request.setAttribute("alreadymsg", "User already exists.");
          	  response.sendRedirect("http://localhost:8000/project/register.jsp");
            }else
          	  {
      	  stmt.executeUpdate("insert into voter_register_it(fname,lname,username,email,ph_no,year,enroll_no,pass)values('"+fname+"',"
      	  		+ "'"+lname+"','"+username+"','"+email+"','"+ph_no+"','"+year+"','"+enroll_no+"','"+pass+"')");
      	            
      	         response.sendRedirect("http://localhost:8000/project/login.jsp");
          	  }  
      	  } catch (Exception e) {
                System.out.println(e);
            }
        }else if(branch.equalsIgnoreCase("comps"))
        {
      	  try {
      	  ResultSet rs1= stmt.executeQuery("select * from voter_register_comps where username = '"+username+"' OR enroll_no = '"+enroll_no+"'");
            
            if(rs1.next()){
            	request.setAttribute("alreadymsg", "User already exists.");
          	  response.sendRedirect("http://localhost:8000/project/register.jsp");
            }else
          	  {
      	  
      	  stmt.executeUpdate("insert into voter_register_comps(fname,lname,username,email,ph_no,year,enroll_no,pass)values('"+fname+"',"
      	  		+ "'"+lname+"','"+username+"','"+email+"','"+ph_no+"','"+year+"','"+enroll_no+"','"+pass+"')");
      	            writer.println("registration success");
      	         writer.println("<script>alert('Register Success.')</script>");
      	         response.sendRedirect("http://localhost:8000/project/login.jsp");
          	  }
      	  } catch (Exception e) {
                System.out.println(e);
            }
        }else if(branch.equalsIgnoreCase("mech"))
        {
      	  try
      	  {
      	  ResultSet rs1= stmt.executeQuery("select * from voter_register_mech where username = '"+username+"' OR enroll_no = '"+enroll_no+"'");
            
            if(rs1.next()){
            	request.setAttribute("alreadymsg", "User already exists.");
          	  response.sendRedirect("http://localhost:8000/project/register.jsp");
            }else
          	  {
      	  
      	  stmt.executeUpdate("insert into voter_register_mech(fname,lname,username,email,ph_no,year,enroll_no,pass)values('"+fname+"',"
        	  		+ "'"+lname+"','"+username+"','"+email+"','"+ph_no+"','"+year+"','"+enroll_no+"','"+pass+"')");
        	            writer.println("registration success");
        	         writer.println("<script>alert('Register Success.')</script>");
        	       response.sendRedirect("http://localhost:8000/project/login.jsp");
          	  }
      	  } catch (Exception e) {
                System.out.println(e);
            }
        }else if(branch.equalsIgnoreCase("ele"))
        {
      	  try
      	  {
      		  
      	  
      	  ResultSet rs1= stmt.executeQuery("select * from voter_register_ele where username = '"+username+"' OR enroll_no = '"+enroll_no+"'");
            
            if(rs1.next()){
            	request.setAttribute("alreadymsg", "User already exists.");
          	  response.sendRedirect("http://localhost:8000/project/register.jsp");
            }else
          	  {
      	  
      	  stmt.executeUpdate("insert into voter_register_ele(fname,lname,username,email,ph_no,year,enroll_no,pass)values('"+fname+"',"
        	  		+ "'"+lname+"','"+username+"','"+email+"','"+ph_no+"','"+year+"','"+enroll_no+"','"+pass+"')");
        	            writer.println("registration success");
        	         writer.println("<script>alert('Register Success.')</script>");
        	       response.sendRedirect("http://localhost:8000/project/login.jsp");
          	  }
      	  } catch (Exception e) {
                System.out.println(e);
            }
        }else if(branch.equalsIgnoreCase("extc"))
        {
      	  try {
      		  
      	  
      	  ResultSet rs1= stmt.executeQuery("select * from voter_register_extc where username = '"+username+"' OR enroll_no = '"+enroll_no+"'");
            
            if(rs1.next()){
            	request.setAttribute("alreadymsg", "User already exists.");
          	  response.sendRedirect("http://localhost:8000/project/register.jsp");
            }else
          	  {
      	  
      	  stmt.executeUpdate("insert into voter_register_extc(fname,lname,username,email,ph_no,year,enroll_no,pass)values('"+fname+"',"
        	  		+ "'"+lname+"','"+username+"','"+email+"','"+ph_no+"','"+year+"','"+enroll_no+"','"+pass+"')");
        	            writer.println("registration success");
        	         writer.println("<script>alert('Register Success.')</script>");
        	       response.sendRedirect("http://localhost:8000/project/login.jsp");
          	  }
      	  } catch (Exception e) {
                System.out.println(e);
            }
        }else
        {
      	  response.sendRedirect("http://localhost:8000/project/index.jsp");
        }
         
      
        
        
    	
        
          
    	try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    

          
          
        
    
    	
    	
}
}


