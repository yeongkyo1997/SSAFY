package com.ssafy.todomvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.ssafy.todomvc.model.Todo;

@Repository
public class TodoDaoImpl implements TodoDao {
    private final DataSource dataSource;

    public TodoDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void deleteAllTodo(String userId) throws SQLException {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement pstmt = connection.prepareStatement("delete from todo where userId = ? ");) {
            pstmt.setString(1, userId);
            pstmt.execute();
        }
    }

    @Override
    public List<Todo> selectTodoByUserId(String userId) throws SQLException {
        List<Todo> list = new ArrayList<>();
        try (Connection con = dataSource.getConnection();
             PreparedStatement pstmt = con.prepareStatement("select no, content from todo where userId = ? order by no");) {
            pstmt.setString(1, userId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Todo todo = new Todo();
                todo.setNo(rs.getInt("no"));
                todo.setContent(rs.getString("content"));
                list.add(todo);
            }
        }
        return list;
    }

    @Override
    public void deleteTodo(int no) throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("delete from todo ");
        sql.append("where no = ?");
        try (Connection connection = dataSource.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql.toString());) {
            pstmt.setInt(1, no);
            pstmt.execute();
        }
    }

    @Override
    public void insertTodo(Todo todo) throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("insert into todo (content, userId) ");
        sql.append("values (?, ?)");
        try (Connection connection = dataSource.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql.toString());) {
            pstmt.setString(1, todo.getContent());
            pstmt.setString(2, todo.getUserId());
            pstmt.execute();
        }
    }
}
