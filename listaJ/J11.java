package listaJ;

import java.util.Scanner;

public class J11 {

	public static void main(String[] args) {
		// Desenvolva um programa para ler um n�mero e calcular o fatorial deste n�mero.
		Scanner leia = new Scanner(System.in);
		int n1;
		int fatorial = 1;
		fatorial = 1;
		int contador;
			System.out.println("digite um n�mero");
			n1 = leia.nextInt();	
			contador = n1;
			while(contador > 0) {
				fatorial *= contador;
				contador--;
			}
				if( n1 >= 0) {
					  System.out.println("O fatorial de " + n1 + " �: " + fatorial);
				}	else {
						System.out.println("N�mero inv�lido");
				}
					
		
	}

}
