package emp.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;

@WebServlet("/list")
public class EmpListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/list doGet 실행");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String sPagePerRows = request.getParameter("size");
		String sPage = request.getParameter("page");
		
		int pagePerRows = 10;
		int page = 1;
		try {
			pagePerRows = Integer.parseInt(sPagePerRows);
		}catch (Exception e) {
//			e.printStackTrace();
		}
		try {
			page = Integer.parseInt(sPage);
		}catch (Exception e) {
//			e.printStackTrace();
		}
		
		EmpDTO dto = new EmpDTO();
		dto.setPagePerRows(pagePerRows);
		dto.setPage(page);
		dto.setKeyword( request.getParameter("keyword") );
		
		// DB 조회
		EmpService empService = new EmpService();
		Map map = empService.getPageEmp(dto);
		
		request.setAttribute("map", map);
		request.setAttribute("empDTO", dto);
		
		request.getRequestDispatcher("list.jsp").forward(request, response);
		
		
	}

}