package listaI;

import javax.swing.JOptionPane;

public class I12 {

	public static void main(String[] args) {
		// Desenvolva  um  programa  para  apresentar  todos  os  valores  num�ricos  inteiros  
//		�mpares situados na faixa de 0 � 50. Para verificar se o n�mero � impar, efetuar dentro do la�o a 
//		verifica��o l�gica desta condi��o com a instru��o if, perguntando se o n�mero � impar. Sendo, mostre-o.
		
		String lista = "";
		for(int i = 0; i <= 50; i++) {
			if(i % 2 == 1) {
				lista += i + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, "Esses n�meros s�o �mpares \n" + lista);
		
	}

}
