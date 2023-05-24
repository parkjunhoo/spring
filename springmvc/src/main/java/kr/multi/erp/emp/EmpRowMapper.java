package kr.multi.erp.emp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpRowMapper implements RowMapper<EmpDTO>{

	@Override
	public EmpDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmpDTO emp = new EmpDTO(
				rs.getString(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4),
				rs.getString(5),
				rs.getInt(6),
				rs.getString(7)
				);
		
		return emp;
	}

}
