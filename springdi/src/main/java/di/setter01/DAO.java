package di.setter01;

public interface DAO {
	public void add(MemberDTO user);
	public MemberDTO getUser(String id);
}
