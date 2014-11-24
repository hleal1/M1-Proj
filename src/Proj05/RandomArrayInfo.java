package Proj05;

import java.util.Random;

/**
 * This class creates an random array of ten elements with values between 0 and 100.
 * Prints to console the average, the hightest number and odd numbers of the array
 * @author Hugo
 *
 */
public class RandomArrayInfo {

	public static void main(String[] args) {

		Random random = new Random();

		int[] numbers = new int[10];
		String numbersArray = "";
		double numbersSum = 0;
		String oddNumbers = "";

		// Nste ciclo são gerados os números aleatórios do array e realiza-se a soma dos valores gerados
		for(int i =0; i < numbers.length ; i++)
		{
			numbers[i] = random.nextInt(101);
			numbersSum = numbers[i] + numbersSum;
			numbersArray += numbers[i] + " " ;
		}

		// Este ciclo ordena os elementos do array
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 1 ; j < numbers.length-i; j++)
			{
				if(numbers[j] < numbers[j - 1] )
				{
					int	temp = numbers[ j ];
					numbers[ j ] = numbers[ j - 1 ];
					numbers [ j - 1 ] = temp;	
				}
			}
		}

		//Neste ciclo a variável oddNumbers armazena os números ímpares do array
		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] % 2 != 0 )
			{
				oddNumbers += numbers[i] + " "; 					
			}
		}

		System.out.println("Array: [ " + numbersArray + "]");
		System.out.println(" ");

		double average = numbersSum / numbers.length;
		System.out.println("Average: " + average);
		System.out.println("Highest number: " + numbers[9]);
		System.out.println("Odd numbers: [ " + oddNumbers + "]");
		return;
	}
}


