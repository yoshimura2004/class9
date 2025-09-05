package movie.service;

import java.util.List;

import movie.dao.MovieDAO;
import movie.dto.MovieDTO;

public class MovieService {
	
	// 밖으로 빼기
	MovieDAO movieDAO = new MovieDAO();

	//전체조회
	public List<MovieDTO> getAllMovie() {
		MovieDAO movieDAO = new MovieDAO();
		List list = movieDAO.selectAllMovie();
		return list;
	}
	//삽입
	public int addMovie(MovieDTO dto) {
	    return movieDAO.insertMovie(dto);
	}
	//사쿠죠
	public int deleteMovie(int movieId) {
		return movieDAO.deleteMovie(movieId);
	}
	
	

}
