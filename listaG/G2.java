package listaG;

import java.util.Scanner;

public class G2 {

	public static void main(String[] args) {
		// Algorítimo que identifica o cod do departamento e fala para o funcionário
		Scanner leia = new Scanner(System.in);
		int x;
		System.out.println("Escreva o seu código dado pelo seu chefe");
		x = leia.nextInt();
	
		String Cod = "";
		
		switch (x) {
		case 10 : Cod = "Seu departamento é de :Expedição";
			break;
		case 20: Cod = "Seu departamento é de :Recursos Humanos";
			break;
		case 30: Cod = "Seu departamento é de :Logística";
			break;
		case 40: Cod = "Seu departamento é de :Contabilidade";
			break;
		case 50 : Cod = "Seu departamento é de :Departamento Pessoal";
			break;
		case 60 : Cod = "Seu departamento é de :Informática";
			break;
		default: System.out.println("Número inválido");
		return;
		}
		 System.out.println("Número Digitado: " + x + ", Departamento identificado! " + Cod);
		 leia.close();
		
	
	
	}

}
