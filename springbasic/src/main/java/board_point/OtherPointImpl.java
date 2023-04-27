package board_point;

import customer.CustomerDAO;
import customer.CustomerDTO;
import customer.MyBatisCustomerDAO;

public class OtherPointImpl extends AbstractPoint{
	
	
	@Override
	public int savePoint(BoardDTO board) {
		int point = 0;
		
		CustomerDAO dao = new MyBatisCustomerDAO();
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
