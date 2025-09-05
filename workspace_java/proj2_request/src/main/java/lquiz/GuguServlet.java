package lquiz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugu")
public class GuguServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        
        try {
            String danStr = request.getParameter("dan");
            
            if (danStr == null || "".equals(danStr)) {
                out.println("<h1>숫자를 입력해주세요.</h1>");
            }
            
            int dan = Integer.parseInt(danStr);
            
            out.println("<h1>" + dan + "단 구구단</h1>");
            out.println("<hr>");
    
            for (int i = 1; i <= 9; i++) {
                int result = dan * i;
                out.println("<h2>" + dan + " x " + i + " = " + result + "</h2>");
            }

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
	


