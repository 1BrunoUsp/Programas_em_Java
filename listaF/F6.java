package listaF;

import java.util.Scanner;

public class F6 {

	public static void main(String[] args) {
		// Algoritimo que faz um reajuste dos salarios dos funcion�rios
		Scanner leia = new Scanner(System.in);
		double cod, salario, reajuste;
		
		System.out.println("Informe o c�digo dado pelo seu chefe");
		cod = leia.nextInt();
		System.out.println("Informe o quanto est� ganhando atualmente");
		salario = leia.nextInt();
		
		
		if (cod == 1) {
		reajuste = salario * 1.05;
		System.out.println("Seu cargo na empresa: Operador, Seu sal�rio antigo: " + salario + ", Sendo reajustado para: " + reajuste);
		} else if (cod == 2) {
		reajuste = salario * 1.10;
		System.out.println("Seu cargo na empresa: Programador, Seu sal�rio antigo: " + salario + ", Sendo reajustado para: " + reajuste);
		}	else if (cod == 3) {
			reajuste = salario * 1.15;
			System.out.println("Seu cargo na empresa: Analista, Seu sal�rio antigo: " + salario + ", Sendo reajustado para: " + reajuste);
		}		else if (cod == 4) {
				reajuste = salario * 1.20;
				System.out.println("Seu cargo na empresa: Gerente, Seu sal�rio antigo: " + salario + ", Sendo reajustado para: " + reajuste);
		}		
		}
	}

	
