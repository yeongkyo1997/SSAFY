package com.ssafy.sample.model.dao;

import com.ssafy.sample.model.AttendanceDto;
import com.ssafy.sample.model.UserInfoDto;
import com.ssafy.sample.model.service.UserService;
import com.ssafy.sample.model.service.UserServiceImpl;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardDaoImpl implements BoardDao {
    private final DataSource dataSource;

    public BoardDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<AttendanceDto> selectBoard() throws SQLException {
        List<AttendanceDto> list = new ArrayList<>();

        try (Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement("select ano , userid, issue, issuedate from attendance ")) {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                AttendanceDto attendanceDto = new AttendanceDto();
                attendanceDto.setAno(rs.getString("ano"));
                attendanceDto.setIssuedate(rs.getString("issuedate"));
                attendanceDto.setIssue(rs.getString("issue"));
                attendanceDto.setUserid(rs.getString("userid"));
                list.add(attendanceDto);
            }
        }
        return list;
    }

    @Override
    public AttendanceDto selectBoardByPK(String ano) throws Exception {
        try (Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement("select b.ano, b.userid, b.issuedate, b.issue " + "from attendance b " + " where ano = ? ");) {

            pstmt.setString(1, ano);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                AttendanceDto attendanceDto = new AttendanceDto();

                attendanceDto.setAno(rs.getString("ano"));
                attendanceDto.setUserid(rs.getString("userid"));
                attendanceDto.setIssue(rs.getString("issue"));
                attendanceDto.setIssuedate(rs.getString("issuedate"));
                return attendanceDto;
            }
        }
        return null;
    }

    @Override
    public void deleteBoard(String ano) throws SQLException {
        try (Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement("delete from attendance where ano = ?");) {

            pstmt.setString(1, ano);
            pstmt.executeUpdate();
        }
    }

    @Override
    public void insertBoard(AttendanceDto attendanceDto) throws SQLException {
        try (Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement("insert into attendance(ano, userid, issuedate, issue) values(?, ?, ?, ?) ");) {
            int cnt = 1;
            pstmt.setString(cnt++, attendanceDto.getAno());
            pstmt.setString(cnt++, attendanceDto.getUserid());
            pstmt.setString(cnt++, attendanceDto.getIssuedate());
            pstmt.setString(cnt++, attendanceDto.getIssue());
            pstmt.executeUpdate();
        }
    }
}
