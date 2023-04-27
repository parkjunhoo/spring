package board_point.ver2;

public class BoardServiceImpl implements BoardService {
	BoardDAO dao;
	AbstractPoint point;
	
	public BoardServiceImpl(BoardDAO dao , AbstractPoint point) {
		this.dao = dao;
		this.point = point;
	}
	
	@Override
	public void insertBoard(BoardDTO board) {
		this.dao.insertBoard(board);
		System.out.println("포인트:"+point.savePoint(board));
	}
	
}
