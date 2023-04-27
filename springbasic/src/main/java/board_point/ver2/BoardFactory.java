package board_point.ver2;

public class BoardFactory {
	public BoardDAO getBoardDAO() {
		return new BoardDAOImpl();
	}
	
	public BoardService getBoardService() {
		return new BoardServiceImpl(getBoardDAO(), new AbstractPointFactory().getAbstractPoint());
	}
}
