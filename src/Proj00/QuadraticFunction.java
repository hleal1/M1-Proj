package Proj00;

public class QuadraticFunction {


	public static void main(String[] args) {

		int a = 3;

		int b = -7;

		int c = 1;

		System.out.println ("Função: " + "(" + a + ")" + "x^2 + " + "(" + b + ")" + "x + " + "(" + c+ ")" + " = 0");

		double zero1 = 0;
		double zero2 = 0;

		zero1= (-b + Math.sqrt (b * b - 4 * a * c)) / ( 2 * a);
		zero2= (-b - Math.sqrt (b * b - 4 * a * c)) / ( 2 * a);

		System.out.println ("Zeros: " + zero1 + " e " + zero2);
	}

}


