package kr.multi.erp.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	JdbcTemplate tem;
	
	@Override
	public int insert(EmpDTO user) {
		
		return tem.update("insert into myemp values(?,?,?,?,?,?,?)",
				new Object[] {user.getDeptno(),
						user.getName(),
						user.getId(),
						user.getPass(),
						user.getAddr(),
						user.getPoint(),
						user.getGrade()});
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
		String sql = "select * from myemp where id =?";
		EmpDTO emp = null;
		try {
			tem.queryForObject(sql, 
					new Object[] {id , pass}, new EmpRowMapper());
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
		
		return emp;
	}

	@Override
	public int update(EmpDTO user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
