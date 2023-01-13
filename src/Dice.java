import java.util.*;
public class Dice {

	private int dice;

	public int getDice() {
		return dice;
	}

	public void setDice(int dice) {
		this.dice = dice;
	}
	
	Random r = new Random();
	int count = 0;
	public int rolldice(int dice)
	{
		System.out.print("Dice Value is: ");
		for(int i=0; i<dice ; i++)
		{
			int num = r.nextInt(6)+1 ; 
			System.out.print(num + " ");
			count += num;
		}
		
		return count;
		
	}
}
