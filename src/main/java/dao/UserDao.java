package dao;

import org.apache.ibatis.annotations.*;
import pojo.User;

import java.util.List;

public interface UserDao {
//    查询所有用户
    @Select("select * from login")
    List<User> getUserList();
//    插入用户
    int insertUser(User user);
//    删除用户
    @Delete("delete from login where user_name=#{user_name}")
    int deleteUser(@Param("user_name") String user_name);
//    更改用户
    @Update("update login set password=#{password},email=#{email} where user_name=#{user_name}")
    int updateUser(User user);
//    查找用户、密码
    List<User> findUserByEmail(String email);
    List<User> findUserByName(String name);

//
}
