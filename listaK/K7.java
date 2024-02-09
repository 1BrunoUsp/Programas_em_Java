package listaK;

import javax.swing.JOptionPane;

public class K7 {

	public static void main(String[] args) {
//		// Desenvolva um programa para realizar uma eleição entre dois candidatos ao cargo de
//		presidente da CBF (Confederação Brasileira de Futebol). O programa deverá apresentar o nome dos
//		candidatos (Ricardo Teixeira e Paulo Falcão) para a escolha dos eleitores. Ao final o programa
//		deverá indicar qual será o novo presidente da entidade, o total de votos e o percentual de votos de
//		cada candidato. Se ocorrer um empate, o mesmo deverá ser indicado e o programa deverá solicitar
//		um voto de desempate. O programa deverá realizar a pesquisa até que a entrada de dados seja
//		finalizada através da variável RESP.
		int opcoes, rica=0,paul=0, contador;
		do {
			String opcoes2[] = {"Ricardo Teixeira", "Paulo Falcão"};
			opcoes = JOptionPane.showOptionDialog(null, "Quem merece o cargo de presidente da CBF?", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes2, opcoes2[0]);
			if(opcoes == 0) {
				rica++;
			}else {
				paul++;
			}	if(rica == paul){
				JOptionPane.showMessageDialog(null,"OPSS, a votação empatou, vote novamente!");
				String opcoes3[] = {"Ricardo Teixeira", "Paulo Falcão"};
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
			JOptionPane.showMessageDialog(null,"O eleito a presidente da CBF é : Ricardo Teixeira");
		}else {
			JOptionPane.showMessageDialog(null,"O eleito a presidente da CBF é : Paulo Falcão");
		}
	}

}