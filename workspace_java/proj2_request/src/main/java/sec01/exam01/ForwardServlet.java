package sec01.exam01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//192.168.0.22

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/forward doGet 실행");
		try {
			
			String text = request.getParameter("text");
			System.out.println("text:" + text);		
			
			response.getWriter().println("forward");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("another");
			dispatcher.forward(request, response);
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/forward doPost 실행");		
		try {
			
		String text = request.getParameter("text");
		System.out.println("text:" + text);		
		
		response.getWriter().println("forward");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("another");
		dispatcher.forward(request, response);		
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
