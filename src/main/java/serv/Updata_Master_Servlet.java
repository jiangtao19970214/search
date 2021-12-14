package serv;

import com.master_set;
import com.mysql_set;
import pojo.Master;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Updata_Master_Servlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        master_set master_set = new master_set();
        String button = req.getParameter("button");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        Master master = new Master(username, email, password);
        if(button.equals("insert")){
            int i = master_set.InsertMaster(master);
            if(i>0){
                req.getRequestDispatcher("/html/back_paltform/success.jsp").forward(req,resp);
            }
            else{
                req.getRequestDispatcher("/html/back_paltform/fail.jsp").forward(req,resp);
            }
        }
        if(button.equals("updata")){
            int i = master_set.UpdateMaster(master);
            if(i>0){
                req.getRequestDispatcher("/html/back_paltform/success.jsp").forward(req,resp);
            }
            else{
                req.getRequestDispatcher("/html/back_paltform/fail.jsp").forward(req,resp);
            }
        }
        if(button.equals("delete")){
            int i = master_set.DeleteMaster(username);
            if(i>0){
                req.getRequestDispatcher("/html/back_paltform/success.jsp").forward(req,resp);
            }
            else{
                req.getRequestDispatcher("/html/back_paltform/fail.jsp").forward(req,resp);
            }
        }
    }
}
