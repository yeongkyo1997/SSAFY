package com.ssafy.main;

import com.ssafy.model.BoardDto;
import com.ssafy.controller.BoardController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardMain {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // TODO : xml or annotation의 spring 설정을 읽어온다.
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);

        BoardController boardController = container.getBean("boardController", BoardController.class);
        BoardDto boardDto = new BoardDto();
        boardDto.setUserId("ssafy");
        System.out.print("제목 : ");
        boardDto.setSubject(in.readLine());
        System.out.print("내용 : ");
        boardDto.setContent(in.readLine());

        try {
            boardController.writeArticle(boardDto);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("================================== 글목록 ================================== ");
        try {
            Map<String, String> map = new HashMap<>();
            map.put("pgno", "1");
            map.put("key", "");
            map.put("word", "");
            List<BoardDto> list = boardController.listArticle(map);
            for (BoardDto article : list) {
                System.out.println(article);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
