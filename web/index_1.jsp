<%@page import="java.util.List"%>
<%@page import="pl.dudus.model.User"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<jsp:include page="web-components/header_with_menu.jsp"></jsp:include>    

<% List dataList = (List)session.getAttribute("dataList");%>

  <table>
         <tr>
            <th>Id</th>
            <th>Numer</th>
            <th>Tytuł</th>
            <th>Opis</th>
            <th>Kwota</th>                                                              
         </tr>
    <c:forEach items="${dataList}" var="tDane">
        <tr>
            <td><c:out value="${tDane.getId()}"/></td>
            <td><c:out value="${tDane.getNr()}"/></td>
            <td><c:out value="${tDane.getTytul()}"/></td>
            <td><c:out value="${tDane.getOpis()}"/></td>
            <td><c:out value="${tDane.getKwota()}"/></td>
        </tr>
    </c:forEach>
</table>    
    
<jsp:include page="web-components/footer.jsp"></jsp:include>
