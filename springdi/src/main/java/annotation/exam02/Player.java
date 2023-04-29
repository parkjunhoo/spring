package annotation.exam02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Player implements AbstractPlayer{
	@Autowired
	AbstractDice d;
	
	public Player() {
		
	}
	
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