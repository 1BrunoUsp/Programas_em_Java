package listaD;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		// Algor�timo que informa seo valor � igual, maior ou menos que 100
		
		int a;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		a  = leia.nextInt();
		
		if(a > 100){
			
			System.out.println("O n�mero " + a + " � maior que 100");
			
		}
			if(a < 100) {
				
				System.out.println("O n�mero " + a + " � menor que 100");
			}
				if(a == 100) {
				System.out.println("O n�mero informado � igual a 100");
			}
		
	}
}

