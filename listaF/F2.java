package listaF;

import java.util.Scanner;

public class F2 {

	public static void main(String[] args) {
		// Algoritimo para ler a idade da crian�a e explanar a categoria adequada
		Scanner leia = new Scanner(System.in);
		int idade;
		System.out.println("Escreva a idade da crina�a que gostaria de jogar futebol");
		idade = leia.nextInt();
		
		if(idade >= 6 && idade <=8){
			System.out.println("A melhor categoria para essa crian�a � Dente de Leite");}
		
			else if(idade >= 9 && idade <= 11) {
				System.out.println("A melhor categoria para essa crian�a � Pr�-Mirim");}
		
			else if(idade >= 12 && idade <= 13){
				System.out.println("A melhor categoria para essa crian�a � Mirim");}
				
			else if (idade >= 14 && idade <= 15){
				System.out.println("A melhor categoria para essa crian�a � Infantil");}
			
			else if (idade >= 16 && idade <= 17){
				System.out.println("A melhor categoria para essa crian�a � Juvenil");}
			
			else if (idade >= 18 && idade >= 20){
				System.out.println("A melhor categoria para essa crian�a � Juniores");}
			else {
			}
			}
}
			
			
	


