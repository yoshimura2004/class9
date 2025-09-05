package emp.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

public class EmpService {

	EmpDAO empDAO = new EmpDAO();
	
	public Map getPageEmp(EmpDTO dto){
		
		int pagePerRows = dto.getPagePerRows();
		int page = dto.getPage();
		
		int start = 0
			, end = 0;
		
		end = pagePerRows * page;
		start = end - (pagePerRows - 1);
		
		dto.setStart(start);
		dto.setEnd(end);
		
		System.out.println(dto);
		
		EmpDAO empDAO = new EmpDAO();
		
		List list = empDAO.selectPageEmp(dto);
		int total = empDAO.selectTotalEmp(dto);
		
		Map map = new HashMap();
		map.put("list", list);
		map.put("total", total);
		
		return map;
	}
	public List<EmpDTO> getAllEmp(){
		EmpDAO empDAO = new EmpDAO();
		List list = empDAO.selectAllEmp();
		return list;
	}
	
	public EmpDTO getOneEmp(EmpDTO empDTO) {
		EmpDTO dto = empDAO.selectOneEmp(empDTO);
		return dto;
	}
	
	public int removeEmp(EmpDTO empDTO) {
		return empDAO.deleteEmp(empDTO);
	}

	public int addEmp(EmpDTO empDTO) {
		return empDAO.insertEmp(empDTO);
	}
	
	public int editEmp(EmpDTO empDTO) {
		return empDAO.updateEmp(empDTO);
	}
}