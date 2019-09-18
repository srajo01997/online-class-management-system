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

<body>

  <!--==========================
  Header
  ============================-->
  <header id="header" class="fixed-top">
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
        	  <form action="logout" method="post">
           <input type="submit" class="btn btn-outline-primary " value="logout" />
           </form>
          <%
          }
          %>
        
      
      
        </ul>
      </nav><!-- .main-nav -->
      
    </div>
  </header><!-- #header -->

    <section id="leader" class="wow fadeIn">
      <div class="container">
        <header class="section-header">
          <h3>Know about your leaders</h3>
          <p>Candidate voted.</p>
        </header>

        <div class="row row-eq-height justify-content-center">

          <div class="col-lg-4 mb-4">
            <div class="card wow bounceInUp">
                <img src="img/team-1.jpg" class="img-fluid" alt="">
              <div class="card-body">
                <h5 class="card-title">abc efg</h5>
                <p class="card-text">having 2 yrs of experience as a student leader.. excellent at academics. know to take right decision during harsh times and good at tackling difficulties.</p>
                <a href="#" class="readmore">Read more </a>
              </div>
            </div>
          </div>

          <div class="col-lg-4 mb-4">
            <div class="card wow bounceInUp">
                <img src="img/team-2.jpg" class="img-fluid" alt="">
              <div class="card-body">
                <h5 class="card-title">vwx yz</h5>
                <p class="card-text">having 2 yrs of experience as a student leader.. excellent at academics. know to take right decision during harsh times and good at tackling difficulties.</p></p>
                <a href="#" class="readmore">Read more </a>
              </div>
            </div>
          </div>

          <div class="col-lg-4 mb-4">
            <div class="card wow bounceInUp">
                <img src="img/team-3.jpg" class="img-fluid" alt="">
              <div class="card-body">
                <h5 class="card-title">opr tryy</h5>
                <p class="card-text">having 2 yrs of experience as a student leader.. excellent at academics. know to take right decision during harsh times and good at tackling difficulties.</p> </p>
                <a href="#" class="readmore">Read more </a>
              </div>
            </div>
          </div>

        </div>

        <div class="row counters">

          <div class="col-lg-3 col-6 text-center">
            <span data-toggle="counter-up">274</span>
            <p>Candidates</p>
          </div>

          <div class="col-lg-3 col-6 text-center">
            <span data-toggle="counter-up">1,364</span>
            <p>voters</p>
          </div>

          <div class="col-lg-3 col-6 text-center">
            <span data-toggle="counter-up">18</span>
            <p>Hard Workers</p>
          </div>
  
        </div>

      </div>
    </section>

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

</body>
</html>
