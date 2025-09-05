package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;

@WebServlet("/EmpEditController")
public class EmpEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 파라메터 empno를 int로 형변환
		int empno = 0;
		try {
			String sEmpno = request.getParameter("empno");
			if(sEmpno != null) {
				empno = Integer.parseInt(sEmpno);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpno(empno);
		
		// DB 다녀와서 출력하기
		try {
			
			EmpService empService = new EmpService();
			EmpDTO empDTO2 = empService.getOneEmp(empDTO);
			
			PrintWriter out = response.getWriter();
			out.println("<form method = 'post' action = 'edit'>");
			out.println("<table border=1>");
			out.println("	<tr><td>empno</td><td><input type ='text' name = 'empno' value = '"+ empDTO2.getEmpno() +"'></td><tr>");
			out.println("	<tr><td>ename</td><td><input type ='text' name = 'ename' value = '"+ empDTO2.getEname() +"'></td><tr>");
			out.println("	<tr><td>job</td><td><input type ='text' name = 'job' value = '"+ empDTO2.getJob() +"'></td><tr>");
			out.println("	<tr><td>mgr</td><td><input type ='text' name = 'mgr' value = '"+ empDTO2.getMgr() +"'></td><tr>");
			out.println("	<tr><td>hiredate</td><td><input type ='date' name = 'hiredate' value = '"+ empDTO2.getHiredate() +"'></td><tr>");
			out.println("	<tr><td>sal</td><td><input type ='text' name = 'sal' value = '"+ empDTO2.getSal() +"'></td><tr>");
			out.println("	<tr><td>comm</td><td><input type ='text' name = 'comm' value = '"+ empDTO2.getComm() +"'></td><tr>");
			out.println("	<tr><td>deptno</td><td><input type ='text' name = 'deptno' value = '"+ empDTO2.getDeptno() +"'></td><tr>");
			out.println("</table>");
			out.println("<form method = 'post' action = 'remove'>");
			out.println("<input type='hidden' name = 'empno' value = '"+empDTO2.getEmpno()+"' >");
			out.println("<input type='submit' value = '삭제' >");
			out.println("</form>");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EmpDTO dto = new EmpDTO();

		try {

			String sEmpno = request.getParameter("empno");
			int empno = Integer.parseInt(sEmpno);
			dto.setEmpno(empno);

			String ename = request.getParameter("ename");
			dto.setEname(ename);

			String job = request.getParameter("job");
			dto.setJob(job);

			String sMgr = request.getParameter("mgr");
			int mgr = Integer.parseInt(sMgr);
			dto.setMgr(mgr);

			String sHiredate = request.getParameter("hiredate");
			Date hiredate = Date.valueOf(sHiredate);
			dto.setHiredate(hiredate);

			String sSal = request.getParameter("sal");
			int sal = Integer.parseInt(sSal);
			dto.setSal(sal);

			String sComm = request.getParameter("comm");
			int comm = Integer.parseInt(sComm);
			dto.setComm(comm);

			String sDeptno = request.getParameter("deptno");
			int deptno = Integer.parseInt(sDeptno);
			dto.setDeptno(deptno);

			// db에 수정
			

			EmpService empService = new EmpService();
			int result = empService.editEmp(dto);
			System.out.println("수정 결과:" + result);

			// 어디론가 이동
			response.sendRedirect("list");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
