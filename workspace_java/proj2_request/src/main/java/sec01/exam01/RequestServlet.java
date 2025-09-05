package sec01.exam01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "req", urlPatterns = { "/req" })
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doGet 실행");
		
		// 요청 할 때 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
			// 응답 할 때 한글 깨짐 방지
		response.setContentType("text/html;charset=utf-8");
		
		
		//getParameter
		// 전달받은 파라메터의 key를 적어서 해당 값을 얻어오기
		String num1 = request.getParameter("num1");
		System.out.println("num1: "+ num1);
		
		//없으면 null
		String num2 = request.getParameter("num2");
		System.out.println("num2: "+ num2);
		
		//없으면 null
		System.out.println("pw: "+ request.getParameter("pw"));
		System.out.println("chk: "+ request.getParameter("check"));
		// getParameter은 하나만 갖고온다.
		
		String [] checks = request.getParameterValues("check");
		System.out.println("checks :" + checks);
		if (checks !=null) {
			for(String chk : checks) {
				System.out.println(chk);
				
		
			}
		}
		
		System.out.println("hidden1 :" + request.getParameter("hiden1"));
		
		System.out.println("btn1 :" + request.getParameter("btn1"));
		System.out.println("btn2 :" + request.getParameter("btn2"));
		
		System.out.println("radio1:" + request.getParameter("radio1"));
		
		System.out.println("date1:" + request.getParameter("date1"));
		System.out.println("number1:" + request.getParameter("number1"));
		System.out.println("div1 :" + request.getParameter("div"));
		// textarea1 은 엔터가 \n으로 들어온다.
		System.out.println("select1 :" + request.getParameter("select1"));
		System.out.println("textarea1 :" + request.getParameter("textarea1"));
		
		response.getWriter().println("{\"k\":123}");
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doPost 실행");
		
		System.out.println("num2:" +request.getParameter("num2"));
		
		response.getWriter().println("{\"k\":456}");
	}
	
	
	

}
