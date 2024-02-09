package listaF;

import java.util.Scanner;

public class F9 {

	public static void main(String[] args) {
		// Algorítimo que fala se é divisível por 4 e 5
		Scanner leia = new Scanner(System.in);
		int a;
		System.out.println("escreva um némro e eu lhe direi se é divisível por 4 e 5");
		a = leia.nextInt();
		
		if (a % 4 == 0 && a % 5 == 0) {
			System.out.println("Seu número( " + a + " ) é divisível por 4 e 5, muito bem");
		}
			else if (a % 4 != 0 && a % 5 != 0)
				System.out.println("Seu número(" + a + ") Não é divisível por 4 e 5 ");
			}
	}

