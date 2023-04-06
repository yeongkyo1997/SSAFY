package com.ssafy.paging.model.dao;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.ssafy.paging.model.Board;

public interface BoardDao {
	List<Board> selectBoard() throws SQLException, NamingException;

	int selectBoardCount() throws SQLException, NamingException;
}