package listaK;

import javax.swing.JOptionPane;

public class K2 {

	public static void main(String[] args) {
		// Desenvolva  um  programa  para  uma  empresa  fazer  um  pesquisa  de  mercado  para  saber  se  as pessoas  gostaram  ou  n�o  de  um  novo  produto  lan�ado  no  mercado.  Para  isso,  o  programa  dever� solicitar o sexo do entrevistado e sua resposta (sim ou n�o). O programa dever� realizar a pesquisa at�  que  a  entrada  de  dados  seja  finalizada  atrav�s  da  vari�vel  RESP.  Ao  final  o  programa  dever� apresentar os seguintes resultados:-O total de pessoas que responderam sim;-O total de pessoas que foram entrevistadas;-A porcentagem de pessoas do sexo feminino que responderam n�o;-A porcentagem de pessoas do sexo masculino que responderam sim.
		int total = 0;
		int feminao = 0;
		int mascsim = 0;
		int masc = 0;
		int femi = 0;
		int sim = 0;
		int porcentf;
		int porcentm;
		int contador;
		do {
			String opcoes[] = {"Masculino", "Feminino"};
			int sexo = JOptionPane.showOptionDialog(null, "Qual seu sexo?", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			int gostou = JOptionPane.showConfirmDialog(null, "Gostou do produto?", "????", JOptionPane.YES_NO_OPTION);
			if (sexo == 0 && gostou == 0) {
				mascsim++; 
				} if (sexo == 1 && gostou == 1) {
					feminao++;
				}  if(gostou == 0) {
					sim++;
				}   if (sexo == 1) {
					femi++;
				}    if(sexo == 0) {
					masc++;
				}
				total++;
			 contador = JOptionPane.showConfirmDialog(null, "Deseja dar mais uma resposta?", "Pergunta", JOptionPane.YES_NO_OPTION);
				
			}while(contador == 0);
		porcentf = (feminao*100)/total;
		porcentm = (mascsim*100)/total;
		JOptionPane.showMessageDialog(null, "Total de pessoas que responderam SIM : "+sim +"\n"+"Total de pessoas que foram entrevistados : "+total+"\n"+ "Porcentagem de mulheres que responderam n�o :" +porcentf+"  %" + "\n" + "Porcentagem de homens que responderam sim : "+porcentm+ "  %");
		
		
			
		
	}

}
