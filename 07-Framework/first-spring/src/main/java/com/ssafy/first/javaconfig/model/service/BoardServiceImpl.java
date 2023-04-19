package com.ssafy.first.javaconfig.model.service;

import com.ssafy.first.javaconfig.model.dao.BoardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardDao boardDao;

    public BoardServiceImpl() {
        System.out.println("BoardServiceImpl() 객체 생성");
    }

    public BoardServiceImpl(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    public void setBoardDao(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

//    @Override
//    public String toString() {
//        return "BoardServiceImpl{" + "boardDao=" + boardDao + '}';
//    }
}
