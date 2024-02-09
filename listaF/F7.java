package listaF;

import java.util.Scanner;

public class F7 {

	public static void main(String[] args) {
		//Algoritimo que identifica triângulos
		Scanner leia = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("Escreva o cateto do seu trângulo");
		x = leia.nextInt();
		System.out.println("Escreva o cateto oposto do seu triângulo");
		y = leia.nextInt();
		System.out.println("Escreva a hipotenusa do seu triângulo");
		z = leia.nextInt();
		
		if (x + y < z) {
		System.out.println("As medidas do seu triângulo estão inválidas");
		}	else if (x == y && y == z) {
			System.out.println("O triângulo descrito é equilátero");
		} 		else if (x == y && z > y) {
				System.out.println("O triângulo descrito é isósceles");
		} 			else if (x != y && y != z) {
					System.out.println("O triângulo descrito é escaleno");
		}
	}

}
