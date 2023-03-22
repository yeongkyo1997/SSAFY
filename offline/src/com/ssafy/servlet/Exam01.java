/*
 * 서블릿으로 동작되기 위해서는?
 *
 * - Servlet 인터페이스 타입이 되어야 한다.
 *
 * - Servlet
 *
 * - GenericServlet
 *
 * - HttpServlet
 *
 * 위의 3가지 클래스 중에 하나를 상속 받는다.
 *
 * 사용자가 서블릿을 호출하기 위해서 2가지 방법을 제시
 * - web.xml
 * - @WebServlet : /로 시작하는 경로로 작성한다.
 */

package com.ssafy.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet/exam01")
public class Exam01 implements Servlet {

    @Override
    public void destroy() {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void init(ServletConfig config) {
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) {
        System.out.println("service 메서드 호출~~~");
    }

}
