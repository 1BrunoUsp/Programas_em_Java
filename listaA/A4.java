package listaA;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// Algorítmo para calcular volume
		
		double r, h, v;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o raio da lata");
		r = leia.nextInt();
		System.out.println("Digite a altura da lata");
		h = leia.nextInt();
		
		v = (3.14159*r*r*h);
		
		System.out.println("O volume da lata de óleo é: " + v + "Cm³");

	}

}
