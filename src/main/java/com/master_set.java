package com;

import dao.MasterDao;
import dao.MovieDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Master;
import pojo.Movie;
import pojo.User;
import untils.MybatisUtils;

import java.util.List;

public class master_set {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    public List<Master> getMasterByMaster(String username){
        MasterDao mapper = sqlSession.getMapper(MasterDao.class);
        List<Master> root = mapper.getMasterByMaster(username);
        return root;

    }
    public List<Master> getMaster(){
        MasterDao mapper = sqlSession.getMapper(MasterDao.class);
        List<Master> master = mapper.getMaster();
        return master;
    }

    public int DeleteMaster(String username){
        MasterDao mapper = sqlSession.getMapper(MasterDao.class);
        int i = mapper.deleteMaster(username);
        sqlSession.commit();
        return i;
    }

    public int InsertMaster(Master master){
        MasterDao mapper = sqlSession.getMapper(MasterDao.class);
        int i = mapper.insertMaster(master);
        sqlSession.commit();
        System.out.println(i);
        return i;
    }
    public int UpdateMaster(Master master){
        MasterDao mapper = sqlSession.getMapper(MasterDao.class);
        int i = mapper.updateMaster(master);
        sqlSession.commit();
        return i;
    }
    public void stopSqlsession(){
        sqlSession.close();
    }


}
