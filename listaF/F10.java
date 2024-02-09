package listaF;

import java.util.Scanner;

public class F10 {

	public static void main(String[] args) {
		// Algorítimo que identifica dos 5 números o maior e o menor
		Scanner leia = new Scanner(System.in);
		int a, b, c, d, e, maior, menor;
		System.out.println("Escreva o Primeiro número");
		a = leia.nextInt();
		System.out.println("Escreva o Segundo número");
		b = leia.nextInt();
		System.out.println("Escreva o Terceiro número");
		c = leia.nextInt();
		System.out.println("Escreva o Quarto número");
		d = leia.nextInt();
		System.out.println("Escreva o Quinto número");
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
} 					System.out.println("O maior número é: " + maior + ", e o menor número é: " + menor);
		}
		
	}