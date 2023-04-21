package com.ssafy.sample.model.dao;

import com.ssafy.sample.model.Board;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardDaoImpl implements BoardDao {
	private final DataSource dataSource;

	public BoardDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Board> selectBoard() throws SQLException {
		List<Board> list = new ArrayList<>();

		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(
						"select b.no, b.title, b.writer, u.name from board b join user u on b.writer = u.id order by no desc")) {
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Board board = new Board();
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setName(rs.getString("name"));
				list.add(board);
			}
		}
		return list;
	}

	@Override
	public Board selectBoardByPK(int no) throws Exception {
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection
						.prepareStatement("select b.no, b.title, b.content, b.writer, u.name " + "from board b "
								+ "join user u " + "on b.writer = u.id" + " where no = ? ");) {

			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				Board board = new Board();
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setName(rs.getString("name"));
				return board;
			}
		}
		return null;
	}

	@Override
	public void deleteBoard(int no) throws SQLException {
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement("delete from board where no = ?");) {

			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		}
	}

	@Override
	public void insertBoard(Board board) throws SQLException {
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection
						.prepareStatement("insert into board(title, writer, content) values(?, ?, ?) ");) {
			int cnt = 1;
			pstmt.setString(cnt++, board.getTitle());
			pstmt.setString(cnt++, board.getWriter());
			pstmt.setString(cnt++, board.getContent());
			pstmt.executeUpdate();
		}
	}
}
