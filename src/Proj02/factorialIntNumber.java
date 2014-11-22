package Proj02;

import java.util.Scanner;

public class factorialIntNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner (System.in);

		System.out.println ("Enter a number");

		int a = input1.nextInt();
		
		// variável para ser utilizada no ciclo
		int b = a;
		
		int factorialDigit = 0;
		int factorialValue = 1;
		
		// ciclo para retirar um digito de cada vez e multiplica-lo pelo próximo
		while (b > 0){
			factorialDigit = b;
			factorialValue = factorialDigit * factorialValue;
			b-=1;
		}
		
		System.out.println (a + "!" + " = " + factorialValue);	
		
	}

}
