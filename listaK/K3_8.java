package listaK;

import javax.swing.JOptionPane;

public class K3_8 {

	public static void main(String[] args) {
		//Desenvolva  um  programa  para  uma  Universidade  realizar  uma  pesquisa  entre  os  alunos  que ingressam  nesta  Universidade.  Para  isso,  o  programa  dever�  solicitar  o  sexo  do  entrevistado  e  o c�digo do curso que deseja realizar.C�digoCurso1Engenharia da Computa��o2Administra��o3Medicina4PsicologiaO programa dever� realizar a pesquisa at� que a entrada de dados seja finalizada atrav�s da vari�vel RESP. Ao final o programa dever� apresentar os seguintes resultados:-O percentual de homens que pretendem cursar Engenharia da Computa��o;-O percentual de mulheres que pretendem cursar Psicologia;-O total de pessoas que pretendem cursar Medicina;-O total de mulheres que pretendem cursar Administra��o.
				int sexo;
				int curso;
				int total = 0;
				int masc = 0;
				int mascEng = 0;
				int femi = 0;
				int femiPsi = 0;
				int med = 0;
				int femiADM = 0;
				float porcentM;
				float porcentF;
				int contador;
				int femi100;
				
				do {
					String opcoes[] = {"masculino", "feminino"};
					sexo = JOptionPane.showOptionDialog(null, "Sexo", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
					String opcoes2[] = {"Engenharia da computa��o", "Administra��o", "Medicina", "Psicologia"};
					curso = JOptionPane.showOptionDialog(null, "Qual seu curso", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes2, opcoes2[0]);
					
					if(sexo == 0 && curso == 0) {
					mascEng++;
					}	if(sexo == 1 && curso == 3) {
						femiPsi++;
					}		if(curso == 2) {
							med++;
					}			if(sexo == 1 && curso == 1) {
								femiADM++;
									if(sexo == 1) {
										femi++;
									}
										if(sexo == 0) {
											masc++;
										}
					}
					total++;
					 contador = JOptionPane.showConfirmDialog(null, "Deseja dar mais uma resposta?", "Pergunta", JOptionPane.YES_NO_OPTION);
				}while(contador == 0);
				porcentM = (mascEng*100)/(total);
				porcentF = (femiPsi*100)/(total);
				femi100 = (femiPsi*100)/ (total);
				JOptionPane.showMessageDialog(null, "Percentual de homens que querem Engenharia da computa��o : " + porcentM + " %" + "\n" + 
				"Percentual de mulherem que querem Psicologia : " + femi100 + " %" + "\n" + 
				"Total de pessoas que querem fazer Medicina : "+med+ "\n"+
				"Total de mulherem que querem Administra��o : " + femiADM  );
			}

		}