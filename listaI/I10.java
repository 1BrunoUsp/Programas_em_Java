package listaI;

import javax.swing.JOptionPane;

public class I10 {

	public static void main(String[] args) {
		// Desenvolva um programa para realizar a leitura de um conjunto de n�meros(Nn�meros). 
//		Ao final indicar qual � o maior e o menor n�mero deste conjunto.
		
		int maior = Integer.MIN_VALUE; 
		int menor = Integer.MAX_VALUE;
		for(int i = 0; i <= 10; i++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 10 n�meros."));
			if(n < menor){
				menor = n;
			} if( n > maior){
				maior = n;
			}
		}
		JOptionPane.showMessageDialog(null, "O Maior n�mero �: " + maior + "\n O Menor n�mero �: " + menor);
		
		
	}

}
