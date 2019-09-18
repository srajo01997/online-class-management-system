<%@page import="java.sql.*" %>

<%@page import="com.raj.util.DbConnect" %>
<%@page import="java.io.PrintWriter" %>
  <section class="wow fadeIn">
      <div class="container">
        <header class="section-header">
          <h3>Choose whom to vote!</h3>
          <p>You can vote to only one candidate only.....Each vote count</p>
        </header>

        <div class="row row-eq-height justify-content-center">
 
       
 
<%
PrintWriter writer = response.getWriter();
String q = request.getParameter("q");
System.out.println(q);
DbConnect db = new DbConnect();
Connection con = db.getCon();
 Statement stmt = null;
 try{
	 stmt = con.createStatement();
 ResultSet rs = stmt.executeQuery("select id, name, party_name from leaders where department = '"+q+"'");
 while(rs.next()){
	 %>
	<div class="col-lg-4 mb-4">
            <div class="card wow bounceInUp">
              <div class="panel-body text-center">
                <div class="card" >
                <form action="vote" method="post">
  				<img class="card-img-top" src="img/team-1.jpg" alt="Card image cap">
 				 <div class="card-body">
    			<h5 class="card-title"><%=rs.getString("name") %></h5>
    			<p class="card-text"><%=rs.getString("party_name") %></p>
    			<input type="hidden" name="id" value="<%=rs.getInt("id") %>">
    			<input class="btn btn-primary" type="submit" value="vote">
    			</form>
    			
  				</div>
				</div>
		</div>
		</div>
</div>

	<%
 }
 }catch(SQLException e)
 {
	 e.printStackTrace();
 }
 
 con.close();
 %>

 </div>
 </div>
 </section>

 
