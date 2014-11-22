package Proj01;

import java.util.Scanner;

public class sumMultipleRange {

	public static void main(String[] args) {
	
		Scanner input1 = new Scanner (System.in);

		System.out.println ("Enter a number");

		int n = input1.nextInt();
		
		
		Scanner input2 = new Scanner (System.in);

		System.out.println ("Enter a number");

		int m = input2.nextInt();		

		Scanner input3 = new Scanner (System.in);

		System.out.println ("Enter multiple");

		int k = input3.nextInt();
		
		// definição do máximo do intervalo
		int max;
		
		if (n>m)
			max = n;
		else 
			max = m;
		
		// definição do mínimo do intervalo
		int min;
			
		if (n<m)
			min = n;
		else 
			min = m;
		
		// soma do intervalo
		
		int sumRange = 0;
		
		for (int i = max; i >=min; --i){
		
			if ( i % k == 00)
		sumRange += i;
		}
		
		System.out.println ("Sum of Range:" + sumRange);
		
	}

	}

