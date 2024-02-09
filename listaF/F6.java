package listaF;

import java.util.Scanner;

public class F6 {

	public static void main(String[] args) {
		// Algoritimo que faz um reajuste dos salarios dos funcionários
		Scanner leia = new Scanner(System.in);
		double cod, salario, reajuste;
		
		System.out.println("Informe o código dado pelo seu chefe");
		cod = leia.nextInt();
		System.out.println("Informe o quanto está ganhando atualmente");
		salario = leia.nextInt();
		
		
		if (cod == 1) {
		reajuste = salario * 1.05;
		System.out.println("Seu cargo na empresa: Operador, Seu salário antigo: " + salario + ", Sendo reajustado para: " + reajuste);
		} else if (cod == 2) {
		reajuste = salario * 1.10;
		System.out.println("Seu cargo na empresa: Programador, Seu salário antigo: " + salario + ", Sendo reajustado para: " + reajuste);
		}	else if (cod == 3) {
			reajuste = salario * 1.15;
			System.out.println("Seu cargo na empresa: Analista, Seu salário antigo: " + salario + ", Sendo reajustado para: " + reajuste);
		}		else if (cod == 4) {
				reajuste = salario * 1.20;
				System.out.println("Seu cargo na empresa: Gerente, Seu salário antigo: " + salario + ", Sendo reajustado para: " + reajuste);
		}		
		}
	}

	
