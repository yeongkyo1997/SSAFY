package com.ssafy.first.xml;

import com.ssafy.first.xml.controller.BoardController;
import com.ssafy.first.xml.model.dao.BoardDao;
import com.ssafy.first.xml.model.service.BoardService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext(
//                "xml/first-exam.xml"
//                "xml/first-exam2.xml"
        );

        String[] names = container.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }

        BoardController controller = (BoardController) container.getBean("boardController");
        System.out.println(controller);
        BoardService boardService = container.getBean("boardService", BoardService.class);
        System.out.println(boardService);
        BoardDao boardDao = container.getBean(BoardDao.class);
    }
}