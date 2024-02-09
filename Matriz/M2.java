package Matriz;

import javax.swing.JOptionPane;

public class M2 {

	public static void main(String[] args) {
		// BRUNO e JENIFER
		int matriz[][] = new int [3][3];
		
		int l;
		int c;
		int somaP;
		int somaS;
		int somaL2;
		int somaC3;
		int multC2;
		int multL3;
		int somaT;
		int multT;
		String tudo = "";
		for(l=0 ; l<=2 ; l++) {
			for(c=0 ; c <= 2; c++) {
				matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor " + (c + 1) +" ° valor da linha"));
			}
		}
		somaP = matriz[0][0] + matriz [1][1] + matriz [2][2];
		somaS = matriz[0][2] + matriz [1][1] + matriz [2][0];
		somaL2 = matriz[1][0] + matriz [1][1] + matriz [1][2];
		somaC3 = matriz[0][2] + matriz [1][2] + matriz [2][2];
		multC2 =  matriz[0][1] * matriz [1][1] * matriz [2][1];
		multL3 = matriz[2][0] * matriz [2][1] * matriz [2][2];
		somaT =  matriz[0][0] + matriz [0][1] + matriz [0][2] +  matriz[1][0] + matriz [1][1] + matriz [1][2] +  matriz[2][0] + matriz [2][1] + matriz [2][2];
		multT =  matriz[0][0] * matriz [0][1] * matriz [0][2] *  matriz[1][0] * matriz [1][1] * matriz [1][2] *  matriz[2][0] * matriz [2][1] * matriz [2][2];
		tudo = "Soma diagonal principal : " + somaP + 
				"\n Soma diagonal secundária : " + somaS + 
				"\n Soma linha 2 : " + somaL2 + 
				"\n Soma coluna 3 : " + somaC3 + 
				"\n Multiplicação coluna 2 : " + multC2 + 
				"\n Multiplicação linha 3 : " + multL3 + 
				"\n Soma total : " + somaT + 
				"\n Multiplicação total : " + multT;
		JOptionPane.showMessageDialog(null, tudo);
	}
	
}
