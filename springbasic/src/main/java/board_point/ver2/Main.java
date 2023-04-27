package board_point.ver2;

import customer_ver2.CustomerDTO;
import customer_ver2.CustomerService;
import customer_ver2.CustomerFactory;

public class Main {

	public static void main(String[] args) {
		
		CustomerDTO customer = new CustomerDTO("jang","1234", "장동건", "GOLD");
		CustomerDTO customer2 = new CustomerDTO("bts","1234", "방탄", "VVIP");
		
		BoardDTO board = new BoardDTO("jang","냠냠","냠냠냠냠");
		BoardDTO board2 = new BoardDTO("bts","냠냠","냠냠냠냠");
		
		CustomerService customerService = new CustomerFactory().getCustomerService();
		BoardService boardService = new BoardFactory().getBoardService();
		
		customerService.register(customer);
		customerService.register(customer2);
		
		boardService.insertBoard(board);
		boardService.insertBoard(board2);
	}

}
