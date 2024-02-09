package Vetor;

import javax.swing.JOptionPane;

public class V3 {

	public static void main(String[] args) {
		// 
		double vetorA[] = new double [10];
		double vetorB[] = new double [10];
		
		int parA = 0;
		int imparA = 0;
		int parB = 0;
		int imparB = 0;
		
		for(int i=0; i<vetorB.length ;i++) {
			vetorA[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Vetor A: " + (i + 1) +" °"));
			vetorB[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Vetor B: " + (i + 1) +" °"));
			if(vetorA[i] % 2 == 0 ) {
				parA++;
			}else {
				imparA++;
			}if(vetorB[i] % 2 == 0 ) {
				parB++;
			}else {
				imparB++;
			}
		}
		JOptionPane.showMessageDialog(null, "Quantidade de números PARES no vetor A: " + parA + 
				"\n Quantidade de números IMPARES no vetor A: " + imparA + 
				"\n Quantidade de números PARES no vetor B: " + parB + 
				"\n Quantidade de números IMPARES no vetor B: " + imparB);
	}

}
