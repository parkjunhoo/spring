package customer;

public class CustomerServiceImpl implements CustomerService {
	//내부에서 사용되는 구현클래스를 직접 코드로 정의
	//mybatis로 연동되는 db연동방법을 JPA로 변경하려면???
	//=> 구현 클래스 부분을 직접 소스에서 변경해야 한다.
	// => OCP원칙이 지켜지지 못함 : 기존에 잘 실행되는 소스가 변경
	//CustomerDAO dao = new MyBatisCustomerDAO();
	CustomerDAO dao = new MyBatisCustomerDAO();

	@Override
	public void register(CustomerDTO user) {
		dao.add(user);
	}

	@Override
	public CustomerDTO read(String id) {
		
		return dao.getUser(id);
	}

}
