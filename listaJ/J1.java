package listaJ;

import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		//  números  de  1  até  100  em  ordem  crescente  e depois em ordem decrescente.
		Scanner leia = new Scanner(System.in);
		
		int contador, num;
		contador = 0;
		num = 0;
		
		System.out.println("Ordem Crescente");
		while(contador <= 100) {
			System.out.println(num);
			num = (num + 1);
			contador = (contador + 1);
					
		}
		System.out.println("Ordem Decrescente");
		while(contador >= 0) {
			if(contador < 101)
			System.out.println(num);
			num = (num - 1);
			contador = (contador - 1);
			}
		}
	}

		
			
		
		
	

