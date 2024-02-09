package listaD;

import java.util.Scanner;

public class D7 {

	public static void main(String[] args) {
		// Algorítimo que toma o referencial o número 5 e o 10
		
		int a;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número para ser comparado ao 5 ou 10");
		a = leia.nextInt();
		
		if (a < 5) {
			System.out.println("Seu número digitado é menor que 5 haha");}
		
			if (a > 10) {
				System.out.println("Seu número digitado é maior que 10 haha");}
			
				if (a > 5 && a < 10) {
					System.out.println("Seu número está entre 5 e 10");}
				
					if (a == 5) {
						System.out.println("Seu número é o 5 :O");}
					
						if (a == 10)
							System.out.println("Seu número é o 10 :O");}
					
}

