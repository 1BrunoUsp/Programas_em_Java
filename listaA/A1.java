package listaA;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		//Algor�timo para tirar a m�dia
		int n1, n2, n3, n4, res;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o Primeiro n�mero");
		n1 = leia.nextInt();
		System.out.println("Digite o Segundo n�mero");
		n2 = leia.nextInt();
		System.out.println("Digite o Terceiro n�mero");
		n3 = leia.nextInt();
		System.out.println("Digite o Quarto n�mero");
		n4 = leia.nextInt();
		res = (n1 + n2 + n3 + n4) / 4;
		System.out.println("Seu resultado �:" + res + ":)");
		
		
		
		
		
	}

}
