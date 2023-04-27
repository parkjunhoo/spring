package customer_ver2;

import java.util.HashMap;
import java.util.Map;

public class SpringJDBCCustomerDAO implements CustomerDAO {
	static Map<String, CustomerDTO> map = new HashMap<String, CustomerDTO>();
	
	@Override
	public void add(CustomerDTO user) {
		System.out.println("JPA에 저장하기===============");
		synchronized (map) {
			map.put(user.getId(), user);
		}
		
	}

	@Override
	public CustomerDTO getUser(String id) {
		System.out.println("JPA에서 조회하기=============");
		return map.get("id");
	}

}
