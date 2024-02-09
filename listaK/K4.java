package listaK;

import javax.swing.JOptionPane;

public class K4 {

	public static void main(String[] args) {
		// Desenvolva  um  programa  para  uma  empresa  fazer  um  pesquisa  de  mercado  para  saber  se  as pessoas  gostaram  ou  não  de  um  novo  produto  lançado  no  mercado.  Para  isso,  o  programa  deverá solicitar o sexo do entrevistado e sua resposta (sim ou não). O programa deverá realizar a pesquisa até  que  a  entrada  de  dados  seja  finalizada  através  da  variável  RESP.  Ao  final  o  programa  deverá apresentar os seguintes resultados:-O número de pessoas do sexo feminino que responderam sim;-O número de pessoas do sexo masculino que responderam não;-A porcentagem de pessoas do sexo feminino que responderam não;-A porcentagem de pessoas do sexo masculino que responderam sim;
		
		int resp = 0, gostou, sexo, contGostou = 0, contNGostou = 0, totEntr, contGostFem = 0, contNGostMasc = 0;		
		float pFemG, pMascNG;
		
		do {
			gostou = JOptionPane.showConfirmDialog(null, "Gostou do produto?", "ENTRADA", JOptionPane.YES_NO_OPTION);
			String opcoes[] = {"masculino", "feminino"};
			sexo = JOptionPane.showOptionDialog(null, "Sexo", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			if (gostou == 0) {
				contGostou = (contGostou + 1);
				if (sexo == 1) {
					contGostFem++;
				}
				//System.out.println("entrevistado gostou do produto");
			}else {
				contNGostou++;
				if (sexo == 0) {
					contNGostMasc++;
				}
				//System.out.println("entrevistado não gostou do produto");
			}
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
		}while(resp == 0);
		
		totEntr = (contGostou + contNGostou);
		pFemG = ((contGostFem*100)/totEntr);
		pMascNG = ((contNGostMasc*100)/totEntr);
		JOptionPane.showMessageDialog(null, "Pessoas que gostaram do produto: " + contGostou + 
				"\nPessoas que não gostaram do produto: " + contNGostou + 
				"\nPorcentagem de mulheres que gostaram do produto: " + pFemG + 
				"%\nPorcentagem de homens que não gostaram do produto: " + pMascNG);
	}

}
