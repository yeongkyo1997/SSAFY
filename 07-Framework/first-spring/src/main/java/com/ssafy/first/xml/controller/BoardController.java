package com.ssafy.first.xml.controller;

import com.ssafy.first.xml.model.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

public class BoardController {
    private BoardService boardService;

    public BoardController() {
        System.out.println("BoardController() 생성자 호출");
    }

    public BoardController(BoardService boardService) {
        System.out.println("BoardController(Service) 생성자 실행");
    }

    public void setBoardService(BoardService boardService) {
        this.boardService = boardService;
    }

    @Override
    public String toString() {
        return "BoardController{" + "boardService=" + boardService + '}';
    }
}
