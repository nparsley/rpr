import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 1 input");
		String input1 = sc.nextLine();
		System.out.println("Player 2 input");
		String input2 = sc.nextLine();
		

		if (((input1.equalsIgnoreCase("rock")) && (input2.equalsIgnoreCase("paper")))
				|| ((input1.equalsIgnoreCase("paper")) && (input2.equalsIgnoreCase("rock")))) {
			System.out.println("Paper wins");
		} else if (((input1.equalsIgnoreCase("rock")) && (input2.equalsIgnoreCase("scissor")))
				|| ((input1.equalsIgnoreCase("scissor")) && (input2.equalsIgnoreCase("rock")))) {
			System.out.println("Rock wins");
		} else if (((input1.equalsIgnoreCase("paper")) && (input2.equalsIgnoreCase("scissor")))
				|| ((input1.equalsIgnoreCase("scissor")) && (input2.equalsIgnoreCase("paper")))) {
			System.out.println("Scissor wins");
		} else if (input1.equalsIgnoreCase(input2)) {
			System.out.println("Its a tie");
		}
		
	}
	

}
