package listaA;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		//Algorítimo da área do retângulo
		int n1, n2, res;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a base de se retângulo ");
		n1 = leia.nextInt();
		System.out.println("Digite a altura de seu retângulo");
		n2 = leia.nextInt();
		res = (n1 * n2);
		System.out.println("A área do seu retângulo é:" + res + ":)");
		

	}

}
