package serv;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.mysql_set;
import pojo.User;


public class insertServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        mysql_set mysql_set = new mysql_set();
//        List<User> select = mysql_set.select();
//        for (User user : select) {
//            resp.getWriter().write(String.valueOf(user));
//        }
        String email = req.getParameter("email");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(email.equals(null)||password.equals(null)||username.equals(null)||email.length()>15||username.length()>12||password.length()>20){
            req.getRequestDispatcher("/jsp/mkuser_fail.jsp").forward(req,resp);        }
        int i = mysql_set.insertUser(username,password,email);
        if(i>0){
            req.getRequestDispatcher("/jsp/mkuser_success.jsp").forward(req,resp);        }
        mysql_set.stopSqlsession();
    }
}
