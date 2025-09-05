package sec01.exam01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RedirectServlet doGet 실행");		
		try {
		
		// 요청 할 때 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		// 응답 할 때 한글 깨짐 방지
		response.setContentType("text/html;charset=utf-8");
		
		String text = request.getParameter("text");
		System.out.println("text:" + text);
		
		response.sendRedirect("/proj2_request/another");
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}

//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("RedirectServlet doPost 실행");	
//		
//		String text = request.getParameter("text");
//		System.out.println("text:" + text);
//		
//		response.sendRedirect("/proj2_request/another");
//	
//	}

}
