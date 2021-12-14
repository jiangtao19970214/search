package serv;

import com.movie_set;
import com.mysql_set;
import pojo.Movie;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class findServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        movie_set movie_set = new movie_set();
        String movie = req.getParameter("movie");
        List<Movie> movieByName = movie_set.getMovieByName(movie);
        if(movieByName.size()!=0){
            req.setAttribute("movieName", movieByName.get(0).getMovie_name());
            req.setAttribute("movieAuthor", movieByName.get(0).getMovie_author());
            req.setAttribute("movieLink", movieByName.get(0).getMovie_link());
            req.setAttribute("movieIntroduction", movieByName.get(0).getMovie_introduction());
            req.setAttribute("moviePicture", movieByName.get(0).getMovie_picture());
            req.getRequestDispatcher("/html/find/ssk_result.jsp").forward(req, resp);
        }
        else
        {
            req.setAttribute("movieName", "Sorry, search term does not exist");
            req.setAttribute("movieAuthor", null);
            req.setAttribute("movieLink", null);
            req.setAttribute("movieIntroduction", null);
            req.setAttribute("moviePicture", null);
            req.getRequestDispatcher("/html/find/ssk_result.jsp").forward(req, resp);
        }
    }
}
