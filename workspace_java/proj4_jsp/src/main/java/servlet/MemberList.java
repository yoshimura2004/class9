
package servlet;

import memberdto.MemberDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import memberdao.MemberDAO;

import java.io.IOException;
import java.util.List;

@WebServlet("/memberList")
public class MemberList extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        MemberDTO member = (MemberDTO) session.getAttribute("member");

        if (member == null || !"ADMIN".equals(member.getRole())) {
            response.sendRedirect(request.getContextPath() + "/login.jsp?error=accessDenied");
            return;
        }

        MemberDAO dao = new MemberDAO();
        List<MemberDTO> memberList = dao.getMemberList();
        request.setAttribute("memberList", memberList);
        request.getRequestDispatcher("member_list.jsp").forward(request, response);
    }
}
