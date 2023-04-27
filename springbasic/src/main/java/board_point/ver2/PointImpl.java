package board_point.ver2;

import customer_ver2.CustomerDAO;
import customer_ver2.CustomerDTO;
import customer_ver2.MyBatisCustomerDAO;


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
