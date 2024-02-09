package listaD;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		// Algorítimo que informa seo valor é igual, maior ou menos que 100
		
		int a;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número");
		a  = leia.nextInt();
		
		if(a > 100){
			
			System.out.println("O número " + a + " é maior que 100");
			
		}
			if(a < 100) {
				
				System.out.println("O número " + a + " é menor que 100");
			}
				if(a == 100) {
				System.out.println("O número informado é igual a 100");
			}
		
	}
}

