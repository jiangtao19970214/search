package serv;

import com.master_set;
import com.movie_set;
import com.mysql_set;
import pojo.Master;
import pojo.Movie;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class findUserMessageServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        根据账户名称和邮件寻找密码
        mysql_set mysql_set = new mysql_set();
        List<User> select = mysql_set.select();
        req.setAttribute("user_message",select);
        req.getRequestDispatcher("/html/back_paltform/index_findUserData.jsp").forward(req,resp);
        mysql_set.stopSqlsession();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        mysql_set mysql_set = new mysql_set();
        movie_set movie_set = new movie_set();
        master_set master_set = new master_set();
        String button = req.getParameter("button");
        if (button.equals("user")){
            List<User> select = mysql_set.select();
            req.setAttribute("user_message",select);
            req.getRequestDispatcher("/html/back_paltform/index_findUserData.jsp").forward(req,resp);
            mysql_set.stopSqlsession();
        }
        if(button.equals("master")){
            List<Master> master = master_set.getMaster();
            req.setAttribute("master_message",master);
            req.getRequestDispatcher("/html/back_paltform/index_findMasterData.jsp").forward(req,resp);
            mysql_set.stopSqlsession();
        }
        if (button.equals("movie")){
            List<Movie> movie = movie_set.getMovie();
            req.setAttribute("movie_message",movie);
            req.getRequestDispatcher("/html/back_paltform/index_findMovieData.jsp").forward(req,resp);
            mysql_set.stopSqlsession();
        }
    }
}
