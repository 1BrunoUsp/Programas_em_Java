package listaF;

import java.util.Scanner;

public class F8 {

	public static void main(String[] args) {
		// Algorítimo ques escala 3 números em ordem crescente
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
		
			else if (b > a && b > c && c > a) {
				System.out.println("Seu valor em ordem Crescente é: " + a + (", ") + c + (", ") + b);}
			
				else if (c > a && c > b && b > a) {
					System.out.println("Seu valor em ordem Crescente é: " + a + (", ") + b + (", ") + c);}
					
					else if (c > b && c > a && a > b ) {
							System.out.println("Seu valor em ordem Crescente é: " + b + (", ") + a + (", ") + c);}
					
						else if (a == b && b == c) {
								System.out.println("Seu valor repetido é: " + a + (", ") + b + (", ") + c);}
									
							else if (a == b && c > a) {
										System.out.println("Seu valor em ordem Crescente é: " + a + (",") + b + (",") + c);}
										
								else if (b == c && a < b) {
											System.out.println("Seu valor em ordem Crescente é: " + a + (",") + c + (",") + b);}
										
									else if (b == c && a > b) {
												System.out.println("Seu valor em ordem Crescente  é: " + b + (",") + c + (",") + a);}
											
										else if ( a == c && c > b) {
													System.out.println("Seu valor em ordem Crescente  é: " + b + (",") + c + (",") + a);}
												
											else if ( a == c && b > a) {
														System.out.println("Seu valor em ordem Crescente é: " + a + (",") + c + (",") + b);}
													
												else if ( a == b && b > c) {
															System.out.println("Seu valor em ordem Crescente é: " + c + (",") + a + (",") + b);}
														}
													
												
											
										
						}