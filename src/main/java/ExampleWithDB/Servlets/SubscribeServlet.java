package ExampleWithDB.Servlets;

import ExampleWithDB.Service.SubscribeService;
import ExampleWithDB.Service.impl.SubscribeServiceImpl;
import ExampleWithDB.shop.Magazine;
import ExampleWithDB.shop.Subscribe;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

@WebServlet("/subscribe")
public class SubscribeServlet extends HttpServlet {

    private final SubscribeService subscribeService = SubscribeServiceImpl.getSubscribeServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mID = req.getParameter("idMagazine");



        HttpSession session = req.getSession();
        Integer userId = (Integer)session.getAttribute("idUser");

        System.out.println(userId);

        Subscribe subscribe = new Subscribe(userId, Integer.parseInt(mID), true);
        try {
            subscribeService.create(subscribe);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write("Success");

    }

}
