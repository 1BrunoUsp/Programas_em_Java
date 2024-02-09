package listaI;

import javax.swing.JOptionPane;

public class I2 {

	public static void main(String[] args) {
		// Desenvolva um programa para apresentar as letras de “a” até “z” em ordem crescente e depois em ordem decrescente.
		String C = "";
		String D = "";
		JOptionPane.showMessageDialog(null, "Alfabeto Crescente");
		for(char letra = 'a'; letra <= 'z'; letra++ ) {
			C += letra + "\n";
		}
		JOptionPane.showMessageDialog(null, C);
		JOptionPane.showMessageDialog(null, "Alfabeto Decrescente");
		for(char letra = 'z'; letra >= 'a'; letra-- ) {
			D += letra + "\n";
		}
		JOptionPane.showMessageDialog(null, D);
	}

}
