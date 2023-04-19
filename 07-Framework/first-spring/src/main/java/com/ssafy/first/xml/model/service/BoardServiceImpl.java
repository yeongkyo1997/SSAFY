package com.ssafy.first.xml.model.service;

import com.ssafy.first.xml.model.dao.BoardDao;

public class BoardServiceImpl implements BoardService {
    private BoardDao boardDao;

    public BoardServiceImpl() {
        System.out.println("BoardServiceImpl() 생성자 실행");
    }

    public BoardServiceImpl(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    public void setBoardDao(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    @Override
    public String toString() {
        return "BoardServiceImpl{" + "boardDao=" + boardDao + '}';
    }
}
