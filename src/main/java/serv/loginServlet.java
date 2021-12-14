package serv;

import com.mysql_set;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class loginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        mysql_set mysql_set = new mysql_set();
        List<User> userByName = mysql_set.getUserByName(username);
        int flog = 0;
        for (User user : userByName) {
            if(user.getPassword().equals(password)){
                flog = 1;
//                resp.sendRedirect("/html/find/ssk.jsp");
                req.getRequestDispatcher("/html/find/ssk.jsp").forward(req,resp);
            }
        }
//        如果没有找到页面，弹出警告，并返回
        req.getRequestDispatcher("/jsp/login.jsp").forward(req,resp);
        mysql_set.stopSqlsession();
    }
}
