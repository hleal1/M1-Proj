package Proj04;

import java.util.Scanner;

public class NumberRangeChar {

	public static void main(String[] args) {
		{
			//n�mero introduzido
			Scanner input = new Scanner (System.in);

			System.out.print( "Valor (entre 1 e 26): " );

			int valueRange = input.nextInt();

			// vari�vel do tipo char
			char charDigit = 0;

			// String para armazenar os caracteres
			String charRange = "";

			// ciclo a iniciar no caracter a e � executado at� ao caracter z

			for(int i = 96 + valueRange ; i <= 'z'; i+=valueRange)
			{
				charDigit = (char) i;

				charRange = charRange + " - " + charDigit ;
			}

			System.out.print ("Caracteres: " + charRange);
		}
	}
}
