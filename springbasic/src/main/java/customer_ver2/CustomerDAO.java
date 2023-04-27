package customer_ver2;

public interface CustomerDAO {
	
	
	public void add(CustomerDTO user);
	CustomerDTO getUser(String id);
}
