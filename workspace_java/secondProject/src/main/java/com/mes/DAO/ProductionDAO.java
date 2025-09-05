package com.mes.DAO;

import com.mes.DTO.ProductionDTO;
import com.mes.util.DBManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductionDAO {

    private ProductionDAO() {}
    private static final ProductionDAO instance = new ProductionDAO();
    public static ProductionDAO getInstance() { return instance; }

    // 목록 전체
    public List<ProductionDTO> findAll() {
        String sql =
            "SELECT PRODUCTION_NO, STANDARD_CODE, EMPLOYEE_NO, " +
            "       PR_START, PR_END, PR_TARGET, PR_COMPLETED, " +
            "       CREATE_DATE, UPDATE_DATE " +
            "  FROM PRODUCTION " +
            " ORDER BY UPDATE_DATE DESC";

        List<ProductionDTO> list = new ArrayList<>();
        try (Connection conn = DBManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) list.add(mapRow(rs));
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }

    public List<ProductionDTO> searchByPrefix(String q) {
        String sql =
            "SELECT PRODUCTION_NO, STANDARD_CODE, EMPLOYEE_NO, " +
            "       PR_START, PR_END, PR_TARGET, PR_COMPLETED, " +
            "       CREATE_DATE, UPDATE_DATE " +
            "  FROM PRODUCTION " +
            " WHERE UPPER(PRODUCTION_NO) LIKE UPPER(?) " +
            "    OR UPPER(STANDARD_CODE) LIKE UPPER(?) " +   // ← STANDARD_CODE 로 검색
            " ORDER BY UPDATE_DATE DESC";

        List<ProductionDTO> list = new ArrayList<>();
        try (Connection conn = DBManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            String like = q + "%";
            ps.setString(1, like);
            ps.setString(2, like);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) list.add(mapRow(rs));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }

    private ProductionDTO mapRow(ResultSet rs) throws SQLException {
        ProductionDTO d = new ProductionDTO();
        d.setProductionNo(rs.getString("PRODUCTION_NO"));
        d.setStandardCode(rs.getString("STANDARD_CODE")); // ← 표준코드
        d.setEmployeeNo(rs.getString("EMPLOYEE_NO"));
        d.setPrStart(rs.getDate("PR_START"));
        d.setPrEnd(rs.getDate("PR_END"));
        d.setPrTarget(rs.getInt("PR_TARGET"));
        d.setPrCompleted(rs.getInt("PR_COMPLETED"));
        d.setCreateDate(rs.getDate("CREATE_DATE"));
        d.setUpdateDate(rs.getDate("UPDATE_DATE"));
        return d;
    }


}
