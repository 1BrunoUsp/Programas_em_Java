package listaD;

import java.util.Scanner;

public class D8 {

	public static void main(String[] args) {
		// Algorítimo para dividir o maior pelo menor
		
		double a, b, v;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número, sendo o maior como dividendo");
		a = leia.nextInt();
		System.out.println("Digite um número, sendo menor para o divisor");
		b = leia.nextInt();
		
		if(a > b) {
			v = a / b;
			System.out.println("Seu resultado é: " + v);}
			if(b > a) {
			v = a / b;
			System.out.println("Seu resultado é: " + v);}
		
		
			

	}
}


