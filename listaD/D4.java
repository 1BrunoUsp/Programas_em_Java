package listaD;

import java.util.Scanner;

public class D4 {

	public static void main(String[] args) {
		// Algor�timo que mostra a diferen�a do maior valor pelo menor
		
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		a = leia.nextInt();
		System.out.println("Digite o segundo valor");
		b = leia.nextInt();
		
		if (a > b) {
			c = a - b;
			System.out.println("A diferen�a do maior pelo menor �: " + c);
		}
		{
			if(b > a) {
				c = b - a;
				System.out.println("A diferen�a do maior pelo menor �: " + c);
			}
			if(a == b) {
				System.out.println("O n�mero digitado � igual");
			}
		}
}
}