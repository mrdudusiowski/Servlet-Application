package pl.dudus.servlet.crud;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pl.dudus.model.Data;
import pl.dudus.service.DataService;


/**
 *
 * @author Patryk Duduś
 */
@WebServlet(name = "AddData", urlPatterns = {"/AddData"})
public class AddData extends HttpServlet 
{
    private DataService dataService;

    public AddData() {
        dataService = new DataService();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        
        HttpSession session = request.getSession(true);
            String id = request.getParameter("id");
            String nr = request.getParameter("nr");
            String tytul = request.getParameter("tytul");
            String opis = request.getParameter("opis");
            dataService.add(new Data(id, nr, tytul, opis));
            
            session.setAttribute("list", dataService.getAllData());
            response.sendRedirect("index.jsp");
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
