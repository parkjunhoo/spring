package customer;

import java.util.HashMap;
import java.util.Map;

public class MyBatisCustomerDAO implements CustomerDAO {
	
	static Map<String, CustomerDTO> map = new HashMap<String, CustomerDTO>();

	@Override
	public void add(CustomerDTO user) {
		System.out.println("mybatis에 저장하기===============");
		MyBatisCustomerDAO.map.put(user.getId(), user);

	}

	@Override
	public CustomerDTO getUser(String id) {
		System.out.println("mybatis에서 조회하기=============");
		return MyBatisCustomerDAO.map.get(id);
	}


}
