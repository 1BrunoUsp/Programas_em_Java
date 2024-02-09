package listaI;

import javax.swing.JOptionPane;

public class I8 {

	public static void main(String[] args) {
		//  Desenvolva  um  programa  para  calcular  o  reajuste  salarial  de  todos  os  
//		funcionários  de  um empresa.  O  programa  deverá  solicitar  a  leitura  da  quantidade  de  funcionários,  
//		além  do  código  e  o salário atual de cada funcionário e realizar o reajuste salarial de cada funcionário de 
//		acordo com a tabela  abaixo.  O  programa  deverá  apresentar  os  
//		seguintes  valores  para  cada  funcionário:  salário antigo, salário novo e reajuste.CódigoPercentual 5% 15% 25% 30% 
		double sal = 0;
		double sal3 = 0;
		double sal2 = 0;
		double i = Double.parseDouble(JOptionPane.showInputDialog("Escreva a quantidade de Funcionários: "));
		for(int F = 0; F < i; F++) {
			int cod = Integer.parseInt(JOptionPane.showInputDialog("Escreva o código dado pelo seu chefe. "));
			sal = Double.parseDouble(JOptionPane.showInputDialog("Escreva o seu salário atual: "));
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
					JOptionPane.showMessageDialog(null, "Código não identificado no sistema.");
			}
		}
				sal3 = sal + sal2;
		JOptionPane.showMessageDialog(null, "Seu salário Antigo: R$" + sal + "  \n Seu salário Reajustado: R$" + sal2 + "\n Seu salário atual: R$" + sal3);
		
	}

}
