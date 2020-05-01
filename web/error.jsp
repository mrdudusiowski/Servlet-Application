<%@page contentType="text/html" pageEncoding="utf-8"%>
<jsp:include page="web-components/header.jsp"></jsp:include>    
    <% java.util.Date data=new java.util.Date();
       java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-YYYY");
        java.lang.String date = sdf.format(data);%>
<div clas="col-sm-12" style="margin-top: 10px; overflow: hidden; ">      
    <div class="time-box col-sm-2 col-xs-12">
        <p id ="time-1"><span id="clock"></span></p> 
        <p id="time-2"><% out.print(date);%></p>
     </div>
</div>
       

 <div clas="col-sm-12" style="overflow: hidden;">    
    <div class="login-box col-sm-6 col-xs-12">    
        <h1>Błędny login i hasło!</h1>
        <a href="/logout"><h2>Wróć do strony głównej</h2></a>
   </div>
 </div>

<jsp:include page="web-components/footer.jsp"></jsp:include>
