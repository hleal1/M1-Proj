package Proj02;

import java.util.Scanner;

public class countDigits {

	public static void main(String[] args) {
	
		Scanner input1 = new Scanner (System.in);

		System.out.println ("Enter a number");

		int a = input1.nextInt();
		
		int count = 0;
		//
		
		while (a > 0 ){
			count += 1;
			a /= 10;
	}
	if(count>1)
	System.out.println (count + " dígitos");
	else
	System.out.println (count + " dígito");
}
}
