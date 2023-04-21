package com.ssafy.sample.model.dao;

import com.ssafy.sample.model.Board;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

public interface BoardDao {
	List<Board> selectBoard() throws SQLException;

	Board selectBoardByPK(int no) throws Exception;

	void deleteBoard(int no) throws SQLException;

	void insertBoard(Board board) throws SQLException;
}
