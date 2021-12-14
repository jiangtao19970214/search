package dao;

import org.apache.ibatis.annotations.*;
import pojo.Master;
import pojo.Movie;
import pojo.User;

import java.util.List;

public interface MovieDao {
    @Select("select * from movie")
    List<Movie> getMovie();
    @Select("select * from movie where movie_name = #{name}")
    List<Movie> getMovieByName(@Param("name") String name);
    @Insert("insert into movie(movie_name,movie_author,movie_link,movie_introduction,movie_picture) values (#{movie_name},#{movie_author},#{movie_link},#{movie_introduction},#{movie_picture})")
    int insertMovie(Movie movie);
    //    删除用户
    @Delete("delete from movie where movie_name=#{movie_name}")
    int deleteMaster(@Param("movie_name") String movie_name);
//    //    更改用户
//    @Update("update master set password=#{password},count=#{count} where username=#{username}")
//    int updateMaster(Master master);

}
