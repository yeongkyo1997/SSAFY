package com.ssafy.member.model.dao;

import com.ssafy.member.model.MemberDto;
import com.ssafy.util.SqlMapConfig;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class MemberDaoImpl implements MemberDao {

    private final String NAMESPACE = "com.ssafy.member.model.dao.MemberDao.";

    @Override
    public int idCheck(String userId) {
        try (SqlSession sqlSession = SqlMapConfig.getSqlSession()) {
            return sqlSession.selectOne(NAMESPACE + "idCheck", userId);
        }
    }

    @Override
    public void joinMember(MemberDto memberDto) {
        try (SqlSession sqlSession = SqlMapConfig.getSqlSession()) {
            sqlSession.insert(NAMESPACE + "joinMember", memberDto);
            sqlSession.commit();
        }
    }

    @Override
    public MemberDto loginMember(Map<String, String> map) {
        try (SqlSession sqlSession = SqlMapConfig.getSqlSession()) {
            return sqlSession.selectOne(NAMESPACE + "loginMember", map);
        }
    }

}
