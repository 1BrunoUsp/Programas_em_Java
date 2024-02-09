package Matriz2;

import javax.swing.JOptionPane;

public class M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int [5][6];
		
		int l;
		int c;
		int par = 0;
		double matrixPar = 0;
		double media = 0;
		String matrix = "";
		for(l = 0; l <= 4; l++) {
			for(c = 0 ; c <= 5; c++) {
				matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor " + (c + 1) +" ° valor da linha"));
				matrix += "|" + matriz[l][c] + "|    ";
				if(matriz[l][c] % 2 == 0) {
					par++;
					matrixPar += matriz[l][c];
					media = matrixPar/par;
				}
			}
			matrix += "\n";
		}
		JOptionPane.showMessageDialog(null, "Matriz: \n" + matrix + "Média dos pares: " + media);
	}

}
