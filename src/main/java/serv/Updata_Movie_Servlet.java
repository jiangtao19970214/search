package serv;

import com.movie_set;
import com.mysql_set;
import pojo.Movie;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Updata_Movie_Servlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        movie_set movie_set = new movie_set();
        String a = req.getParameter("1");
        String b = req.getParameter("2");
        String c = req.getParameter("3");
        String d = req.getParameter("4");
        String e = req.getParameter("5");
        Movie movie = new Movie(a, b, c, d, e);
        String button = req.getParameter("button");
        if(button.equals("insert")){
            int i = movie_set.insertMovie(movie);
            if(i>0){
                req.getRequestDispatcher("/html/back_paltform/success.jsp").forward(req,resp);
            }
            else{
                req.getRequestDispatcher("/html/back_paltform/fail.jsp").forward(req,resp);
            }
        }

        if(button.equals("delete")){
            int i = movie_set.deleteMovie(a);
            if(i>0){
                req.getRequestDispatcher("/html/back_paltform/success.jsp").forward(req,resp);
            }
            else{
                req.getRequestDispatcher("/html/back_paltform/fail.jsp").forward(req,resp);
            }
        }
    }
}
