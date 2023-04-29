package annotation.exam02;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class Dice extends Random implements AbstractDice{
	
	public int getDiceValue(){
		return nextInt(6)+1;
	}
}

