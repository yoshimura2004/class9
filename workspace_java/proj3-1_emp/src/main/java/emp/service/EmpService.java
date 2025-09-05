package emp.service;

import java.util.List;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

public class EmpService {

	EmpDAO empDAO = new EmpDAO();
	
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