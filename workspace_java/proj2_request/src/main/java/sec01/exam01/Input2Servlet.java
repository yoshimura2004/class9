package sec01.exam01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input2")
public class Input2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		try {

			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			int n3 = n1+n2;
			System.out.println(n3);
			
			request.setAttribute("number3", n3);

			int n4 = (int)request.getAttribute("number3");
			System.out.println(n4);
			request.getRequestDispatcher("/WEB-INF/view/calc/input.jsp").forward(request, response);

			
		}catch(Exception e) {
			e.printStackTrace();
		}

		
	}

}
