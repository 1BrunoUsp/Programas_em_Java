package listaF;

import java.util.Scanner;

public class F10 {

	public static void main(String[] args) {
		// Algor�timo que identifica dos 5 n�meros o maior e o menor
		Scanner leia = new Scanner(System.in);
		int a, b, c, d, e, maior, menor;
		System.out.println("Escreva o Primeiro n�mero");
		a = leia.nextInt();
		System.out.println("Escreva o Segundo n�mero");
		b = leia.nextInt();
		System.out.println("Escreva o Terceiro n�mero");
		c = leia.nextInt();
		System.out.println("Escreva o Quarto n�mero");
		d = leia.nextInt();
		System.out.println("Escreva o Quinto n�mero");
		e = leia.nextInt();
		
		maior = a;
		menor = a;
				
		

		if (b > maior) {
		maior = b;
		}else if (b < menor) {
		menor = b;
}
			if (c > maior) {
			maior = c;
			} else if (c < menor) {
			menor = c;
}

				if (d > maior) {
				maior = d;
				} else if (d < menor) {
				menor = d;
}

					if (e > maior) {
					maior = e;
					} else if (e < menor) {
					menor = e;
} 					System.out.println("O maior n�mero �: " + maior + ", e o menor n�mero �: " + menor);
		}
		
	}