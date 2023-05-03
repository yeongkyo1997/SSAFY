package com.ssafy.board.model.service;

import com.ssafy.board.model.BoardDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(properties = {"articleno=1", "subject=spring test", "content=스프링 테스트중", "userid=ssafy"})
class BoardServiceImplTest {

    private Logger logger = LoggerFactory.getLogger(BoardServiceImplTest.class);

    @Value("${articleno}")
    private int articleNo;
    @Value("${subject}")
    private String subject;
    @Value("${content}")
    private String content;
    @Value("${userid}")
    private String userId;

    @Autowired
    private BoardService boardService;

    @Test
    @DisplayName("게시글 등록 테스트")
    @Transactional
    void writeArticle () {
        BoardDto boardDto = new BoardDto();
        boardDto.setSubject(subject);
        boardDto.setContent(content);
        boardDto.setUserId(userId);
        try {
            boardService.writeArticle(boardDto);
        } catch (Exception e) {
            fail("게시글 등록 실패");
        }
    }

    @Test
    void listArticle () {

    }

    @Test
    void modifyArticle () {
    }
}