

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("/hello.html")
// 싱그루톤이다.
@WebServlet("/hello.human")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
      System.out.println("Hello Servlet 생성");
    }

    @Override
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("<h1>Served</h1> at: ").append(request.getContextPath());
    
    	response.setContentType("text/html; charset = utf-8");
    	
    	PrintWriter out = response.getWriter();
    	out.println("<h1>");
    	out.print("Hello Servlet 한글");
    	out.println("</h1>");
    	
    	for (int i = 0; i<10; i++) {
    		if(Math.random() < 0.5) {
    			out.println(i);
        		out.println("<br>");
    		}
    	}
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
