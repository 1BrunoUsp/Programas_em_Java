package listaJ;

import java.util.Scanner;

public class J8 {

	public static void main(String[] args) {
		//  O programa dever� apresentar o nome dos candidatos (Fujiro NaKombi e Takaro
		//N�) para a escolha dos eleitores. Ao final o programa dever� indicar qual ser� o novo gerente da
	//empresa, o total de votos e o percentual de votos de cada candidato.
		
		Scanner leia = new Scanner(System.in);
		int n1;
		int fujironakombi = 0;
		int takarone = 0;
		int participantes = 0;
		String RESP = "s";
		while(RESP.equalsIgnoreCase("s")) {
			System.out.println("Vote em 1 dos participantes, sendo o Fujiro NaKombi (1) ou Takaro N� (2)");
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
			System.out.println("A vota��o encerrou! e o novo gerente da empresa �: Fujiro NaKombi com o total de " + fujironakombi + " votos. O Takaro N� ficou com um total de " + takarone + " Votos." );
			System.out.println("Com o percentual de " + (fujironakombi*100)/participantes + "% para Fujiro NaKombi e " + (takarone*100)/participantes + "% para Takaro N�");
		} if (fujironakombi == takarone) {
			System.out.println("A vota��o encerrou! Fujiro Nakombi empatou com Takaro N�, a vota��o deve ser refeita");
		}	else {
				System.out.println("A vota��o encerrou! e o novo gerente da empresa �: Takaro N� com o total de " + takarone + " votos. O Fujiro Nakombi ficou com um total de " + fujironakombi + " Votos.");
				System.out.println("Com o percentual de " + (fujironakombi*100)/participantes + "% para Fujiro NaKombi e " + (takarone*100)/participantes + "% para Takaro N�");
		}
	}

}
