package Proj04;

import java.util.Random;
import java.util.Scanner;


public class HorseRace {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);

		System.out.println ("Aposta no cavalo (1 a 4): ");

		int betHorse = input.nextInt();

		int horse1 = 0;
		int horse2 = 0;
		int horse3 = 0;
		int horse4 = 0;
		int winner = 0;
		Random random = new Random();

		while ( horse1<100 && horse2<100 && horse3<100 && horse4<100 )
		{
			horse1 = random.nextInt(10) + horse1;
			horse2 = random.nextInt(10) + horse2;
			horse3 = random.nextInt(10) + horse3;
			horse4 = random.nextInt(10) + horse4;	

			System.out.println ("Cavalo(1): " + horse1);
			System.out.println ("Cavalo(2): " + horse2);
			System.out.println ("Cavalo(3): " + horse3);
			System.out.println ("Cavalo(4): " + horse4);
			System.out.println ("");				
		}
		System.out.println ("Terminou a corrida.");

		if (horse1 >= 100)
			winner = 1;
		if (horse2 >= 100)
			winner = 2;
		if (horse3 >= 100)
			winner = 3;
		if (horse4 >= 100)
			winner = 4;

		if (betHorse == winner)
			System.out.println ("O cavalo "+ winner + " venceu, ganhou a aposta.");
		else
			System.out.println ("O cavalo "+ winner + " venceu, perdeu a aposta.");	
	}
}
