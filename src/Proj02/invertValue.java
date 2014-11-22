package Proj02;

import java.util.Scanner;

public class invertValue {

	public static void main(String[] args) {
	
		Scanner input1 = new Scanner (System.in);

		System.out.println ("Enter a number");

		int originalNumber = input1.nextInt();
		int invertedDigits;
		int invertedNumber = 0;
		
		while (originalNumber != 0){
		
		invertedDigits = originalNumber % 10;
		
		invertedNumber = invertedNumber*10 + invertedDigits;
		
		originalNumber /=10;
		
		}
		System.out.println (invertedNumber);
	}

}
