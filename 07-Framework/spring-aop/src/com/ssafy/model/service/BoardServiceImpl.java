package com.ssafy.model.service;

import com.ssafy.model.BoardDto;
import com.ssafy.model.dao.BoardDao;
import com.ssafy.util.SizeConstant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardDao boardDao;

    public BoardServiceImpl(BoardDao boardDao) {
        super();
        this.boardDao = boardDao;
    }

    @Override
    public int writeArticle(BoardDto boardDto) throws Exception {
        System.out.println("BoardService writeArticle method call!!!!!");
        return boardDao.writeArticle(boardDto);
    }

    @Override
    public List<BoardDto> listArticle(Map<String, String> map) throws Exception {
        System.out.println("BoardService listArticle method call!!!!!");
        int pgNo = Integer.parseInt(map.get("pgno"));
        int end = pgNo * SizeConstant.LIST_SIZE;
        int start = end - SizeConstant.LIST_SIZE;
        map.put("start", String.valueOf(start));
        map.put("end", String.valueOf(end));
        return boardDao.listArticle(map);
    }

    @Override
    public BoardDto getArticle(int articleNo) throws Exception {
        return boardDao.getArticle(articleNo);
    }

    @Override
    public void updateHit(int articleNo) throws Exception {
        boardDao.updateHit(articleNo);
    }

    @Override
    public void modifyArticle(BoardDto boardDto) throws Exception {
        boardDao.modifyArticle(boardDto);
    }

    @Override
    public void deleteArticle(int articleNo) throws Exception {
        boardDao.deleteArticle(articleNo);
    }

}
