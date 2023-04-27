package basic;
public class InsaImpl implements Insa {
	@Override
	public void addUser(MemberDTO user) {
		MemberDAO.getDAO().add(user);
	}

	@Override
	public MemberDTO getUser(String id) {
		MemberDAO.getDAO().getUser(id);
		return null;
	}

}
