package Proj00;

public class EvenOddNumberWithMultiplicationOperator {

	public static void main(String[] args) {

		int value = 3;

		float split = value * 0.5f;

		if ( (int) split*2 == value ) 
		{
			System.out.println("é par");

		}
		else System.out.println("é ímpar");
	}
}


