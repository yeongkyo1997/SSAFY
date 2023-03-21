/*
 * ProjectRoot
 * 		WEB-INF : 브라우저에서 직접 접근이 안됨
 * 			- JSP
 * 			- lib
 * 			- classes
 * 			- web.xml
 */
package temp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Hello extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("call");
	}
}