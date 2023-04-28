package com.ssafy.springtest.model.dao;

import com.ssafy.springtest.model.Attendance;
import com.ssafy.springtest.model.User;
import com.ssafy.springtest.util.SqlMapConfig;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class AttendanceDaoImpl implements AttendanceDao {
    private final String NS = "com.ssafy.springtest.model.dao.AttendanceDao.";

    @Override
    public List<Attendance> selectAttendance(User user) throws SQLException {
        try (SqlSession sqlSession = SqlMapConfig.getSqlSession()) {
            return sqlSession.selectList(NS + "selectAttendance", user);
        }
    }

    @Override
    public void deleteAttendance(String ano) throws SQLException {
        try (SqlSession sqlSession = SqlMapConfig.getSqlSession()) {
            sqlSession.delete(NS + "deleteAttendance", ano);
            sqlSession.commit();
        }
    }

    @Override
    public void insertAttendance(Attendance attendance) throws SQLException {
        try (SqlSession sqlSession = SqlMapConfig.getSqlSession()) {
            sqlSession.insert(NS + "insertAttendance", attendance);
            sqlSession.commit();
        }
    }

    @Override
    public Attendance selectAttendanceByPK(String ano) throws SQLException {
        try (SqlSession sqlSession = SqlMapConfig.getSqlSession()) {
        }
        return null;
    }
}
