package serv;

import com.mysql_set;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Updata_User_Servlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        mysql_set mysql_set = new mysql_set();
        String button = req.getParameter("button");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        User user = new User(username, password, email);
        if(button.equals("insert")){
            int i = mysql_set.insertUser(username,password,email);
            if(i>0){
                req.getRequestDispatcher("/html/back_paltform/success.jsp").forward(req,resp);
            }
            else{
                req.getRequestDispatcher("/html/back_paltform/fail.jsp").forward(req,resp);
            }
        }
        if(button.equals("updata")){
            int i = mysql_set.updateUser(user);
            if(i>0){
                req.getRequestDispatcher("/html/back_paltform/success.jsp").forward(req,resp);
            }
            else{
                req.getRequestDispatcher("/html/back_paltform/fail.jsp").forward(req,resp);
            }
        }
        if(button.equals("delete")){
            int i = mysql_set.deleteUser(username);
            if(i>0){
                req.getRequestDispatcher("/html/back_paltform/success.jsp").forward(req,resp);
            }
            else{
                req.getRequestDispatcher("/html/back_paltform/fail.jsp").forward(req,resp);
            }
        }
    }
}
