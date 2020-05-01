function updateModalElem(elem) {

    var updateModal = $("#updateModal");

    var id= $(elem).closest("tr").find("td.id").html();
    var nr= $(elem).closest("tr").find("td.nr").html();
    var tytul= $(elem).closest("tr").find("td.tytul").html();
    var opis= $(elem).closest("tr").find("td.opis").html();

    $('#id', updateModal).val(id);
    $('#nr', updateModal).val(nr);
    $('#tytul', updateModal).val(tytul);
    $('#opis', updateModal).val(opis);

    $("#updateModal").modal('show');
}



