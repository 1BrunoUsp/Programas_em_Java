package listaG;

import java.util.Scanner;

public class G5 {

	public static void main(String[] args) {
		// Algor�timo que auxilia  uma  escolinha  de  futebol  na  classifica��o  em idade
		Scanner leia = new Scanner(System.in);
		int idade, idade1;
		System.out.println("Escreva a idade da crian�a que iremos classifica-la � uma escolinha");
		idade = leia.nextInt();
		switch (idade) {
		case 6:
		case 7:
		case 8:
			System.out.println("A melhor categoria � a : Dente de Leite");
			break;
		case 9:
		case 10:
		case 11: 
			System.out.println("A melhor categoria � a : Pr�-Mirim");
			break;
		case 12:
		case 13:
			System.out.println("A melhor categoria � a : Mirim");
			break;
		case 14:
		case 15: 
			System.out.println("A melhor categoria � a : Infantil");
			break;
		case 16:
		case 17:
			System.out.println("A melhor categoria � a : Juvenil");
			break;
		case 18:
		case 19:
		case 20:  
			System.out.println("A melhor categoria � a : Juniores");
			break;
		default: 
			System.out.println("Idade n�o recomendada."); 
		return;
		}
	
	
	
	
	
	
	
	}

}
