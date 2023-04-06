package com.ssafy.paging.model.service;

import java.util.List;

import com.ssafy.paging.model.Board;
import com.ssafy.paging.model.dao.BoardDao;
import com.ssafy.paging.model.dao.BoardDaoImpl;

public class Board2ServiceImpl implements BoardService {
	private static BoardService boardService = new Board2ServiceImpl();
	private BoardDao dao;
	private Board2ServiceImpl() {
		dao = BoardDaoImpl.getInstance();
	}
	public static BoardService getInstance() {
		return boardService;
	}
	@Override
	public List<Board> listBoard() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
