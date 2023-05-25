<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
  <!-- Basic -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <!-- Mobile Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <!-- Site Metas -->
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta name="author" content="" />

  <title>My Profile</title>

  <!-- slider stylesheet -->
  <!-- slider stylesheet -->
  <link rel="stylesheet" type="text/css"
    href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" />

  <!-- bootstrap core css -->
  <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

  <!-- fonts style -->
  <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&display=swap" rel="stylesheet" />
  <!-- Custom styles for this template -->
  <link href="css/style.css" rel="stylesheet" />
  <!-- responsive style -->
  <link href="css/responsive.css" rel="stylesheet" />
  <link rel="stylesheet" type="text/css" href="profile.css">
</head>

<body>
  <div class="hero_area">
    <!-- header section strats -->
    <header class="header_section">
      <div class="container-fluid">
        <nav class="navbar navbar-expand-lg custom_nav-container ">
          <a class="navbar-brand" href="home_after_login.jsp">
            <span>
              ProgrammingSquare
            </span>
          </a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <div class="d-flex ml-auto flex-column flex-lg-row align-items-center">
              <ul class="navbar-nav  ">
                <li class="nav-item active">
                  <a class="nav-link" href="home_after_login.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item ">
                  <a class="nav-link" href="about_after_login.jsp"> About </a>
                </li>
                
                <li class="nav-item">
                  <a class="nav-link" href="newpost.jsp"> New post </a>
                </li>
                
                <li class="nav-item">
                  <a class="nav-link" href="profile.jsp"> Profile </a>
                </li>
                
                <li class="nav-item">
                  <a class="nav-link" href="sign_in.jsp"> LogOut</a>
                </li>
                
              </ul>
              
            </div>
          </div>
        </nav>
      </div>
    </header>
    <!-- end header section -->
    <!-- slider section -->
    
    <!-- end slider section -->
  </div>

  <!-- how section -->
  <div class="container">
		
		<form action="Profile_servlet_page">
		<div class="info">
			<div class="label">Name:</div>
			<div class="value"><c:out value="${name}" /></div>
		</div>
		
		<div class="info">
			<div class="label">Email:</div>
			<div class="value"><c:out value="${email}" /></div>
		</div>
		
		<div class="posts">
			<div class="label">Number of posts:</div>
			<div class="value"><c:out value="${numberOfPosts}" /></div>
			<a href="myposts.jsp"><button>View Posts</button></a>
		</div>
		
		<div class="bio">
			<label>Bio:</label>
			<textarea placeholder="Write a short bio about yourself..."></textarea>
		</div>
		</form>
	</div>
	
  
  <!-- end how section -->

  <!-- about section -->

  
  <!-- end about section -->

  <!-- app section -->

  
  <!-- end app section -->


  <!-- auto section -->

  
  <!-- end auto section -->

  <!-- client section -->

  
  <!-- end client section -->

  <!-- info section -->
  
  <!-- end info_section -->

  <!-- footer section -->
  
  <!-- footer section -->

  <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
  <script type="text/javascript" src="js/bootstrap.js"></script>
  <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js">
  </script>
  <!-- owl carousel script 
    -->
  <script type="text/javascript">
    $(".owl-carousel").owlCarousel({
      loop: true,
      margin: 0,
      navText: [],
      center: true,
      autoplay: true,
      autoplayHoverPause: true,
      responsive: {
        0: {
          items: 1
        },
        1000: {
          items: 3
        }
      }
    });
  </script>
  <!-- end owl carousel script -->
</body>

</html>