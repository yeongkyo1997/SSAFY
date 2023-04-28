package com.ssafy.model.service;

import com.ssafy.model.BoardDto;
import com.ssafy.model.dao.BoardDao;
import com.ssafy.util.PageNavigation;
import com.ssafy.util.SizeConstant;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
    public void writeArticle(BoardDto boardDto) throws Exception {
        boardDao.writeArticle(boardDto);
    }

    @Override
    public List<BoardDto> listArticle(Map<String, String> map) throws Exception {
        Map<String, Object> param = new HashMap<>();
        String key = map.get("key");
        if ("userid".equals(key))
            key = "b.user_id";
        param.put("key", key == null ? "" : key);
        param.put("word", map.get("word") == null ? "" : map.get("word"));
        int pgNo = Integer.parseInt(map.get("pgno") == null ? "1" : map.get("pgno"));
        int start = pgNo * SizeConstant.LIST_SIZE - SizeConstant.LIST_SIZE;
        param.put("start", start);
        param.put("listsize", SizeConstant.LIST_SIZE);

        return boardDao.listArticle(param);
    }

    @Override
    public PageNavigation makePageNavigation(Map<String, String> map) throws Exception {
        PageNavigation pageNavigation = new PageNavigation();

        int naviSize = SizeConstant.NAVIGATION_SIZE;
        int sizePerPage = SizeConstant.LIST_SIZE;
        int currentPage = Integer.parseInt(map.get("pgno"));

        pageNavigation.setCurrentPage(currentPage);
        pageNavigation.setNaviSize(naviSize);
        int totalCount = boardDao.getTotalArticleCount(map);
        pageNavigation.setTotalCount(totalCount);
        int totalPageCount = (totalCount - 1) / sizePerPage + 1;
        pageNavigation.setTotalPageCount(totalPageCount);
        boolean startRange = currentPage <= naviSize;
        pageNavigation.setStartRange(startRange);
        boolean endRange = (totalPageCount - 1) / naviSize * naviSize < currentPage;
        pageNavigation.setEndRange(endRange);
        pageNavigation.makeNavigator();

        return pageNavigation;
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
        // TODO : BoardDaoImpl의 modifyArticle 호출
        boardDao.modifyArticle(boardDto);
    }

    @Override
    public void deleteArticle(int articleNo) throws Exception {
        // TODO : BoardDaoImpl의 deleteArticle 호출
        boardDao.deleteArticle(articleNo);
    }

}
