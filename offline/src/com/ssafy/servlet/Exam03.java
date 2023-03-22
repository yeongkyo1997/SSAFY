package com.ssafy.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/exam03")
public class Exam03 extends HttpServlet {
    /*
     * init HttpServlet: service(SR, SR) -> service(HSR, HSR) -> doGet(HSR, HSR)
     */

    /*
     * public void service(ServletRequest request, ServletResponse response) throws
     * IOException, ServletException { System.out.
     * println("service(ServletRequest request, ServletResponse response)"); }
     */

    /*
     * public void service(HttpServletRequest request, HttpServletResponse response)
     * throws IOException, ServletException { System.out.
     * println("service(HttpServletRequest request, HttpServletResponse response)");
     * }
     */

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("doGet(HttpServletRequest request, HttpServletResponse response)");
    }
}
