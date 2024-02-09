package listaI;

import javax.swing.JOptionPane;

public class I9 {

	public static void main(String[] args) {
		//  Desenvolva  um  programa  para  realizar  uma  pesquisa  de  saga  de  filmes  com  20  pessoas.  
//		O programa  deverá  solicitar  a  opção  de  melhor  saga  de  filme  para  o  usuário.  As  sagas  concorrentes 
//		são: Matrix e Senhor dos Anéis. Ao final o programa 
//		deverá indicar qual foi à saga vencedora e o total de votos de cada saga. Se ocorrer um empate, o mesmo deverá ser indicado.
		int matrix = 0;
		int aneis = 0;
		int opcoes;
		for(int i = 0; i <= 20; i++) {
			String opcoes2[] = {"Matrix", "Senhor dos Anéis"};
			opcoes = JOptionPane.showOptionDialog(null, "Qual Filme Você Indicaria Como O Melhor?", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes2, opcoes2[0]);
			if(opcoes == 0) {
				matrix++;
			}else {
				aneis++;
			}	if(matrix == aneis){
				JOptionPane.showMessageDialog(null,"OPSS, a votação empatou, vote novamente!");
				String opcoes3[] = {"Matrix", "Senhor dos Anéis"};
				opcoes = JOptionPane.showOptionDialog(null, "Qual Filme Você Indicaria Como O Melhor?", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes2, opcoes2[0]);	
				if(opcoes==0) {
					matrix++;
				}else {
					aneis++;
				}
			}
		}
		if(matrix>aneis) {
			JOptionPane.showMessageDialog(null,"O vencedor de Filme Recomendado é : Matrix!");
		}else {
			JOptionPane.showMessageDialog(null,"O vencedor de Filme Recomendado é : Senhor dos Anéis!");
		}

	}
}
