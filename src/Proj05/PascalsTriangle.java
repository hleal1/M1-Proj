package Proj05;

import java.util.Scanner;
/**
 * This class generates a pascal triangle with the number of lines that
 * @author Hugo
 *
 */
public class PascalsTriangle {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Triangle's height: ");
	
	int numberOfLines = input.nextInt(); // número de linhas do triangulo de Pascal

	int[] previousLine;			//variável que armazena os valores da linha anterior
	int[] currentLine = {1};	//variável da linha actual, inicializada na 1ª linha e apenas com o valor 1

	printIntArray(currentLine); //imprime para a consola a 1ªlinha do triangulo de pascal

	previousLine = currentLine; //a variável previousLine armazena agr o valor da 1ªlinha;

	for (int i = 2; i <= numberOfLines; i++) 
	{
		currentLine = new int[i];
		currentLine[0] = 1;			// o primeiro elemento da linha é 1
		currentLine[i - 1] = 1;		// o último elemento da linha é 1
		for (int j = 0; j <= i - 3; j++) 
		{
			currentLine[j + 1] = previousLine[j] + previousLine[j + 1];
		}
		printIntArray(currentLine);
		previousLine = currentLine;
	}
	}

	/**
	 * Prints an int array to console
	 * @param intArray to print
	 */
	public static void printIntArray(int[] intArray) 
	{
		String result = "";

		for(int i = 0; i<intArray.length; i++)
		{
			result += intArray[i];

			if(i < intArray.length -1)
				result += " ";
		}

		System.out.println (result);
	}

}

