package memberdao;

import javax.naming.*;
import javax.sql.DataSource;

import memberdto.MemberDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	
	
	private Connection getConnection()  {

		Connection conn = null;
		try {
			// JNDI : 글씨로 뭔가를 가져오는 방식
			Context initContext = new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/oracle");
			try {
				conn = ds.getConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			
		}
		return conn;
	}

	
	// 로그인 검증
	public MemberDTO login(String ename, int empno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			String sql = "select * from employee where ename = ? and empno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ename);
			pstmt.setInt(2, empno);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setEmpno(rs.getInt("empno"));
				member.setEname(rs.getString("ename"));
				member.setRole(rs.getString("role"));
				return member;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	// 회원 목록 조회
	public List<MemberDTO> getMemberList() {
		List<MemberDTO> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			String sql = "select * from employee";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setEmpno(rs.getInt("empno"));
				member.setEname(rs.getString("ename"));
				member.setRole(rs.getString("role"));
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}