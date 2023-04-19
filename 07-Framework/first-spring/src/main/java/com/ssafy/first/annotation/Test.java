package com.ssafy.first.annotation;

import com.ssafy.first.annotation.controller.BoardController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("annotation/first-exam.xml");

        String[] names = container.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }
        BoardController boardController = (BoardController) container.getBean("boardController");
        System.out.println(boardController);
/*
        BoardController controller = (BoardController) container.getBean("boardController");
        System.out.println(controller);
        BoardService boardService = container.getBean("boardService", BoardService.class);
        System.out.println(boardService);
        BoardDao boardDao = container.getBean(BoardDao.class);
 */
    }
}