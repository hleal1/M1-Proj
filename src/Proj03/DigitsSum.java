package Proj03;

import java.util.Scanner;

public class DigitsSum {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);

		System.out.print ("Valor: ");

		int originalNumber = input.nextInt();
		int digitsSum = 0;


		while (originalNumber > 0 )
		{
			digitsSum += originalNumber % 10;
			originalNumber/= 10;	
		}
		System.out.println ("Resultado: " + digitsSum);
	}

}
