package com.ssafy.sample.model.service;

import com.ssafy.sample.model.AttendanceDto;

import java.sql.SQLException;
import java.util.List;

public interface BoardService {
	List<AttendanceDto> list() throws SQLException;

	AttendanceDto detail(String no) throws Exception;

	void delete(String no) throws SQLException;

	void write(AttendanceDto board) throws SQLException;

	void multiDelete(List<String> noList) throws SQLException;
}
