package com.ssafy.first.javaconfig.controller;

import com.ssafy.first.javaconfig.model.service.BoardService;
import org.springframework.stereotype.Controller;

@Controller
public class BoardController {
    private final BoardService boardService;

    // 생성자가 하나일 경우 자동 주입됨...
    public BoardController(BoardService boardService) {
        System.out.println("BoardController(Service) 생성자 실행");
        this.boardService = boardService;
    }

    @Override
    public String toString() {
        return "BoardController{" + "boardService=" + boardService + '}';
    }
}
