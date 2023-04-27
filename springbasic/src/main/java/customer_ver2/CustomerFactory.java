package customer_ver2;

//Customer와 관련된 객체를 생성해서 전달해주는 외부객체
//객체를 관리하는 컴포넌트를 컨테이너라 부른다.
public class CustomerFactory {
	public CustomerDAO getCustomerDAO() {
		return new MyBatisCustomerDAO();
	}
	
	public CustomerService getCustomerService() {
		CustomerService service = new CustomerServiceImpl(getCustomerDAO());
		return service;
	}
}
