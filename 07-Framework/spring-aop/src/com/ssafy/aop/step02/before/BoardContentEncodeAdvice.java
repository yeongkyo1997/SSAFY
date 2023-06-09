package com.ssafy.aop.step02.before;

import com.ssafy.model.BoardDto;
import org.aspectj.lang.JoinPoint;

public class BoardContentEncodeAdvice {

    public void encode(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().toShortString();
        System.out.println("BoardCheckAdvice : " + name);

        Object[] args = joinPoint.getArgs();
        for (Object obj : args) {
            if (obj instanceof BoardDto) {
                System.out.println("내용을 암호화하자!!!!");
                BoardDto boardDto = (BoardDto) obj;
                String content = boardDto.getContent();
                boardDto.setContent("암호화한 내용 ::: " + content);
            }
        }
    }
}
