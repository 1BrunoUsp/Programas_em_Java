package listaI;

import javax.swing.JOptionPane;

public class I9 {

	public static void main(String[] args) {
		//  Desenvolva  um  programa  para  realizar  uma  pesquisa  de  saga  de  filmes  com  20  pessoas.  
//		O programa  dever�  solicitar  a  op��o  de  melhor  saga  de  filme  para  o  usu�rio.  As  sagas  concorrentes 
//		s�o: Matrix e Senhor dos An�is. Ao final o programa 
//		dever� indicar qual foi � saga vencedora e o total de votos de cada saga. Se ocorrer um empate, o mesmo dever� ser indicado.
		int matrix = 0;
		int aneis = 0;
		int opcoes;
		for(int i = 0; i <= 20; i++) {
			String opcoes2[] = {"Matrix", "Senhor dos An�is"};
			opcoes = JOptionPane.showOptionDialog(null, "Qual Filme Voc� Indicaria Como O Melhor?", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes2, opcoes2[0]);
			if(opcoes == 0) {
				matrix++;
			}else {
				aneis++;
			}	if(matrix == aneis){
				JOptionPane.showMessageDialog(null,"OPSS, a vota��o empatou, vote novamente!");
				String opcoes3[] = {"Matrix", "Senhor dos An�is"};
				opcoes = JOptionPane.showOptionDialog(null, "Qual Filme Voc� Indicaria Como O Melhor?", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes2, opcoes2[0]);	
				if(opcoes==0) {
					matrix++;
				}else {
					aneis++;
				}
			}
		}
		if(matrix>aneis) {
			JOptionPane.showMessageDialog(null,"O vencedor de Filme Recomendado � : Matrix!");
		}else {
			JOptionPane.showMessageDialog(null,"O vencedor de Filme Recomendado � : Senhor dos An�is!");
		}

	}
}
