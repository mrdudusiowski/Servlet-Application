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
       <form method="post" action="j_security_check">
           <div class="form-group">
             <label for="exampleInputEmail1">Login</label>
             <input type="text" class="form-control" id="login" name="j_username">
           </div>
           <div class="form-group">
             <label for="exampleInputPassword1">Hasło</label>
             <input type="password" class="form-control" id="password" name="j_password">
           </div>
           <button type="submit" class="btn btn-primary">Zatwierdź</button>
       </form>
   </div>
 </div>

<jsp:include page="web-components/footer.jsp"></jsp:include>
