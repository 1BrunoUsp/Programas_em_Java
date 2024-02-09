package listaJ;

import java.util.Scanner;

public class J8 {

	public static void main(String[] args) {
		//  O programa deverá apresentar o nome dos candidatos (Fujiro NaKombi e Takaro
		//Né) para a escolha dos eleitores. Ao final o programa deverá indicar qual será o novo gerente da
	//empresa, o total de votos e o percentual de votos de cada candidato.
		
		Scanner leia = new Scanner(System.in);
		int n1;
		int fujironakombi = 0;
		int takarone = 0;
		int participantes = 0;
		String RESP = "s";
		while(RESP.equalsIgnoreCase("s")) {
			System.out.println("Vote em 1 dos participantes, sendo o Fujiro NaKombi (1) ou Takaro Né (2)");
			n1 = leia.nextInt();
			if (n1 == 1) {
				fujironakombi++;
			} else {
				takarone++;
			}
			participantes++;
			System.out.println("Deseja adicionar um novo voto ? (S/N)");
			RESP= leia.next();
		}
		if (fujironakombi > takarone ){
			System.out.println("A votação encerrou! e o novo gerente da empresa é: Fujiro NaKombi com o total de " + fujironakombi + " votos. O Takaro Né ficou com um total de " + takarone + " Votos." );
			System.out.println("Com o percentual de " + (fujironakombi*100)/participantes + "% para Fujiro NaKombi e " + (takarone*100)/participantes + "% para Takaro Né");
		} if (fujironakombi == takarone) {
			System.out.println("A votação encerrou! Fujiro Nakombi empatou com Takaro Né, a votação deve ser refeita");
		}	else {
				System.out.println("A votação encerrou! e o novo gerente da empresa é: Takaro Né com o total de " + takarone + " votos. O Fujiro Nakombi ficou com um total de " + fujironakombi + " Votos.");
				System.out.println("Com o percentual de " + (fujironakombi*100)/participantes + "% para Fujiro NaKombi e " + (takarone*100)/participantes + "% para Takaro Né");
		}
	}

}
