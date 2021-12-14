package dao;

import org.apache.ibatis.annotations.*;
import pojo.Master;
import pojo.Movie;
import pojo.User;

import java.util.List;

public interface MasterDao {
    @Select("select * from master")
    List<Master> getMaster();

    @Select("select * from master where master.username = #{username}")
    List<Master> getMasterByMaster(@Param("username") String username);
    @Insert("insert into master(username,count,password) values (#{username},#{password},#{count})")
    int insertMaster(Master master);
    //    删除用户
    @Delete("delete from master where username=#{username}")
    int deleteMaster(@Param("username") String username);
    //    更改用户
    @Update("update master set password=#{password},count=#{count} where username=#{username}")
    int updateMaster(Master master);
}
