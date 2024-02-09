package listaA;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		//Algorítimo para tirar a média
		int n1, n2, n3, n4, res;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o Primeiro número");
		n1 = leia.nextInt();
		System.out.println("Digite o Segundo número");
		n2 = leia.nextInt();
		System.out.println("Digite o Terceiro número");
		n3 = leia.nextInt();
		System.out.println("Digite o Quarto número");
		n4 = leia.nextInt();
		res = (n1 + n2 + n3 + n4) / 4;
		System.out.println("Seu resultado é:" + res + ":)");
		
		
		
		
		
	}

}
