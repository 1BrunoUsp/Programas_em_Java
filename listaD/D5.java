package listaD;

import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		// Algorítimo que apresenta os números em ordem crescente
		
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de (A)");
		a = leia.nextInt();
		System.out.println("Digite o valor de (B)");
		b = leia.nextInt();
		System.out.println("Digite o valor de (C)");
		c = leia.nextInt();
		
		if (a > b && a > c && b > c){
			System.out.println("Seu valor em ordem Crescente é: " + c + (", ") + b + (", ") + a);}
		
			if (b > a && b > c && c > a) {
				System.out.println("Seu valor em ordem Crescente é: " + a + (", ") + c + (", ") + b);}
			
				if (c > a && c > b && b > a) {
					System.out.println("Seu valor em ordem Crescente é: " + a + (", ") + b + (", ") + c);}
					
						if (c > b && c > a && a > b ) {
							System.out.println("Seu valor em ordem Crescente é: " + b + (", ") + a + (", ") + c);}
					
							if (a == b && b == c) {
								System.out.println("Seu valor repetido é: " + a + (", ") + b + (", ") + c);}
									
									if (a == b && c > a) {
										System.out.println("Seu valor em ordem Crescente com repetição é: " + a + (",") + b + (",") + c);}
										
										if (b == c && a < b) {
											System.out.println("Seu valor em ordem Crescente com repetição é: " + a + (",") + c + (",") + b);}
										
											if (b == c && a > b) {
												System.out.println("Seu valor em ordem Crescente com repetição é: " + b + (",") + c + (",") + a);}
											
												if ( a == c && c > b) {
													System.out.println("Seu valor em ordem Crescente com repetição é: " + b + (",") + c + (",") + a);}
												
													if ( a == c && b > a) {
														System.out.println("Seu valor em ordem Crescente com repetição é: " + a + (",") + c + (",") + b);}
													
														if ( a == b && b > c) {
															System.out.println("Seu valor em ordem Crescente com repetição é: " + c + (",") + a + (",") + b);}
														}
													
												
											
										
						}
						
						
		
	
	





