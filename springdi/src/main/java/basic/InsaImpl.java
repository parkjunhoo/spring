package basic;
public class InsaImpl implements Insa {
	DAO dao;
	
	public InsaImpl() {
		System.out.println("InsaImple 기본생서자");
	}
	public InsaImpl(DAO dao) {
		super();
		System.out.println("매개변수가 있는 생성자");
		this.dao = dao;
	}
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
