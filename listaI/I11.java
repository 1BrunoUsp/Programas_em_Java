package listaI;

import javax.swing.JOptionPane;

public class I11 {

	public static void main(String[] args) {
		// Desenvolva um programa para calcular e apresentar o total da soma obtida dos cem primeiros 
//		n�meros inteiros (1+2+3+4+5+6+7+...+96+97+98+99+100).
		
		String lista = "";
		int i;
		int contador = 0;
		for(i = 0;i <= 100; i++) {
			contador += i;
			lista += i + " -- " + contador + "\n" ;
		}
		JOptionPane.showMessageDialog(null, "soma at� 100" + "\n" + lista);
	}

}
