package listaG;

import java.util.Scanner;

public class G2 {

	public static void main(String[] args) {
		// Algor�timo que identifica o cod do departamento e fala para o funcion�rio
		Scanner leia = new Scanner(System.in);
		int x;
		System.out.println("Escreva o seu c�digo dado pelo seu chefe");
		x = leia.nextInt();
	
		String Cod = "";
		
		switch (x) {
		case 10 : Cod = "Seu departamento � de :Expedi��o";
			break;
		case 20: Cod = "Seu departamento � de :Recursos Humanos";
			break;
		case 30: Cod = "Seu departamento � de :Log�stica";
			break;
		case 40: Cod = "Seu departamento � de :Contabilidade";
			break;
		case 50 : Cod = "Seu departamento � de :Departamento Pessoal";
			break;
		case 60 : Cod = "Seu departamento � de :Inform�tica";
			break;
		default: System.out.println("N�mero inv�lido");
		return;
		}
		 System.out.println("N�mero Digitado: " + x + ", Departamento identificado! " + Cod);
		 leia.close();
		
	
	
	}

}
