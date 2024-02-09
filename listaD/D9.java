package listaD;

import java.util.Scanner;

public class D9 {

	public static void main(String[] args) {
		// Algorítmo para reajuste salarial
		
		Scanner leia = new Scanner(System.in);
		double cod, sal, reajS;
		
		System.out.println("Informe o código de reajuste");
		cod = leia.nextInt();
		System.out.println("Informe seu salário atual");
		
		sal = leia.nextInt();
		
		if (cod == 1){
			reajS = sal * 1.05;
			System.out.println("Seu salário antigo: " + sal + " , seu novo salário: " + reajS + " , Sua função: Operador");}
			if (cod == 2) {
				reajS = sal * 1.10;
				System.out.println("Seu salário antigo: " + sal + " , seu novo salário: " + reajS + " , Sua função: Programador");}
				if (cod == 3) {
					reajS = sal * 1.15;
					System.out.println("Seu salário antigo: " + sal + " , seu novo salário: " + reajS + " , Sua função: Analista");}
					if (cod > 3) {
						System.out.println("Código inexistente");}
				
	}		
	}
	


