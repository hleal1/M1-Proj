package Proj03;

import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		System.out.println ("Enter a number");

		int originalNumber = input.nextInt();

		int remainder = 0;
		int divisor = originalNumber;
		int countDivisors = 0;

		while (divisor>=1)
		{
			remainder = originalNumber % divisor;

			if (remainder != 0)
				countDivisors += 1; // conta o número de divisores

			--divisor;		// decrementa o divisor em -1 para o próximo ciclo
		}

		if (countDivisors >= 3)  // se o número tiver 3 ou mais divisores não é primo
			System.out.println(originalNumber + " não é um número primo" );
		else
			System.out.println(originalNumber + " é um número primo" );
	}

}
