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
import java.util.List;


public class masterServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        master_set master_set = new master_set();
        List<Master> masterByMaster = master_set.getMasterByMaster(username);
        for (Master master : masterByMaster) {
            if(master.getPassword().equals(password)){
                req.getRequestDispatcher("/html/back_paltform/index.jsp").forward(req,resp);
            }
        }
//        如果没有找到页面，弹出警告，并返回
        req.getRequestDispatcher("/jsp/login.jsp").forward(req,resp);
        master_set.stopSqlsession();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
