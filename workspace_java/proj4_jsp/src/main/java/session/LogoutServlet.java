package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		// 세션을 만료하라!
		// 지금 당장 세션이 지워지는 건 아니다!
		// -응답 도중에 세션이 지워진다!
		session.invalidate();
		
		// 이 위치에서 getAttribute가 가능하다.
		
	}




}
