<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset=UTF-8">
    <link href="css/style.css" rel="stylesheet"> 
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/all.css">
    
    <script type="text/javascript" src="js/jquery-3.5.0.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script> 
    
    <title>Patryk Duduś TSS</title>
</head>
<body style="background-color: #587ED7;">
    <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #114BCF !important;">
      <a class="navbar-brand" href="#" style="color: white;">
        <img src="${pageContext.request.contextPath}/img/logo.png" width="35" height="35" class="d-inline-block align-top" alt="">
        Projekt TSS
      </a>
   <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Strona główna</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" target="_blank" href="/rest/members">REST</a>
      </li>
    </ul>
  </div>
        
  <form class="form-inline" action="/logout" method="POST">
    <button class="btn btn-warning my-2 my-sm-0" type="submit">Wyloguj</button>
  </form>
</nav>
