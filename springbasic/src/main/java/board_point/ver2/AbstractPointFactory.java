package board_point.ver2;

public class AbstractPointFactory {
	public AbstractPoint getAbstractPoint() {
		return new OtherPointImpl();
	}
}
