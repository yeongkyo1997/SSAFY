package com.ssafy.todomvc.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.todomvc.model.Todo;
import com.ssafy.todomvc.model.dao.TodoDao;

@Service
public class TodoServiceImpl implements TodoService {
    private final TodoDao todoDao;

    public TodoServiceImpl(TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    @Override
    public void clearTodo(String userId) throws SQLException {
        todoDao.deleteAllTodo(userId);
    }

    @Override
    public void deleteTodo(int no) throws SQLException {
        todoDao.deleteTodo(no);
    }

    @Override
    public void registTodo(Todo todo) throws SQLException {
        todoDao.insertTodo(todo);
    }

    @Override
    public List<Todo> listTodo(String userId) throws SQLException {
        return todoDao.selectTodoByUserId(userId);
    }
}
