package basic;
public class TestMain {
	public static void main(String[] args) {
		Insa insa = new InsaImpl();
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		insa.addUser(user);

	}

}