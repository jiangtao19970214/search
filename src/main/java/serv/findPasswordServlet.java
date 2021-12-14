package serv;

import com.mysql_set;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class findPasswordServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        根据账户名称和邮件寻找密码
        mysql_set mysql_set = new mysql_set();
        String email = req.getParameter("email");
        String username = req.getParameter("username");
        List<User> userByEmail = mysql_set.getUserByEmail(email);
        int flog = 0;
        for (User user : userByEmail) {
            if(user.getUser_name().equals(username)){
                flog = 1;
                req.setAttribute("password",user.getPassword());
                req.getRequestDispatcher("/jsp/findpassword_success.jsp").forward(req,resp);
            }
        }
        req.getRequestDispatcher("/jsp/findpassword_fail.jsp").forward(req,resp);
        mysql_set.stopSqlsession();
    }
}
