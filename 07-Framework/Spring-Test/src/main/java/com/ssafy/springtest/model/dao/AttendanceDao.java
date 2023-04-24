package com.ssafy.springtest.model.dao;

import com.ssafy.springtest.model.Attendance;
import com.ssafy.springtest.model.User;

import java.sql.SQLException;
import java.util.List;

public interface AttendanceDao {
    List<Attendance> selectAttendance(User user) throws SQLException;

    void deleteAttendance(String ano) throws SQLException;

    void insertAttendance(Attendance attendance) throws SQLException;

    Attendance selectAttendanceByPK(String ano) throws SQLException;
}
