package listaG;

import java.util.Scanner;

public class G5 {

	public static void main(String[] args) {
		// Algorítimo que auxilia  uma  escolinha  de  futebol  na  classificação  em idade
		Scanner leia = new Scanner(System.in);
		int idade, idade1;
		System.out.println("Escreva a idade da criança que iremos classifica-la à uma escolinha");
		idade = leia.nextInt();
		switch (idade) {
		case 6:
		case 7:
		case 8:
			System.out.println("A melhor categoria é a : Dente de Leite");
			break;
		case 9:
		case 10:
		case 11: 
			System.out.println("A melhor categoria é a : Pré-Mirim");
			break;
		case 12:
		case 13:
			System.out.println("A melhor categoria é a : Mirim");
			break;
		case 14:
		case 15: 
			System.out.println("A melhor categoria é a : Infantil");
			break;
		case 16:
		case 17:
			System.out.println("A melhor categoria é a : Juvenil");
			break;
		case 18:
		case 19:
		case 20:  
			System.out.println("A melhor categoria é a : Juniores");
			break;
		default: 
			System.out.println("Idade não recomendada."); 
		return;
		}
	
	
	
	
	
	
	
	}

}
