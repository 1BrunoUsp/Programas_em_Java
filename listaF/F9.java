package listaF;

import java.util.Scanner;

public class F9 {

	public static void main(String[] args) {
		// Algor�timo que fala se � divis�vel por 4 e 5
		Scanner leia = new Scanner(System.in);
		int a;
		System.out.println("escreva um n�mro e eu lhe direi se � divis�vel por 4 e 5");
		a = leia.nextInt();
		
		if (a % 4 == 0 && a % 5 == 0) {
			System.out.println("Seu n�mero( " + a + " ) � divis�vel por 4 e 5, muito bem");
		}
			else if (a % 4 != 0 && a % 5 != 0)
				System.out.println("Seu n�mero(" + a + ") N�o � divis�vel por 4 e 5 ");
			}
	}

