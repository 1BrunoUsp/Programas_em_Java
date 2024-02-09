package listaJ;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		// ler  um  número  e  escrever  todos  os  números  de  0  até  este número, indicando se cada um é par ou ímpar.
		Scanner leia = new Scanner(System.in);
		int n1, contador;
		String pm;
		
		contador = 0;
		System.out.println("Escreva 1 número qualquer");
		n1 = leia.nextInt();	
		
		
			while(n1 >= 0) {
				if(n1 % 2 == 0) {
					pm = "par";
				} else {
					pm = "ímpar";
				}
				
				System.out.println(n1 + " Esse número é: " + pm);
				n1 = (n1 - 1);
			}
			
			
		}
		
}
