<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="utf-8"%>
  

<div class="modal fade" id="addModal" tabindex="-1" role="dialog" aria-labelledby="addModal" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="addModal">Dodaj dane</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <form id="addForm" method="post" action="/AddData">
          <div class="form-group">
            <label for="id-name" class="col-form-label">Id:</label>
            <input type="text" class="form-control" id="id" name="id">
          </div>
          <div class="form-group">
            <label for="nr" class="col-form-label">Nr:</label>
             <input type="text" class="form-control" id="nr" name="nr">
          </div>
          <div class="form-group">
            <label for="tytul" class="col-form-label">Tytuł:</label>
             <input type="text" class="form-control" id="tytul" name="tytul"> 
          </div>
            <div class="form-group">
            <label for="opis" class="col-form-label">Opis:</label>
             <input type="text" class="form-control" id="opis" name="opis">
          </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" onclick="event.preventDefault();document.getElementById('addForm').submit();">Dodaj</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Zamknij</button>
      </div>
    </div>
  </div>
</div>
