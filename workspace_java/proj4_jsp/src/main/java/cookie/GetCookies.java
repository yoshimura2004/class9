package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/get")
public class GetCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		boolean isShow = true;
		
		//만약 쿠키가 하나도 없는 경우는 null
		
		Cookie[] cookies = request.getCookies();
		if( cookies != null) {
			for(int i = 0; i<cookies.length; i++) {
				
				Cookie c = cookies[i];
				String name = c.getName();
				String value = c.getValue();
				
				System.out.println("name: "+ name +", value:"+ value);
				
				if("showPopUp".equals(name)
						&& "N".equals(value)) {
					isShow =false;
				}			
			}
		}
			if(isShow) {				
				response.getWriter().println("파법표시");
				}
			}
		}
