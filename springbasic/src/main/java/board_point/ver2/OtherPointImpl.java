package board_point.ver2;

import customer_ver2.CustomerDAO;
import customer_ver2.CustomerDTO;
import customer_ver2.CustomerFactory;

public class OtherPointImpl extends AbstractPoint{
	
	
	@Override
	public int savePoint(BoardDTO board) {
		int point = 0;
		
		CustomerDAO dao = new CustomerFactory().getCustomerDAO();
		CustomerDTO user = dao.getUser(board.getId());
		String grade = user.getGrade();
		
		if(grade == "VVIP") {
			point = 2000;
		}else {
			point = 1000;
		}
		
		return point;
	}
	

}
