package listaK;

import javax.swing.JOptionPane;

public class K7 {

	public static void main(String[] args) {
//		// Desenvolva um programa para realizar uma elei��o entre dois candidatos ao cargo de
//		presidente da CBF (Confedera��o Brasileira de Futebol). O programa dever� apresentar o nome dos
//		candidatos (Ricardo Teixeira e Paulo Falc�o) para a escolha dos eleitores. Ao final o programa
//		dever� indicar qual ser� o novo presidente da entidade, o total de votos e o percentual de votos de
//		cada candidato. Se ocorrer um empate, o mesmo dever� ser indicado e o programa dever� solicitar
//		um voto de desempate. O programa dever� realizar a pesquisa at� que a entrada de dados seja
//		finalizada atrav�s da vari�vel RESP.
		int opcoes, rica=0,paul=0, contador;
		do {
			String opcoes2[] = {"Ricardo Teixeira", "Paulo Falc�o"};
			opcoes = JOptionPane.showOptionDialog(null, "Quem merece o cargo de presidente da CBF?", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes2, opcoes2[0]);
			if(opcoes == 0) {
				rica++;
			}else {
				paul++;
			}	if(rica == paul){
				JOptionPane.showMessageDialog(null,"OPSS, a vota��o empatou, vote novamente!");
				String opcoes3[] = {"Ricardo Teixeira", "Paulo Falc�o"};
				opcoes = JOptionPane.showOptionDialog(null, "Quem merece o cargo de presidente da CBF?", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes2, opcoes2[0]);	
				if(opcoes==0) {
					rica++;
				}else {
					paul++;
				}
			}
			contador = JOptionPane.showConfirmDialog(null, "Deseja dar mais uma resposta?", "Pergunta", JOptionPane.YES_NO_OPTION);
		} while (contador == 0);
		if(rica>paul) {
			JOptionPane.showMessageDialog(null,"O eleito a presidente da CBF � : Ricardo Teixeira");
		}else {
			JOptionPane.showMessageDialog(null,"O eleito a presidente da CBF � : Paulo Falc�o");
		}
	}

}