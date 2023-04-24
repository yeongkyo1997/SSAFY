package com.ssafy.sample.model.service;

import com.ssafy.sample.model.AttendanceDto;
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
	public List<AttendanceDto> list() throws SQLException {
		return boardDao.selectBoard();
	}

	@Override
	public AttendanceDto detail(String no) throws Exception {
		return boardDao.selectBoardByPK(no);
	}

	@Override
	public void delete(String no) throws SQLException {
		boardDao.deleteBoard(no);
	}

	@Override
	public void write(AttendanceDto board) throws SQLException {
		boardDao.insertBoard(board);
	}

	@Override
	public void multiDelete(List<String> noList) throws SQLException {
		for (String ano : noList) {
			boardDao.deleteBoard(ano);
		}
	}
}