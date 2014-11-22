package Proj02;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner (System.in);

		System.out.println ("Enter a number");

		int count = input1.nextInt();
		
		int n = 1;
		int fibonacciNumber=0;
		int fibonacciNumber1 = 0;
		int fibonacciNumber2 = 1;
		
		while (n <= count){
		fibonacciNumber = fibonacciNumber1 + fibonacciNumber2;
		fibonacciNumber1 = fibonacciNumber2;
		fibonacciNumber2 = fibonacciNumber;
		System.out.print (fibonacciNumber1 + " ");
		n +=1 ;
		 
		}	
	}

}
