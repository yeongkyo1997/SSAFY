package com.ssafy.mybatis.model.dao;


import com.ssafy.mybatis.model.Member;
import com.ssafy.mybatis.util.MyAppSqlConfig;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;


public class TestDaoImpl1 implements TestDao {
    private static final String NS = "com.ssafy.mybatis.model.dao.TestDao.";
    private SqlSessionFactory sqlSessionFactory;

    public TestDaoImpl1() {
        sqlSessionFactory = MyAppSqlConfig.getSqlSessionFactory();
    }

    @Override
    public List<Member> selectMember() {
        return sqlSessionFactory.openSession().selectList(NS + "selectMember");
    }

    @Override
    public void insertMember(Member member) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert(NS + "insertMember", member);
        sqlSession.commit();
    }

    @Override
    public void updateMember(Member member) {

    }

    @Override
    public void deleteMember(String id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete(NS + "deleteMember", id);
        sqlSession.commit();
    }
}
