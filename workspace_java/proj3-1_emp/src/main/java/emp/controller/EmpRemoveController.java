package emp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;


@WebServlet("/remove")
public class EmpRemoveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/remove dopost 실행");		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 1. 삭제 버튼 만들기
		// 1-1. empno 값 가져오기
		// 1-2. dto에 값을 담아주기
		// 1-3. db에 다녀오기
		// 전체목록 페이지 표시
		// 2. pk 주요키를 기준으로 empno을 기준으로 하여 삭제하기.
		// 3. 삭제 완료 시 알림.	
		// 4. 삭제 실패 시  alert으로 알림. 다시 detail 페이지로 돌아가기.
		// 5. 삭제 완료 후 detail 페이지 or 메인페이지로 넘어가기.
		int empno = 0;
		try {
			String sEmpno = request.getParameter("empno");
			if(sEmpno != null) {
				empno = Integer.parseInt(sEmpno);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		// 1-2. dto에 값을 담아주기
		EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpno(empno);
		// 1-3. db에 다녀오기
		EmpService empService = new EmpService();
		int result = empService.removeEmp(empDTO);
		System.out.println(result + "만큼 삭제되었습니다.");
		// 전체목록 페이지 표시
		response.sendRedirect("list");
		
	}

}
