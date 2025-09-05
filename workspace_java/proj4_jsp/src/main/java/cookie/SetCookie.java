package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/set")
public class SetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//만료일이 있는 쿠키
		Cookie c1 = new Cookie("addr", "천안시");
//		c1.setMaxAge(3600);  //초단위 60*60*24
		c1.setMaxAge(3600);  //초단위
		response.addCookie(c1);
		
		//만료일이 없는 쿠키
		// 세션 쿠키
		// setMaxAge 를 설정하지 않거나
		// setMaxAge (-1) 음수로 설정한다.
		// 브라우저 메모리에만 저장된다.
		// 즉 모든 탭을 끄면 사라진다.
		Cookie c2 = new Cookie ("dinner", "회");
		c2.setMaxAge(-1);
		response.addCookie(c2);
		
		Cookie c3 = new Cookie ("showPopUp", "N");
		c3.setMaxAge(3);
		response.addCookie(c3);
		
		
	}

}
