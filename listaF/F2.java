package listaF;

import java.util.Scanner;

public class F2 {

	public static void main(String[] args) {
		// Algoritimo para ler a idade da criança e explanar a categoria adequada
		Scanner leia = new Scanner(System.in);
		int idade;
		System.out.println("Escreva a idade da crinaça que gostaria de jogar futebol");
		idade = leia.nextInt();
		
		if(idade >= 6 && idade <=8){
			System.out.println("A melhor categoria para essa criança é Dente de Leite");}
		
			else if(idade >= 9 && idade <= 11) {
				System.out.println("A melhor categoria para essa criança é Pré-Mirim");}
		
			else if(idade >= 12 && idade <= 13){
				System.out.println("A melhor categoria para essa criança é Mirim");}
				
			else if (idade >= 14 && idade <= 15){
				System.out.println("A melhor categoria para essa criança é Infantil");}
			
			else if (idade >= 16 && idade <= 17){
				System.out.println("A melhor categoria para essa criança é Juvenil");}
			
			else if (idade >= 18 && idade >= 20){
				System.out.println("A melhor categoria para essa criança é Juniores");}
			else {
			}
			}
}
			
			
	


