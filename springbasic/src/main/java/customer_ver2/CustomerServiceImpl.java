package customer_ver2;

public class CustomerServiceImpl implements CustomerService {
	//소스안에 객체를 생성하는 코드를 분리
	CustomerDAO dao;
	
	public CustomerServiceImpl(CustomerDAO dao) {
		super();
		this.dao = dao;
	}


	@Override
	public void register(CustomerDTO user) {
		dao.add(user);
	}


	@Override
	public CustomerDTO read(String id) {
		
		return dao.getUser(id);
	}

	public void setDao(CustomerDAO dao) {
		this.dao = dao;
	}

}
