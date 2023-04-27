package customer;

public interface CustomerDAO {
	
	
	public void add(CustomerDTO user);
	CustomerDTO getUser(String id);
}
