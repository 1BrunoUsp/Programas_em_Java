package Matriz2;

import javax.swing.JOptionPane;

public class M4 {

	public static void main(String[] args) {
		// Crie uma matriz a(4,4),a seguir crie dois vetores de 4 elementos, um com os valores da diagonal principal e 
		//outro com os valores da diagonal secundária.
		
		int matrizA[][] = new int [4][4];
		int vetor1 [] = new int [4];
		int vetor2 [] = new int [4];
		String matrix = "";
		String vet1 = "";
		String vet2 = "";
		int l, c;
		for(l = 0; l <= 3 ; l++) {
			for(c = 0; c <= 3 ; c++) {
				matrizA[l][c] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (c + 1) + " º valor da linha"));
				matrix += "|" + matrizA[l][c] + "|   ";
			}
			matrix += "\n";
		}
		for(int i = 0; i <= 3 ; i++) {
			vetor1[i] += matrizA[i][i];
			vet1 += vetor1[i];
			vet1 += "   ";
		}
			for(int i = 0 ; i <= 3 ; i++) {
				vetor2[i] += matrizA[i][3 - i];
				vet2 += vetor2[i];
				vet2 += "   ";
			}
			
		
		JOptionPane.showMessageDialog(null, "A matriz formada: \n" + matrix + "\n O valor do vetor1 : " + vet1 + "\n O valor do vetor2 : " + vet2);
		
	}

}
