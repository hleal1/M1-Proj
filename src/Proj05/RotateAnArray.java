package Proj05;

import java.util.Scanner;

/**
 * This class rotates to the right the elements of an array
 * @author Hugo
 *
 */
public class RotateAnArray {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Array original
		System.out.println("Original Array: ");
		printIntArray(numbers); 					//Imprime na consola o array original
		
		Scanner input = new Scanner (System.in);

		System.out.println("Insert the number of rotations: ");
		int numberOfRotations = input.nextInt();		// Introdução do número de rotações

		int swap = 0; 							

		for(int i = 1; i <= numberOfRotations; i++)
		{
			if (numberOfRotations % numbers.length == 0) //se o número de rotações for múltiplo da dimensão do array os ciclos não são realizados uma vez que o array ficará sempre na posição original
				break;
			swap = numbers[numbers.length-1];
			for(int j = numbers.length-1  ; j > 0; j--)	// ciclo que armazena num elemento do array j o elemento anterior
			{	
				numbers[j]=numbers [j-1];
			}
			numbers[0] = swap;
		}
		System.out.println("Rotated Array: ");
		printIntArray(numbers);
	}

	
	public static void printIntArray(int[] intArray) 
	{
		String result = "[";

		for(int i = 0; i<intArray.length; i++)
		{
			result += intArray[i];

			if(i < intArray.length -1)
				result += ",";
		}

		result += "]";


		System.out.println (result);
	}

}
