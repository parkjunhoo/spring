package di.constructor02;

public class Player implements AbstractPlayer{
	AbstractDice d;
	
	public Player(AbstractDice d) {
		this.d = d;
	}
	int totalValue=0;
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}