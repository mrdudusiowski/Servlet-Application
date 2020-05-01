package pl.dudus.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Patryk Duduś
 */
@WebServlet(name = "LogoutServlet", urlPatterns = {"/logout"})
public class LogoutServlet  extends HttpServlet  {
     
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
         HttpSession session = request.getSession(true);
         session.setAttribute("user", null);
         session.invalidate();
         request.logout();
            
         response.sendRedirect("/");
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
         HttpSession session = request.getSession(true);
         session.setAttribute("user", null);
         session.invalidate();
         request.logout();
            
         response.sendRedirect("/");
    }
}
