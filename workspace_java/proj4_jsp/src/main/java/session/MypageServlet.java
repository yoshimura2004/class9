package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/mypage")
public class MypageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		
		HttpSession session = request.getSession(false);
		if(session == null) {
			// 로그인 안함
			System.out.println("로그인 안함  ");
			System.out.println("첫 방문!  ");
			response.sendRedirect("action_2.jsp");			
		}else{
			System.out.println("로그인 안함 2 ");
			System.out.println("첫 방문은 아님! ");
			// getAttribute: 없으면 무조건 null이다.
			Boolean login = (Boolean)session.getAttribute("login");		
			if(login == null || login != true) {
				// 로그인 안함.
				response.sendRedirect("action_2.jsp");
			} else {
				
				response.getWriter().println("여긴 로그인 해야 올 수 있어요!");
				response.getWriter().println("<br> Id :" + session.getAttribute("userId"));
			}
		}
		
		
	
	}

}
