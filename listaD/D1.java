package listaD;

import java.util.Scanner;

public class D1 {

	public static void main(String[] args) {
		// Algor�timo que informa o maior valor
		
		int a, b;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva um valor (A)");
		a = leia.nextInt();
		System.out.println("Escreva outro valor (B)");
		b = leia.nextInt();
		
		if(a > b) {
		System.out.println("O valor de " + a + " � maior que o de " + b);
		} 

		   if(a < b) {
			System.out.println("O valor de " + b + " � maior que o de " + a);
		} 
		    if(a == b) {
	    	   System.out.println("O valor de (A) e (B) s�o iguais");
		    }
	}
}	


	


