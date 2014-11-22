package Proj03;

import java.util.Scanner;

public class CountNumberAndDigits {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);

		System.out.print ("Valor: ");

		int originalNumber = input.nextInt();


		for(int i = 1 ; i<= originalNumber; i++)
		{	
			for (int j = 1; j <= (originalNumber-i); j++)
			{
				System.out.print(" "+ 0 + " ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print (" " + i + " ");
			}
			System.out.println();
		}

	}
}