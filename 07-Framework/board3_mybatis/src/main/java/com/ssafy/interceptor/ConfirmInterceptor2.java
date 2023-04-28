package com.ssafy.interceptor;

import com.ssafy.member.model.MemberDto;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ConfirmInterceptor2 extends WebContentInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws ServletException {
        boolean result = false;

        HttpSession session = request.getSession();
        MemberDto memberDto = (MemberDto) session.getAttribute("userinfo");
        if (memberDto == null) {
            if (isAjaxRequest(request)) {
                try {
					/*
					 * ajax호출시 설정.
					 * beforeSend : function(xmlHttpRequest) {
					 * 	xmlHttpRequest.setRequestHeader("AJAX", "true");
					 * },
					 * success : function(data) {
					 * 	data 처리
					 * },
					 * error : function(e) {
					 * 	if (e.status == 400) {
					 * 		error처리
					 * 	}
					 * }
					 */
                    response.sendError(400);
                    result = false;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    response.sendRedirect(request.getContextPath() + "/user/login");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else
            result = true;
        return result;
    }

    private boolean isAjaxRequest(HttpServletRequest req) {
        String header = req.getHeader("AJAX");
        return "true".equals(header);
    }

}
