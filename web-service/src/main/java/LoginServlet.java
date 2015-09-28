import com.clientbank.repository.model.Client;
import com.clientbank.repository.persistence.dao.ClientDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by elena on 04.09.15.
 */
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name", "Clientbank");
        req.getRequestDispatcher("WEB-INF/views/auth/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);

        String s1 = req.getParameter("login");
        String s = req.getParameter("pass");


//        if(s1.equals(clientService.findOneByEmail(req.getParameter("login")))) {
//
//            req.getRequestDispatcher("/WEB-INF/views/auth/startpage.jsp").forward(req, resp);
//        }else {
            Client client = new Client();
            client.setEmail(s1);
            client.setPassword(s);
            client.setItn("1234567893");
//            client.setFirstName("1");
//            client.setLastName("1");
//            client.setBirthDate(new DateTime());
//            client.setGender(Gender.FEMALE);
            client.setId(1);
//            client.setPatronymic("1");
//            client.setRegisterDate(new DateTime());
            ApplicationContext applicationContext = new GenericXmlApplicationContext("applicationContext.xml");
            ClientDAO clientDAO = (ClientDAO) applicationContext.getBean("clientDao");
            clientDAO.save(client);
//        }
    }
}
