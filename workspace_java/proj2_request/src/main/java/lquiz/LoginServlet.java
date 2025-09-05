package lquiz;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/log")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		try {
			
			String id = request.getParameter("id");
            String pw = request.getParameter("pw");

            System.out.println("아이디: " + id);
            System.out.println("비밀번호: " + pw);
		
            if (id == null ||  pw == null) {
                System.out.println("아이디 또는 비밀번호를 확인하세요");
            } 
            if("".equals(id) || "".equals(pw)) {
            	System.out.println("아이디 또는 비밀번호를 확인하세요");
            }
            else if ("admin".equals(id) && "1234".equals(pw)) {
                System.out.println("관리자 화면");
            } 
            
					
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	
	

}
