package movie.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import movie.dto.MovieDTO;
import movie.service.MovieService;



@WebServlet("/movie")
public class MovieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/movie doGet 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// DB 조회
		MovieService movieService = new MovieService();
		List<MovieDTO> list = movieService.getAllMovie();
		
		PrintWriter out = response.getWriter();
		
		// HTML 테이블의 헤더 부분을 먼저 출력
		out.println("<table border=1>");
		out.println("	<tr>");
		out.println("		<th>영화 번호</th>");
		out.println("		<th>제목</th>");
		out.println("		<th>이미지 URL</th>");
		out.println("		<th>개봉일</th>");
		out.println("	</tr>");

		// 반복문을 사용하여 목록의 각 영화 데이터를 테이블 행으로 출력
		
		if (list != null) {
			
			for (MovieDTO dto : list) {
				out.println("<tr>");
				out.println("	<td>" + dto.getMovie_id() + "</td>");
				out.println("	<td>" + dto.getTitle() + "</td>");
				out.println("	<td>" + dto.getImg_url() + "</td>");
				out.println("	<td>" + dto.getOpen_date() + "</td>");
				out.println("</tr>");
			}
		}
		// HTML 테이블의 끝 태그를 출력
		out.println("</table>");
		
		out.close();
	}
}