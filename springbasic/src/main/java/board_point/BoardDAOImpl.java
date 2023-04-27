package board_point;

import java.util.HashMap;
import java.util.Map;


public class BoardDAOImpl implements BoardDAO{
	static Map<String, BoardDTO> map = new HashMap<String, BoardDTO>();

	public void insertBoard(BoardDTO board) {
		synchronized (map) {
			map.put(board.getId(), board);
			System.out.println(board);
		}
		
	}
	
}
