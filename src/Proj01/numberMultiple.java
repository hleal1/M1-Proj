package Proj01;

import java.util.Scanner;

public class numberMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner (System.in);

		System.out.println ("Enter a number");

		int a = input1.nextInt();
		
		
		Scanner input2 = new Scanner (System.in);

		System.out.println ("Enter multiple 1");

		int b = input2.nextInt();		

		Scanner input3 = new Scanner (System.in);

		System.out.println ("Enter multiple 2");

		int c = input3.nextInt();
		
		// definir m�ximo e m�nimo dos m�ltiplos
		
		// defini��o do m�ximo do m�ltiplo
		int max;
		
		if (b>c)
			max = b;
		
		else 
			max = c;
		
		// defini��o do m�nimo do intervalo
		int min;
			
		if (c<b)
			min = c;
		else 
			min = b;
		
		// verifica��o dos m�ltiplos do intervalo
		int sumRange = 0;
				
		for (int i = max; i >=min; --i){
		
		if ( a % i == 0)
		sumRange += 1;

		}
		int numberOfValues = max -min + 1;
		if (sumRange == numberOfValues);
		System.out.println ("O n�mero � " + a + " m�ltiplo de "+ b + " a " + 6);
		
		}
	}


