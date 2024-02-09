package listaD;

import java.util.Scanner;

public class D4 {

	public static void main(String[] args) {
		// Algorítimo que mostra a diferença do maior valor pelo menor
		
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		a = leia.nextInt();
		System.out.println("Digite o segundo valor");
		b = leia.nextInt();
		
		if (a > b) {
			c = a - b;
			System.out.println("A diferença do maior pelo menor é: " + c);
		}
		{
			if(b > a) {
				c = b - a;
				System.out.println("A diferença do maior pelo menor é: " + c);
			}
			if(a == b) {
				System.out.println("O número digitado é igual");
			}
		}
}
}