package listaK;

import javax.swing.JOptionPane;

public class K9 {

	public static void main(String[] args) {
//		// Desenvolva um programa para realizar uma pesquisa de mercado sobre os automóveis
//		importados: FERRARI, PORSH e MERCEDES. O programa deverá receber o voto de cada
//		entrevistado e ao final deverá apresentar a colocação, o total de votos e o percentual de votos de
//		cada automóvel. Os possíveis empates também deverão ser verificados. O programa deverá realizar
//		a pesquisa até que a entrada de dados seja finalizada através da variável RESP.
		int mercedes = 0, ferrari = 0, porsh = 0, RESP, carro, total=0;
		
		do {
			String opcoes2[] = {"Ferrari", "Porsh", "Mercedes"};
			carro = JOptionPane.showOptionDialog(null, "Quem merece o cargo de presidente da CBF?", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes2, opcoes2[0]);
			switch (carro) {
			case 0:
				ferrari++;
				break;
			case 1:
				porsh++;
				break;
			default:
				mercedes++;
				break;
			}
			if(ferrari == porsh && porsh == mercedes) {
				JOptionPane.showMessageDialog(null,"OPSS, a votação empatou, vote novamente!");
				String opcoes3[] = {"Ferrari", "Porsh", "Mercedes"};
				carro = JOptionPane.showOptionDialog(null, "Quem merece o cargo de presidente da CBF?", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes2, opcoes2[0]);
			switch (carro) {
			case 0:
				ferrari++;
				break;
			case 1:
				porsh++;
				break;
			default:
				mercedes++;
				break;
				}
			}
			total++;
				
			RESP = JOptionPane.showConfirmDialog(null, "Deseja dar mais uma resposta?", "Pergunta", JOptionPane.YES_NO_OPTION);
		} while (RESP == 0);
		JOptionPane.showMessageDialog(null,"A votação encerrou, A Ferrari ficou com : "+ferrari+" "
				+ "votos e com um percentual de : "+(ferrari*100)/total+" %, \na Porsh ficou com : "+porsh+" "
						+ "votos e com um percentual de : "+(porsh*100)/total+" %, \na Mercedes ficou com : "+mercedes+" "
								+ "votos e com um percentual de : "+(mercedes*100)/total+" %");
	}

}
