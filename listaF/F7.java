package listaF;

import java.util.Scanner;

public class F7 {

	public static void main(String[] args) {
		//Algoritimo que identifica tri�ngulos
		Scanner leia = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("Escreva o cateto do seu tr�ngulo");
		x = leia.nextInt();
		System.out.println("Escreva o cateto oposto do seu tri�ngulo");
		y = leia.nextInt();
		System.out.println("Escreva a hipotenusa do seu tri�ngulo");
		z = leia.nextInt();
		
		if (x + y < z) {
		System.out.println("As medidas do seu tri�ngulo est�o inv�lidas");
		}	else if (x == y && y == z) {
			System.out.println("O tri�ngulo descrito � equil�tero");
		} 		else if (x == y && z > y) {
				System.out.println("O tri�ngulo descrito � is�sceles");
		} 			else if (x != y && y != z) {
					System.out.println("O tri�ngulo descrito � escaleno");
		}
	}

}
