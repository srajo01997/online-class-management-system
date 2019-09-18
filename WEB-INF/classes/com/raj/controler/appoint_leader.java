package com.raj.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.raj.util.DbConnect;

/**
 * Servlet implementation class appoint_leader
 */
public class appoint_leader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public appoint_leader() {
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
		String name = request.getParameter("name");
		String branch=request.getParameter("branch");
		String party =request.getParameter("party");
		int vote = 0;
	if(branch.equalsIgnoreCase("6"))
			{
			branch ="it";
			}else if(branch.equalsIgnoreCase("2")) {
				branch ="cs";
			}else if(branch.equalsIgnoreCase("3")) {
				branch ="mech";
			}else if(branch.equalsIgnoreCase("4")) {
				branch ="ele";
			}else {
				branch ="extc";
			}
	
	if(party.equalsIgnoreCase("1"))
	{
	party="Yuva Party";
	}else if(branch.equalsIgnoreCase("2")) {
		party ="student union";
	}else if(branch.equalsIgnoreCase("3")) {
		party ="VP";
	}else  {
		party ="Student party";
	}
		
DbConnect db = new DbConnect();  
PrintWriter writer = response.getWriter();
        Connection con = db.getCon();
        Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate("insert into leaders(name, party_name, department,vote)values('"+name+"','"+party+"','"+branch+"','"+vote+"')");
	
			request.setAttribute("insertedmsg", "Added");
				response.sendRedirect("/project/admin/appoint_leader.jsp");
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
