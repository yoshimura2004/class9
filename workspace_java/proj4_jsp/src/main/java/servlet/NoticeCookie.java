package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class NoticeCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie cookie = new Cookie("hideNotice", "true");
        cookie.setMaxAge(60); // 1분
        cookie.setPath("/"); 
        response.addCookie(cookie);
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }
}