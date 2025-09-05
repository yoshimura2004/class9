package movie.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movie.dto.MovieDTO;
import movie.service.MovieService;

@WebServlet("/add")
public class MovieAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("/movie doPost 실행");
	    
	    request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    
	    MovieDTO dto = new MovieDTO();
	    PrintWriter out = response.getWriter();
	    
	    String movieId = request.getParameter("movie_id");
	    String title = request.getParameter("title");
	    String imgUrl = request.getParameter("img_url");
	    Date openDate = Date.valueOf("open_date");
	    
	    int movieid = Integer.parseInt(movieId);	// 형변`s
	    
		dto.setMovie_id(movieid);
	    dto.setTitle(title);
	    dto.setImg_url(imgUrl);
	    dto.setOpen_date(openDate);
	   
		// db에 삽입
	    
	    MovieService movieService = new MovieService();
	    int result = movieService.addMovie(dto);
	    System.out.println("삽입 결과:"+ result);
	    
		// 어디론가 이동
		response.sendRedirect("list");
		
	}

}
