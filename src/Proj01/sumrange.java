package Proj01;

import java.util.Scanner;

public class sumrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		System.out.println ("Enter a number");

		int n = input.nextInt();
		int max = n;
		int sumRange = 0;
		
		for (int i = max; i >= 1; --i){
		
		sumRange += i;
		}
		
		System.out.println ("Sum of Range:" + sumRange);
		
	}

}
