package listaJ;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		// ler  um  n�mero  e  escrever  todos  os  n�meros  de  0  at�  este n�mero, indicando se cada um � par ou �mpar.
		Scanner leia = new Scanner(System.in);
		int n1, contador;
		String pm;
		
		contador = 0;
		System.out.println("Escreva 1 n�mero qualquer");
		n1 = leia.nextInt();	
		
		
			while(n1 >= 0) {
				if(n1 % 2 == 0) {
					pm = "par";
				} else {
					pm = "�mpar";
				}
				
				System.out.println(n1 + " Esse n�mero �: " + pm);
				n1 = (n1 - 1);
			}
			
			
		}
		
}
