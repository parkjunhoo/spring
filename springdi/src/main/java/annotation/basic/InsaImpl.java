package annotation.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("insa")
public class InsaImpl implements Insa {
	//
	@Autowired
	@Qualifier("empdao")
	DAO dao;
	
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
