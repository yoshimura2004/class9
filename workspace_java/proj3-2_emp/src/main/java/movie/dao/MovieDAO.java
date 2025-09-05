package movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import movie.dto.MovieDTO;

public class MovieDAO {

	// DB Connection Pool에서 Connection을 가져오는 메서드
	private Connection getConn() {
		Connection conn = null;

		try {
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			conn = dataFactory.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	// 전체 영화 목록을 조회하는 메서드
	public List<MovieDTO> selectAllMovie() {
		List<MovieDTO> list = new ArrayList<MovieDTO>();

		// try-with-resources 구문을 사용하여 자원(Connection, PreparedStatement, ResultSet) 자동
		// 반납
		try (Connection conn = getConn();
				PreparedStatement ps = conn.prepareStatement("select * from movie");
				ResultSet rs = ps.executeQuery();) {

			// SQL 실행 및 결과 활용
			while (rs.next()) {

				MovieDTO dto = new MovieDTO();

				int movie_id = rs.getInt("movie_id");

				dto.setMovie_id(movie_id);
				dto.setTitle(rs.getString("title"));
				dto.setImg_url(rs.getString("img_url"));
				dto.setOpen_date(rs.getDate("open_date")); // open_date는 varchar2이므로 getString() 사용

				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// 삽입❤❤
	public int insertMovie(MovieDTO dto) {

		int result = -1;
		try {

			// db접속
			Connection conn = getConn();
			// 스큐 준비.
			String query = "  insert into movie (movie_id, title, img_url, open_date)";
			query += " values(?, ?, ?, ?)";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getImg_url());
			ps.setDate(3, dto.getOpen_date());

			// select가 아님.
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	// 딜리투

	public int deleteMovie(int movieId) {

		int result = -1;
		
		try {
			// db접속
			Connection conn = getConn();
			// 스큐준비
			String query = "delete from movie where movie_id = ?";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setInt(1, movieId);
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
