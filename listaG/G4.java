package listaG;

import java.util.Scanner;

public class G4 {

	public static void main(String[] args) {
		//Algorítimo de reajuste salarial com base em código digitado + função
		Scanner leia = new Scanner(System.in);
		double salario, salario_novo, x, reajuste = 0;
		
		System.out.println("Digite o seu salário atual, iremos fazer o reajuste");
		salario = leia.nextInt();
		
		System.out.println("Digite o código dado pelo chefe");
		String x1 = leia.next();
				
		
		
		switch (x1) {
		case "1" : reajuste = salario*0.05; System.out.println("Função: Operado");
			break;
		case "2": reajuste = salario*0.10; System.out.println("Função: Programador");
			break;
		case "3": reajuste = salario*0.15; System.out.println("Função: Analista");
			break;
		case "4": reajuste = salario*0.25; System.out.println("Função: Gerente");
			break;
		default: System.out.println("Código inválido");
		return;
		
		}
		salario_novo = reajuste+salario;
		 System.out.println("O código informado foi: " + x1 + ", Seu salário era de: " + salario + ", foi Reajustado em: " + reajuste + " Reais, seu salário novo é: " + salario_novo);
		 leia.close();
		
	
	
	}

}
