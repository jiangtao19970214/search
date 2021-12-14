package com;

import dao.UserDao;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import untils.MybatisUtils;

import java.util.List;
public class mysql_set {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    public List<User> select(){
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        return  mapper.getUserList();
    }
    public int insertUser(@Param("name") String name,@Param("pwd") String pwd,@Param("email") String email){
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User(name,pwd,email);
        int i = mapper.insertUser(user);
        sqlSession.commit();
        return i;
    }
    public List<User>  getUserByName(@Param("name") String name){
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> user = mapper.findUserByName(name);
        return user;
    }
    public List<User>  getUserByEmail(@Param("email") String email){
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> user = mapper.findUserByName(email);
        return user;
    }

    public int deleteUser(String username){
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int i = mapper.deleteUser(username);
        sqlSession.commit();
        return i;
    }
    public int updateUser(User user){
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int i = mapper.updateUser(user);
        sqlSession.commit();
        return i;
    }
    public void stopSqlsession(){
        sqlSession.close();
    }
}
