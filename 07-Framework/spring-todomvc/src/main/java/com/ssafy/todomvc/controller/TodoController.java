package com.ssafy.todomvc.controller;

import com.ssafy.todomvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.todomvc.model.Todo;
import com.ssafy.todomvc.model.service.TodoService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/todo")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    //	@RequestMapping("/todo/list") // GET, POST 모두 가능
//	@RequestMapping(value = "/todo/list", method = RequestMethod.GET) // GET 방식만 가능하게
    @GetMapping("list") // GET 방식만 가능하게
    public String listTodo(Model model, String userId) throws Exception {
        model.addAttribute("list", todoService.listTodo(userId));
        return "todo/index";
    }

    @PostMapping("regist")
    public String registTodo(Todo todo) throws Exception {
        todoService.registTodo(todo);
        return "redirect:list";
    }

    @GetMapping("clear")
    public String clearTodo(String userId) throws Exception {
        todoService.clearTodo(userId);
        return "redirect:list";
    }

    @GetMapping("delete")
    public String deleteTodo(int no) throws Exception {
        todoService.deleteTodo(no);
        return "redirect:list";
    }
}