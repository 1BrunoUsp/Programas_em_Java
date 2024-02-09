package listaI;

import javax.swing.JOptionPane;

public class I1 {

	public static void main(String[] args) {
		// Desenvolva um programa para apresentar os números de 1 até 100 em ordem crescente e depois em ordem decrescente.
			String C = "";
			String D = "";
		JOptionPane.showMessageDialog(null, "Ordem Crescente");
		for(int i = 0; i < 100; i++) {
			C += i + 1 + "\n";	
		}
		JOptionPane.showMessageDialog(null, C);
		JOptionPane.showMessageDialog(null, "Ordem Decrescente");
		for(int i = 101; i > 0; i--) {
			D += i - 1 + "\n";
		}
		JOptionPane.showMessageDialog(null, D);
	}

}
