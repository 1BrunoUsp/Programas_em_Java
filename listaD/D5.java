package listaD;

import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		// Algor�timo que apresenta os n�meros em ordem crescente
		
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de (A)");
		a = leia.nextInt();
		System.out.println("Digite o valor de (B)");
		b = leia.nextInt();
		System.out.println("Digite o valor de (C)");
		c = leia.nextInt();
		
		if (a > b && a > c && b > c){
			System.out.println("Seu valor em ordem Crescente �: " + c + (", ") + b + (", ") + a);}
		
			if (b > a && b > c && c > a) {
				System.out.println("Seu valor em ordem Crescente �: " + a + (", ") + c + (", ") + b);}
			
				if (c > a && c > b && b > a) {
					System.out.println("Seu valor em ordem Crescente �: " + a + (", ") + b + (", ") + c);}
					
						if (c > b && c > a && a > b ) {
							System.out.println("Seu valor em ordem Crescente �: " + b + (", ") + a + (", ") + c);}
					
							if (a == b && b == c) {
								System.out.println("Seu valor repetido �: " + a + (", ") + b + (", ") + c);}
									
									if (a == b && c > a) {
										System.out.println("Seu valor em ordem Crescente com repeti��o �: " + a + (",") + b + (",") + c);}
										
										if (b == c && a < b) {
											System.out.println("Seu valor em ordem Crescente com repeti��o �: " + a + (",") + c + (",") + b);}
										
											if (b == c && a > b) {
												System.out.println("Seu valor em ordem Crescente com repeti��o �: " + b + (",") + c + (",") + a);}
											
												if ( a == c && c > b) {
													System.out.println("Seu valor em ordem Crescente com repeti��o �: " + b + (",") + c + (",") + a);}
												
													if ( a == c && b > a) {
														System.out.println("Seu valor em ordem Crescente com repeti��o �: " + a + (",") + c + (",") + b);}
													
														if ( a == b && b > c) {
															System.out.println("Seu valor em ordem Crescente com repeti��o �: " + c + (",") + a + (",") + b);}
														}
													
												
											
										
						}
						
						
		
	
	





