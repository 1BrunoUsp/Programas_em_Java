package Vetor;

import javax.swing.JOptionPane;

public class V4 {

	public static void main(String[] args) {
		//
		int vetorA[] = new int [15];
		int vetorB[] = new int [15];
		
		String dobro="";
		
		for(int i=0;i<vetorA.length;i++) {
			vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor do Vetor A: " + (i + 1) +" °"));
			vetorB[i] = vetorA[i]*vetorA[i];
			
			dobro+= "o Quadrado do valor: " + vetorA[i] + " é: " + vetorB[i] + "\n";
			
		}
		JOptionPane.showMessageDialog(null, dobro);
	}

}
