package listaG;

import java.util.Scanner;

public class G3 {

	public static void main(String[] args) {
		// Algor�timo de reajuste salarial com base em c�digo digitado
		Scanner leia = new Scanner(System.in);
		double salario, reajuste = 0, salario_novo, x;
		System.out.println("Digite o seu sal�rio atual, iremos fazer o reajuste");
		salario = leia.nextInt();
		
		System.out.println("Digite o c�digo dado pelo chefe");
		String x1 = leia.next();
				
		
		
		switch (x1) {
		case "5" : reajuste = salario*0.05;
			break;
		case "15": reajuste = salario*0.10;
			break;
		case "20": reajuste = salario*0.15;
			break;
		case "25": reajuste = salario*0.20;
			break;
		case "30" : reajuste = salario*0.25;
			break;
		case "35" : reajuste = salario*0.30;
			break;
		default:  System.out.println("C�digo inv�lido");
		return;
		}
		salario_novo = reajuste+salario;
		 System.out.println("O c�digo informado foi: " + x1 + ", Seu sal�rio era de: " + salario + ", Reajustado foi de: " + reajuste + ", seu sal�rio novo �: " + salario_novo);
		 leia.close();
		
	
	
	}

}
