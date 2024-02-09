package Vetor;

import javax.swing.JOptionPane;

public class V2 {

	public static void main(String[] args) {
		//
		double vetorA[] = new double [15];
		double vetorB[] = new double [15];
		double vetorC[] = new double [15];
		double vetorD[] = new double [15];
		
		String soma="";
		String mult="";
		for (int i=0; i < vetorC.length; i++) {
			vetorA[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Vetor A: " + (i + 1) +" °"));
			vetorB[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Vetor B: " + (i + 1) +" °"));
			
			vetorC[i] = vetorA[i] - vetorB[i];
			vetorD[i] = vetorA[i] * vetorB[i];
			soma += "a subtração do vetor A: " + vetorA[i] + " com o vetor B: " + vetorB[i] + " é igual a: " + vetorC[i] + "\n";
			mult += "a multiplicação do vetor A: " + vetorA[i] + " com o vetor B: " + vetorB[i] + " é igual a: " + vetorD[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, soma);
		JOptionPane.showMessageDialog(null, mult);

	}



	}


