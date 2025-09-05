package servlet;

import memberdto.MemberDTO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import memberdao.MemberDAO;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ename = request.getParameter("ename");
        int empno;
        try {
            empno = Integer.parseInt(request.getParameter("empno"));
        } catch (NumberFormatException e) {
            response.sendRedirect(request.getContextPath() + "/login.jsp?error=invalid");
            return;
        }

        MemberDAO dao = new MemberDAO();
        MemberDTO member = dao.login(ename, empno);


        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("hideNotice".equals(cookie.getName()) && "true".equals(cookie.getValue())) {
                    Cookie newCookie = new Cookie("hideNotice", "true");
                    newCookie.setMaxAge(60);
                    newCookie.setPath("/");
                    response.addCookie(newCookie);
                    break;
                }
            }
        }

        if (member != null) {
            HttpSession session = request.getSession();
            session.setAttribute("member", member);
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        } else {
            response.sendRedirect(request.getContextPath() + "/login.jsp?error=invalid");
        }
    }
}