package di.setter01;
public class MemberDAO implements DAO{
	
	public MemberDAO() {
		System.out.println("memberDAO생성");
	}
	
	public void add(MemberDTO user){
		System.out.println("회원가입");
	}
	public MemberDTO getUser(String id){
		System.out.println("아이디로 회원 조회하기");
		return null;
	}
	
	public static MemberDAO getDAO() {
		return new MemberDAO();
	}
}
