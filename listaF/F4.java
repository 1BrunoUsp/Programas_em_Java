package listaF;

import java.util.Scanner;

public class F4 {

	public static void main(String[] args) {
		//Algoritimo que revela se o aluno foi aprovado se baseando na média 5, porém a 1 média é de 7
		Scanner leia = new Scanner(System.in);
		double n1, n2, n3, n4, res, res2;
		
		System.out.println("Digite a nota do primeiro bimestre");
		n1 = leia.nextInt();
		System.out.println("Digite a nota do segundo bimestre");
		n2 = leia.nextInt();
		System.out.println("Digite a nota do terceiro bimestre");
		n3 = leia.nextInt();
		System.out.println("Digite a nota do quarto bimestre");
		n4 = leia.nextInt();
		
		res = (n1 + n2 + n3 + n4)/4;
		res2 = (n1 + n2 + n3 + n4 + res)/5;
		
		if(res >= 7 ) {
			System.out.println("Parabens pelo seu esforço, você foi aprovado! tendo uma média de: " + res + "(Nota Final)");
		}
			else if (res2 >= 5) {
				System.out.println("A sua média do bimestre não foi suficiente para passar direto, por isso vamos somar suas notas + a média para encontrar uma nóva média");
				System.out.println("Você conseguiu passar de ano tendo uma média final de " + res);
			}
				else if(res2 <= 5) {
					System.out.println("A sua média do bimestre não foi suficiente para passar direto, por isso vamos somar suas notas + a média para encontrar uma nóva média");
					System.out.println("Infelizmente você foi reprovado :(, tente novamente no próximo ano! sua Nota Final foi de " + res2);	
				}
		leia.close();
	}
	}
