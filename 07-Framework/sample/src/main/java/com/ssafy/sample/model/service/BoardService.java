package com.ssafy.sample.model.service;

import com.ssafy.sample.model.Board;

import java.sql.SQLException;
import java.util.List;

public interface BoardService {
	List<Board> list() throws SQLException;

	Board detail(int no) throws Exception;

	void delete(int no) throws SQLException;

	void write(Board board) throws SQLException;

	void multiDelete(List<Integer> noList) throws SQLException;
}
