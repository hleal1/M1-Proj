package Proj03;

import java.util.Random;
import java.util.Scanner;


public class GuessNumber {

	public static void main(String[] args)
	{
		//n�mero aleat�rio
		Random random = new Random();
	
		int numberToGuess = random.nextInt(101);

		//n�mero introduzido
		
		Scanner input1 = new Scanner (System.in);

		System.out.println ("Introduza um Valor entre 0 e 100");

		int guessingNumber = input1.nextInt();
		
		//tentativas
		int attempts = 1;
		
		//Ganhar � 1� tentativa
		if (guessingNumber == numberToGuess)
			System.out.println ("Acertou! N�mero de tentativas: 1");
		
		//Restantes tentativas
		while (guessingNumber != numberToGuess)
			{
			attempts += 1;
			
			if (guessingNumber <= numberToGuess)
				System.out.println ("O valor � maior que " + guessingNumber);
			else 
				System.out.println ("O valor � menor que " + guessingNumber);
		
				Scanner input2 = new Scanner (System.in);
				System.out.println ("Enter a number");
				guessingNumber = input2.nextInt();
			
				}
		if(guessingNumber == numberToGuess)
			System.out.println ("Acertou! N�mero de tentativas: " + attempts);
		}
}
