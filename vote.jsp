
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Online Voting System</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

  <!-- Favicons -->
  <link href="img/favicon.png" rel="icon">
  <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Montserrat:300,400,500,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="lib/lightbox/css/lightbox.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="css/style.css" rel="stylesheet">
</head>

<body onLoad="list_student()">

  <!--==========================
  Header
  ============================-->
  <header id="header" class="sticky-top">
    <div class="container">

      <div class="logo float-left">
        
     <!--  <h1 class="text-light"><a href="#header"><span>Gyan Classes</span></a></h1> -->
        <a href="http://localhost:8000/project/admin/admin_login.jsp" class="scrollto"><img src="img/gyan.jpg" alt="" class="img-fluid logo"></a>
      </div>

      <nav class="main-nav float-right d-none d-lg-block">
        <ul>
          <li class="active"><a href="#intro">Home</a></li>
          
          <li class="drop-down"><a href="">My Account</a>
            <ul>
              <li><a href="#">Profile</a></li>
              <li><a href="#">Contact</a></li>
            </ul>
          </li>
          
          <%
          if(session.getAttribute("username") == null){
        	  %>
        	 <li><a href="http://localhost:8000/project/login.jsp">Login</a></li>
        	  <% 
        	  }else
        	  {
        	  %>
        	 <li> <form action="logout" method="post">
           <input type="submit" class="btn btn-outline-primary " value="logout" />
           </form></li>
          <%
          }
          %>
       
      
        </ul>
      </nav><!-- .main-nav -->
      
    </div>
  </header><!-- #header -->



					
					<div  id="studentlist">
          				</div>


  <!-- JavaScript Libraries -->
  <script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/jquery/jquery-migrate.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="lib/easing/easing.min.js"></script>
  <script src="lib/mobile-nav/mobile-nav.js"></script>
  <script src="lib/wow/wow.min.js"></script>
  <script src="lib/waypoints/waypoints.min.js"></script>
  <script src="lib/counterup/counterup.min.js"></script>
  <script src="lib/owlcarousel/owl.carousel.min.js"></script>
  <script src="lib/isotope/isotope.pkgd.min.js"></script>
  <script src="lib/lightbox/js/lightbox.min.js"></script>
  <!-- Contact Form JavaScript File -->
  <script src="contactform/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="js/main.js"></script>
<script type="text/javascript">
  function list_student()
{
	  var branch = "<%=session.getAttribute("branch")%>";
  var xmlRequest = new XMLHttpRequest();
  if (branch == "") {
        document.getElementById("studentlist").innerHTML = "";
        
        return;
      }
      else
      {
         if (window.XMLHttpRequest) {
            // code for IE7+, Firefox, Chrome, Opera, Safari
            xmlhttp = new XMLHttpRequest();
        } else {
            // code for IE6, IE5
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
  xmlRequest.onreadystatechange = function()
  {
    if(this.readyState == 4 && this.status == 200)
    {
      document.getElementById("studentlist").innerHTML=this.responseText;
      
    }
  };
  xmlRequest.open("GET","ajax1.jsp?q="+branch,true);
  xmlRequest.send();
}
}
</script>
</body>
</html>
