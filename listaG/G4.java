package listaG;

import java.util.Scanner;

public class G4 {

	public static void main(String[] args) {
		//Algor�timo de reajuste salarial com base em c�digo digitado + fun��o
		Scanner leia = new Scanner(System.in);
		double salario, salario_novo, x, reajuste = 0;
		
		System.out.println("Digite o seu sal�rio atual, iremos fazer o reajuste");
		salario = leia.nextInt();
		
		System.out.println("Digite o c�digo dado pelo chefe");
		String x1 = leia.next();
				
		
		
		switch (x1) {
		case "1" : reajuste = salario*0.05; System.out.println("Fun��o: Operado");
			break;
		case "2": reajuste = salario*0.10; System.out.println("Fun��o: Programador");
			break;
		case "3": reajuste = salario*0.15; System.out.println("Fun��o: Analista");
			break;
		case "4": reajuste = salario*0.25; System.out.println("Fun��o: Gerente");
			break;
		default: System.out.println("C�digo inv�lido");
		return;
		
		}
		salario_novo = reajuste+salario;
		 System.out.println("O c�digo informado foi: " + x1 + ", Seu sal�rio era de: " + salario + ", foi Reajustado em: " + reajuste + " Reais, seu sal�rio novo �: " + salario_novo);
		 leia.close();
		
	
	
	}

}
