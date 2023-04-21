package com.ssafy.sample.model.service;

import com.ssafy.sample.model.Board;
import com.ssafy.sample.model.dao.BoardDao;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
	private final BoardDao boardDao;

	public BoardServiceImpl(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	@Override
	public List<Board> list() throws SQLException {
		return boardDao.selectBoard();
	}

	@Override
	public Board detail(int no) throws Exception {
		return boardDao.selectBoardByPK(no);
	}

	@Override
	public void delete(int no) throws SQLException {
		boardDao.deleteBoard(no);
	}

	@Override
	public void write(Board board) throws SQLException {
		boardDao.insertBoard(board);
	}

	@Override
	public void multiDelete(List<Integer> noList) throws SQLException {
		for (Integer no : noList) {
			boardDao.deleteBoard(no);
		}
	}
}