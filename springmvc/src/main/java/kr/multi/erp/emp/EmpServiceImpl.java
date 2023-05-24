package kr.multi.erp.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO dao;
	
	
	@Override
	public int insert(EmpDTO user) {
		return dao.insert(user);
	}

	@Override
	public List<EmpDTO> select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmpDTO read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmpDTO login(String id, String pass) {
		return dao.login(id, pass);
	}

	@Override
	public int update(EmpDTO user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
