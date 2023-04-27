package board_point;

import customer.CustomerDTO;
import customer.CustomerService;
import customer.CustomerServiceImpl;

public class Main {

	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		CustomerDTO customer = new CustomerDTO("jang","1234", "장동건", "GOLD");
		service.register(customer);
		CustomerDTO customer2 = new CustomerDTO("bts","1234", "방탄", "VVIP");
		service.register(customer2);
		
		BoardService boardservice = new BoardServiceImpl();
		BoardDTO board = new BoardDTO("jang","냠냠","냠냠냠냠");
		boardservice.insertBoard(board);
		
		
		BoardDTO board2 = new BoardDTO("bts","냠냠","냠냠냠냠");
		boardservice.insertBoard(board2);
	}

}
