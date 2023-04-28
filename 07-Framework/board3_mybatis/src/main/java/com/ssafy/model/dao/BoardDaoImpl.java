package com.ssafy.model.dao;

import com.ssafy.model.FileInfoDto;
import com.ssafy.model.BoardDto;
import com.ssafy.util.SqlMapConfig;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BoardDaoImpl implements BoardDao {

    private final String NAMESPACE = "com.ssafy.board.model.dao.BoardDao.";

    @Override
    public void writeArticle(BoardDto boardDto) {
        try (SqlSession sqlSession = SqlMapConfig.getSqlSession()) {
            sqlSession.insert(NAMESPACE + "writeArticle", boardDto);
            List<FileInfoDto> fileInfos = boardDto.getFileInfos();
            if (fileInfos != null && !fileInfos.isEmpty()) {
                sqlSession.insert(NAMESPACE + "registerFile", boardDto);
            }
            sqlSession.commit();
        }
    }

    @Override
    public List<BoardDto> listArticle(Map<String, Object> map) {
        try (SqlSession sqlSession = SqlMapConfig.getSqlSession()) {
            return sqlSession.selectList(NAMESPACE + "listArticle", map);
        }
    }

    @Override
    public int getTotalArticleCount(Map<String, String> map) {
        try (SqlSession sqlSession = SqlMapConfig.getSqlSession()) {
            return sqlSession.selectOne(NAMESPACE + "getTotalArticleCount", map);
        }
    }

    @Override
    public BoardDto getArticle(int articleNo) {
        try (SqlSession sqlSession = SqlMapConfig.getSqlSession()) {
            return sqlSession.selectOne(NAMESPACE + "getArticle", articleNo);
        }
    }

    @Override
    public void updateHit(int articleNo) {
        try (SqlSession sqlSession = SqlMapConfig.getSqlSession()) {
            sqlSession.update(NAMESPACE + "updateHit", articleNo);
            sqlSession.commit();
        }
    }

    @Override
    public void modifyArticle(BoardDto boardDto) {
        try (SqlSession sqlSession = SqlMapConfig.getSqlSession()) {
            sqlSession.update(NAMESPACE + "modifyArticle", boardDto);
            sqlSession.commit();
        }
    }

    @Override
    public void deleteArticle(int articleNo) {
        try (SqlSession sqlSession = SqlMapConfig.getSqlSession()) {
            sqlSession.delete(NAMESPACE + "deleteFile", articleNo);
            sqlSession.delete(NAMESPACE + "deleteArticle", articleNo);
            sqlSession.commit();
        }
    }

}
