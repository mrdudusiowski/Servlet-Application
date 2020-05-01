package pl.dudus.servlet.crud;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pl.dudus.service.DataService;


/**
 *
 * @author Patryk Duduś
 */
@WebServlet(name = "DeleteData", urlPatterns = {"/DeleteData"})
public class DeleteData extends HttpServlet {
    private DataService dataService;

    public DeleteData() {
        dataService = new DataService();
    }
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);
        
        String id = request.getParameter("id");
        dataService.deleteDataById(Integer.valueOf(id));
        
        session.setAttribute("list", dataService.getAllData());
        
        response.sendRedirect("index.jsp");
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
}
