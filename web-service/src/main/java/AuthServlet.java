import service.ClientService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by elena on 03.09.15.
 */
public class AuthServlet extends HttpServlet {
     @Inject
    ClientService clientService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("name", "Clientbank");
        req.getRequestDispatcher("WEB-INF/layouts/join.jsp").forward(req, resp);
        if(clientService.alreadyExists(req.getParameter("login"))){
            resp.sendError(1,"This nickname was already taken");
            resp.sendRedirect("WEB-INF/layouts/join.jsp");

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
