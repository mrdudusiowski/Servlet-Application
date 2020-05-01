<%@page import="java.util.List"%>
<%@page import="pl.dudus.model.User"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<jsp:include page="web-components/header_with_menu.jsp"></jsp:include>    


<div class="col-sm-12 col-xs-12 align-middle center" style="background-color: whitesmoke; text-align: center; margin-top: 150px;">
    <div class="chart-container" style="width: 500px; height: 310px; margin: 0 auto; margin-top: 50px;" >
            <canvas id="myChart"></canvas>
    </div>
    
    <script type="text/javascript" src="js/chart.js"></script>    
</div>   
    
<jsp:include page="web-components/footer.jsp"></jsp:include>
