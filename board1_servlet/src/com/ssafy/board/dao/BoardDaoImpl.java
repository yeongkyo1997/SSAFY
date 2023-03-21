package com.ssafy.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.board.model.BoardDto;
import com.ssafy.util.DBUtil;

public class BoardDaoImpl implements BoardDao {

	@Override
	public int writeArticle(BoardDto boardDto) {
//		1. 드라이버 로딩
//		2. 연결객체 얻기
//		3. SQL문 작성
//		4. SQL 실행객체 얻어오기
//		5. SQL 실행하기
//		6. 결과 처리

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("insert into board(						");
			sql.append("           user_id, subject, content	");
			sql.append(") values (								");
			sql.append("  ?, ?, ? 								");
			sql.append(")										");
			pstmt = con.prepareStatement(sql.toString());

			int index = 0;

			pstmt.setString(++index, boardDto.getUserId());
			pstmt.setString(++index, boardDto.getSubject());
			pstmt.setString(++index, boardDto.getContent());

			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			DBUtil.close(con);
		}
	}

	@Override
	public List<BoardDto> listArticle() {
		List<BoardDto> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select * ");
			sql.append(" from board ");
			sql.append(" order by article_no ");
			sql.append(" limit 0, 10");
			pstmt = con.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				BoardDto board = new BoardDto();
				board.setArticleNo(rs.getInt("article_no"));
				board.setSubject(rs.getString("subject"));
				board.setUserId(rs.getString("user_id"));
				board.setHit(rs.getInt("hit"));
				board.setRegisterTime(rs.getString("register_time"));
				list.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con);
		}
		return null;
	}

	@Override
	public BoardDto viewArticle(int articleNo) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select * ");
			sql.append(" from board ");
			sql.append(" where article_no = ? ");
			sql.append(" order by article_no ");
			sql.append(" limit 0, 10");
			pstmt.setInt(1, articleNo);
			pstmt = con.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				BoardDto board = new BoardDto();
				board.setArticleNo(rs.getInt("article_no"));
				board.setSubject(rs.getString("subject"));
				board.setContent(rs.getString("content"));
				board.setUserId(rs.getString("user_id"));
				board.setHit(rs.getInt("hit"));
				board.setRegisterTime(rs.getString("register_time"));
				return board;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con);
		}
		return null;
	}
}
