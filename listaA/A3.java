package listaA;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// Algor�tmo de conver��o de temperatura
		int n1, res;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius");
		n1 = leia.nextInt();
		res = (9*n1+160)/5;
		System.out.println("A temperatura em Fahrenheit �: " + res + " :)");

	}

}
