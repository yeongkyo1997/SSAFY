package com.ssafy.sample.controller;

import com.ssafy.sample.model.AttendanceDto;
import com.ssafy.sample.model.service.BoardService;
import com.ssafy.sample.model.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    private final UserService userService;
    private BoardService boardService;

    public BoardController(BoardService boardService, UserService userService) {
        this.boardService = boardService;
        this.userService = userService;
    }

    @GetMapping("list")
    public String list(Model model, HttpSession httpSession) throws SQLException {
        if (httpSession.getAttribute("userInfo") == null) return "redirect:/";
        List<AttendanceDto> list = boardService.list();
        model.addAttribute("list", list);
        return "list";
    }

    @GetMapping("detail")
    public String detail(String ano, Model model) throws Exception {
        AttendanceDto board = boardService.detail(ano);
        board.setUserInfo(userService.selectUser(board.getUserid()));
        model.addAttribute("board", board);
        return "detail";
    }

    @GetMapping("delete")
    public String delete(String ano) throws Exception {
        boardService.delete(ano);
        return "redirect:list";
    }

    @GetMapping("write")
    public String writeForm(HttpSession httpSession) {
        if (httpSession.getAttribute("userInfo") == null) return "redirect:/";
        return "regist";
    }

    @PostMapping("write")
    public String write(AttendanceDto attendanceDto, RedirectAttributes redirectAttributes) {
        try {
            boardService.write(attendanceDto);
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "등록 중 에러가 발생했습니다.");
            return "redirect:write";
        }
        redirectAttributes.addFlashAttribute("msg", "등록되었습니다.");
        return "redirect:write";
    }

    @GetMapping("multi-delete")
    public String multiDelete(@RequestParam(name = "ano") List<String> noList) throws Exception {
        if (noList.size() > 0) boardService.multiDelete(noList);
        return "redirect:list";
    }
}
