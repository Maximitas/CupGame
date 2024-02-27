import java.util.ArrayList;
import java.util.Scanner;

class Cup{
	ArrayList<Die> dice = new ArrayList<Die>();
	Scanner scan = new Scanner(System.in);
	Main main = new Main();




	public void addDice(){
		int numberOfDice = selectNumberOfDice();
		for (int i = 0; i < numberOfDice ; i++) {
		dice.add(new Die(6));
	}
}

	public int selectNumberOfDice(){
		System.out.println("Type the number of dice you want");
		return scan.nextInt();
}


	public void throwDice(){
		String name = main.makePlayer();
		for (Die die : dice) {
			int result = die.roll();
			System.out.println(name + " Die Roll: " + result);
		}
	}
}