import java.util.*;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to snake and Ladder Game");
		
		// Adding Players
		System.out.println("Enter number of player : ");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		
		for(int i=0 ; i<p ; i++)
		{
			Player s = new Player();
			System.out.println("Enter Name: ");
			String name = sc.next();
			s.setName(name);
			System.out.println("Enter ID: ");
			int id = sc.nextInt();
			s.setId(id); 	
		}

		// Board Size
		System.out.println("Enter Length of board: ");
		int size = sc.nextInt();
		
		// Adding Ladder
		System.out.println("Enter number of Ladder : ");
		int l = sc.nextInt();

		for(int i=0 ; i<l ; i++)
		{
			Ladder lad = new Ladder();
			System.out.println("Enter Starting Point: ");
			int start = sc.nextInt();
			System.out.println("Enter Ending Point: ");
			int end = sc.nextInt();
			if( start < 1 && start>= size && end < 1 && end>= size && start > end)
			{
				System.out.println("Please Enter Correct Value");
			}
			else
			{
				lad.setStart(start);
				lad.setDest(end);
			}
		}
		
		// Adding Snake
		System.out.println("Enter number of Snake : ");
		int sn = sc.nextInt();

		for(int i=0 ; i<sn ; i++)
			{
				Snake snake = new Snake();
				System.out.println("Enter Starting Point: ");
				int start = sc.nextInt();
				System.out.println("Enter Ending Point: ");
				int end = sc.nextInt();
				if( start < 1 && start>= size && end < 1 && end>= size && start < end)
				{
					System.out.println("Please Enter Correct Value");
				}
				else
				{
					snake.setDest(start);
					snake.setDest(end);	
				}
			}
		
		
		// Adding number of Dices
		System.out.println("Enter number of Dices : ");
		int di = sc.nextInt();
		Dice dice = new Dice();
		dice.setDice(di);
		
		
		System.out.println("Lets Game Begin");
	}

}
