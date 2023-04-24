package com.ssafy.sample.model.dao;

import com.ssafy.sample.model.AttendanceDto;

import java.sql.SQLException;
import java.util.List;

public interface BoardDao {
	List<AttendanceDto> selectBoard() throws SQLException;

	AttendanceDto selectBoardByPK(String no) throws Exception;

	void deleteBoard(String no) throws SQLException;

	void insertBoard(AttendanceDto board) throws SQLException;
}
