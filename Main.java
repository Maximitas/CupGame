import java.util.Scanner;
import java.util.ArrayList;
class Main{	
	ArrayList<Player> player = new ArrayList<>();

	public static void main(String [] args){
		Cup cup = new Cup();

		cup.addDice();
		cup.throwDice();
	}

	public static String makePlayer(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Type player name");
		return scan.nextLine();
	}

}