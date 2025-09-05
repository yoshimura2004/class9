package lquiz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sign")
public class SignupServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        
        PrintWriter o = response.getWriter();
        
        try {
        	
            String id = request.getParameter("id");
            String pw = request.getParameter("pw");
            String pw2 = request.getParameter("pw2");

            if ( "".equals(id) || "".equals(pw) || "".equals(pw2) || id == null ||  pw == null || pw2 == null ) {
                o.println("<h1>필수 입력 항목 확인 바랍니다.</h1>");
                return; 
            }

            if (!pw.equals(pw2)) {
                o.println("<h1>비밀번호가 일치하지 않습니다.</h1>");
                return;
            }
            
            System.out.println("아이디: " + id);
            System.out.println("비밀번호: " + pw);
            o.println("<h1>회원가입이 완료되었습니다!</h1>");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
