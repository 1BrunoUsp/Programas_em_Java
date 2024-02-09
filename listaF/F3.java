package listaF;

import java.util.Scanner;

public class F3 {

	public static void main(String[] args) {
		// Algoritimo que revela se o aluno foi aprovado se baseando na m�dia 5
		Scanner leia = new Scanner(System.in);
		double n1, n2, n3, n4, res;
		
		System.out.println("Digite a nota do primeiro bimestre");
		n1 = leia.nextInt();
		System.out.println("Digite a nota do segundo bimestre");
		n2 = leia.nextInt();
		System.out.println("Digite a nota do terceiro bimestre");
		n3 = leia.nextInt();
		System.out.println("Digite a nota do quarto bimestre");
		n4 = leia.nextInt();
		
		res = (n1 + n2 + n3 + n4)/4;
		
		if(res >= 5 ) {
			System.out.println("Parabens pelo seu esfor�o, voc� foi aprovado! tendo uma m�dia de: " + res + "(Nota Final)");
		} else if (res < 5) {
			System.out.println("Infelizmente voc� foi reprovado :(, tente novamente no pr�ximo ano! sua Nota Final foi de " + res) ;
		}
				
		
		leia.close();
	}

}
