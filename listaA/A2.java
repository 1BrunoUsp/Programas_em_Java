package listaA;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		//Algor�timo da �rea do ret�ngulo
		int n1, n2, res;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a base de se ret�ngulo ");
		n1 = leia.nextInt();
		System.out.println("Digite a altura de seu ret�ngulo");
		n2 = leia.nextInt();
		res = (n1 * n2);
		System.out.println("A �rea do seu ret�ngulo �:" + res + ":)");
		

	}

}
