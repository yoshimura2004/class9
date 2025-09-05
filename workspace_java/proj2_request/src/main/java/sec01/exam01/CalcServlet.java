package sec01.exam01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/CalcServlet 실행");
		try {
			String num1 = request.getParameter("num1");
			String num2 = request.getParameter("num2");
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			int sum = n1+n2;
			
			PrintWriter out = response.getWriter();
			out.println("<h1>num1:"+n1+"<h1>");
			out.println("<h1>num2:"+n2+"<h1>");
			out.println("<h1>sum:"+sum+"<h1>");
			

			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}


