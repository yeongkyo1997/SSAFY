package com.ssafy.sample.controller;

import com.ssafy.sample.model.Board;
import com.ssafy.sample.model.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
	private BoardService boardService;

	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}

	@GetMapping("list")
	public String list(Model model) throws SQLException {
		List<Board> list = boardService.list();
		model.addAttribute("list", list);
		return "list";
	}

	@GetMapping("detail")
	public String detail(int no, Model model) throws Exception {
		Board board = boardService.detail(no);
		model.addAttribute("board", board);
		return "detail";
	}

	@GetMapping("delete")
	public String delete(int no) throws Exception {
		boardService.delete(no);
		return "redirect:list";
	}

	@GetMapping("write")
	public String writeForm() {
		return "write";
	}

	@PostMapping("write")
	public String write(Board board) throws Exception {
		boardService.write(board);
		return "redirect:list";
	}

	@GetMapping("multi-delete")
	public String multiDete(@RequestParam(name = "no") List<Integer> noList) throws Exception {
		if (noList.size() > 0)
			boardService.multiDelete(noList);
		return "redirect:list";
	}
}
