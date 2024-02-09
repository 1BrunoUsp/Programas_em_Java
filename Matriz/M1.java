package Matriz;

import javax.swing.JOptionPane;

public class M1 {

	public static void main(String[] args) {
		// BRUNO e JENIFER
		
		int vetor[] = new int [100];
		String sequencia = "";
			for(int i=0 ; i<100 ; i++) {
				vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor " + (i + 1) +" ° valor do Vetor"));
			}
			for(int i = 99 ; i>=0; i--) {
				sequencia += vetor[i] + "\n";
			}
			JOptionPane.showMessageDialog(null, sequencia);
		
		

	}

}
