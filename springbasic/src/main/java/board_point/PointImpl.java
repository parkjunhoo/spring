package board_point;

import customer.CustomerDAO;
import customer.CustomerDTO;
import customer.MyBatisCustomerDAO;

public class PointImpl extends AbstractPoint{
	
	
	@Override
	public int savePoint(BoardDTO board) {
		CustomerDAO dao = new MyBatisCustomerDAO();
		CustomerDTO user = dao.getUser(board.getId());
		String grade = user.getGrade();
		if(grade == "VVIP") {
			return 2000;
		}
		return 0;
	}
	

}
