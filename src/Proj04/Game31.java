package Proj04;

import java.util.Scanner;

public class Game31 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		System.out.print("Player 1: ");
		String player1 = input.nextLine();

		System.out.print("Player 2: ");
		String player2 = input.nextLine();

		System.out.println("The game will start!");
		System.out.println ("");

		int score = 0;

		while (score < 31 )
		{
			System.out.println ("The current value is "+ score);
			System.out.print ("The player " + player1 + " will add " );
			score += input.nextInt();
			System.out.println ("");

			if (score >=31)
			{
				System.out.println ("The player "+ player1 + " reached " + score);
				System.out.println ("The player "+ player1 + " has won. Congratulations!");
				break;
			}
			System.out.println ("The current value is "+ score);
			System.out.print ("The player " + player2 + " will add " );
			score += input.nextInt();
			System.out.println ("");

			if (score >=31)
			{
				System.out.println ("The player "+ player2 + " reached " + score);
				System.out.println ("The player "+ player2 + " has won. Congratulations!");
				break;
			}

		}

	}

}
