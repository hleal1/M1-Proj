package Proj01;

import java.util.Scanner;

public class sumdefinerange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner (System.in);

		System.out.println ("Enter a number");

		int n = input1.nextInt();
		
		
		Scanner input2 = new Scanner (System.in);

		System.out.println ("Enter a number");

		int m = input2.nextInt();		
		
		
		// defini��o do m�ximo do intervalo
		int max;
		
		if (n>m)
			max = n;
		else 
			max = m;
		
		// defini��o do m�nimo do intervalo
		int min;
			
		if (n<m)
			min = n;
		else 
			min = m;
		
		// soma do intervalo
		
		int sumRange = 0;
		
		for (int i = max; i >=min; --i){
		
		sumRange += i;
		}
		
		System.out.println ("Sum of Range:" + sumRange);
		
	}

}


