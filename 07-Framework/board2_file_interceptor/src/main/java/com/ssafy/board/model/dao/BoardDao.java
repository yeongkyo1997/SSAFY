package com.ssafy.board.model.dao;

import com.ssafy.board.model.BoardDto;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface BoardDao {

	void writeArticle(BoardDto boardDto) throws SQLException;
	List<BoardDto> listArticle(Map<String, String> param) throws SQLException;
	int getTotalArticleCount(Map<String, String> param) throws SQLException;
	BoardDto getArticle(int articleNo) throws SQLException;
	void updateHit(int articleNo) throws SQLException;
	
	void modifyArticle(BoardDto boardDto) throws SQLException;
	void deleteArticle(int articleNo) throws SQLException;
	
}
