package com.ssafy.controller;

import com.ssafy.model.BoardDto;
import com.ssafy.model.service.BoardService;
import com.ssafy.util.SizeConstant;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

@Controller
public class BoardController {

    private BoardService boardService;

    public BoardController(BoardService boardService) {
        super();
        this.boardService = boardService;
    }

    public int writeArticle(BoardDto boardDto) throws Exception {
        System.out.println("BoardController writeArticle method call!!!!!");
        return boardService.writeArticle(boardDto);
    }

    public List<BoardDto> listArticle(Map<String, String> map) throws Exception {
        System.out.println("BoardController listArticle method call!!!!!");
        int pgNo = Integer.parseInt(map.get("pgno"));
        int end = pgNo * SizeConstant.LIST_SIZE;
        int start = end - SizeConstant.LIST_SIZE;
        map.put("start", String.valueOf(start));
        map.put("end", String.valueOf(end));
        return boardService.listArticle(map);
    }

    public BoardDto getArticle(int articleNo) throws Exception {
        return boardService.getArticle(articleNo);
    }

    public void updateHit(int articleNo) throws Exception {
        boardService.updateHit(articleNo);
    }

    public void modifyArticle(BoardDto boardDto) throws Exception {
        boardService.modifyArticle(boardDto);
    }

    public void deleteArticle(int articleNo) throws Exception {
        boardService.deleteArticle(articleNo);
    }

}
