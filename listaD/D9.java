package listaD;

import java.util.Scanner;

public class D9 {

	public static void main(String[] args) {
		// Algor�tmo para reajuste salarial
		
		Scanner leia = new Scanner(System.in);
		double cod, sal, reajS;
		
		System.out.println("Informe o c�digo de reajuste");
		cod = leia.nextInt();
		System.out.println("Informe seu sal�rio atual");
		
		sal = leia.nextInt();
		
		if (cod == 1){
			reajS = sal * 1.05;
			System.out.println("Seu sal�rio antigo: " + sal + " , seu novo sal�rio: " + reajS + " , Sua fun��o: Operador");}
			if (cod == 2) {
				reajS = sal * 1.10;
				System.out.println("Seu sal�rio antigo: " + sal + " , seu novo sal�rio: " + reajS + " , Sua fun��o: Programador");}
				if (cod == 3) {
					reajS = sal * 1.15;
					System.out.println("Seu sal�rio antigo: " + sal + " , seu novo sal�rio: " + reajS + " , Sua fun��o: Analista");}
					if (cod > 3) {
						System.out.println("C�digo inexistente");}
				
	}		
	}
	


