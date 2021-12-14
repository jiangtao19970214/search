package com;

import dao.MovieDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Movie;
import untils.MybatisUtils;

import java.util.List;
import java.util.Map;

public class movie_set {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    MovieDao mapper = sqlSession.getMapper(MovieDao.class);
    public List<Movie> getMovie(){
        List<Movie> movie = mapper.getMovie();
        return movie;
    }
    public List<Movie> getMovieByName(String name){

        List<Movie> movie = mapper.getMovieByName(name);
        return movie;
    }
    public int insertMovie(Movie movie){
        int i = mapper.insertMovie(movie);
        sqlSession.commit();
        return i;
    }

    public int deleteMovie(String name){
        int i = mapper.deleteMaster(name);
        sqlSession.commit();
        return i;
    }

}
