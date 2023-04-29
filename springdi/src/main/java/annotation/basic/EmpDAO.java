package annotation.basic;

import org.springframework.stereotype.Repository;

@Repository("empdao")
public class EmpDAO implements DAO{
	
	public EmpDAO() {
		System.out.println("EMPDAO생성");
	}
	
	public void add(MemberDTO user){
		System.out.println("EMP회원가입");
	}
	public MemberDTO getUser(String id){
		System.out.println("EMP아이디로 회원 조회하기");
		return null;
	}
	
	public static EmpDAO getDAO() {
		return new EmpDAO();
	}
}
