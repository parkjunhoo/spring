package board_point;

public class BoardServiceImpl implements BoardService {
	BoardDAO dao = new BoardDAOImpl();
	AbstractPoint point = new OtherPointImpl();
	@Override
	public void insertBoard(BoardDTO board) {
		dao.insertBoard(board);
		System.out.println(point.savePoint(board));
	}
	
}
