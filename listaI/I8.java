package listaI;

import javax.swing.JOptionPane;

public class I8 {

	public static void main(String[] args) {
		//  Desenvolva  um  programa  para  calcular  o  reajuste  salarial  de  todos  os  
//		funcion�rios  de  um empresa.  O  programa  dever�  solicitar  a  leitura  da  quantidade  de  funcion�rios,  
//		al�m  do  c�digo  e  o sal�rio atual de cada funcion�rio e realizar o reajuste salarial de cada funcion�rio de 
//		acordo com a tabela  abaixo.  O  programa  dever�  apresentar  os  
//		seguintes  valores  para  cada  funcion�rio:  sal�rio antigo, sal�rio novo e reajuste.C�digoPercentual 5% 15% 25% 30% 
		double sal = 0;
		double sal3 = 0;
		double sal2 = 0;
		double i = Double.parseDouble(JOptionPane.showInputDialog("Escreva a quantidade de Funcion�rios: "));
		for(int F = 0; F < i; F++) {
			int cod = Integer.parseInt(JOptionPane.showInputDialog("Escreva o c�digo dado pelo seu chefe. "));
			sal = Double.parseDouble(JOptionPane.showInputDialog("Escreva o seu sal�rio atual: "));
			switch (cod) {
			case 1 :
				sal2 = sal * 1.05;
				break;
			case 2 :
				sal2 = sal * 1.15;
				break;
			case 3 :
				sal2 = sal * 1.25;
				break;
			case 4 :
				sal2 = sal * 1.30;
				break;
				default:
					JOptionPane.showMessageDialog(null, "C�digo n�o identificado no sistema.");
			}
		}
				sal3 = sal + sal2;
		JOptionPane.showMessageDialog(null, "Seu sal�rio Antigo: R$" + sal + "  \n Seu sal�rio Reajustado: R$" + sal2 + "\n Seu sal�rio atual: R$" + sal3);
		
	}

}
