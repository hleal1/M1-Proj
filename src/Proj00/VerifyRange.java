package Proj00;

public class VerifyRange {
	


	public static void main(String[] args) {
		
		int valueOrChar = 'H' ;
				
		if ( valueOrChar >= 48 &  valueOrChar <= 57)
			System.out.println ("Pertence ao intervalo de caracteres 0 - 9");
		
		if ( valueOrChar >= 97 &  valueOrChar <= 122)
			System.out.println ("Pertence ao intervalo de caracteres a - z ");
		
		if ( valueOrChar >= 65 &  valueOrChar <= 90)
			System.out.println ("Pertence ao intervalo de caracteres A - B ");
	}

}



