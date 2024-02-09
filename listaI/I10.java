package listaI;

import javax.swing.JOptionPane;

public class I10 {

	public static void main(String[] args) {
		// Desenvolva um programa para realizar a leitura de um conjunto de números(Nnúmeros). 
//		Ao final indicar qual é o maior e o menor número deste conjunto.
		
		int maior = Integer.MIN_VALUE; 
		int menor = Integer.MAX_VALUE;
		for(int i = 0; i <= 10; i++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 10 números."));
			if(n < menor){
				menor = n;
			} if( n > maior){
				maior = n;
			}
		}
		JOptionPane.showMessageDialog(null, "O Maior número é: " + maior + "\n O Menor número é: " + menor);
		
		
	}

}
