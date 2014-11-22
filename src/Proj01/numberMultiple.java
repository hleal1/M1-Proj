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
		
		// definir máximo e mínimo dos múltiplos
		
		// definição do máximo do múltiplo
		int max;
		
		if (b>c)
			max = b;
		
		else 
			max = c;
		
		// definição do mínimo do intervalo
		int min;
			
		if (c<b)
			min = c;
		else 
			min = b;
		
		// verificação dos múltiplos do intervalo
		int sumRange = 0;
				
		for (int i = max; i >=min; --i){
		
		if ( a % i == 0)
		sumRange += 1;

		}
		int numberOfValues = max -min + 1;
		if (sumRange == numberOfValues);
		System.out.println ("O número é " + a + " múltiplo de "+ b + " a " + 6);
		
		}
	}


