<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@page import="pl.dudus.model.Data"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<jsp:include page="web-components/header_with_menu.jsp"></jsp:include>    
<jsp:include page="web-components/modals/addData.jsp"></jsp:include>
<jsp:include page="web-components/modals/updateData.jsp"></jsp:include>

<div class="col-sm-6 col-xs-12 center">
    <button type="button" class="btn btn-light" data-toggle="modal" data-target="#addModal" style="margin: 20px;"><i class="fas fa-plus"></i> Dodaj dane</button>
  <table class="table table-striped table-dark">
      <thead>
         <tr>
            <th scope="col">#</th>
            <th scope="col">Numer</th>
            <th scope="col">Tytuł</th>
            <th scope="col">Opis</th> 
            <th scope="col">Edytuj</th>
            <th scope="col">Usuń</th>  
         </tr>
      </thead>
      <tbody>
            <c:forEach items="${list}" var="data">
                <tr>
                    <td class="id" scope="row"><c:out value="${data.getId()}"/></td>
                    <td class="nr"><c:out value="${data.getNr()}"/></td>
                    <td class="tytul"><c:out value="${data.getTytul()}"/></td>
                    <td class="opis"><c:out value="${data.getOpis()}"/></td>
                    <td><a onclick="updateModalElem(this)" style="color: white;"><i class="fas fa-edit"></i></a></td>
                    <td><a href="DeleteData?id=${data.getId()}" style="color: white;"><i class="fas fa-trash-alt"></i></a></td>
                </tr>
            </c:forEach>
    </tbody>
  </table>  
</div>  
 
<script type="text/javascript" src="js/modal.js"></script> 

<jsp:include page="web-components/footer.jsp"></jsp:include>
