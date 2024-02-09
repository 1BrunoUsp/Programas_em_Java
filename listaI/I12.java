package listaI;

import javax.swing.JOptionPane;

public class I12 {

	public static void main(String[] args) {
		// Desenvolva  um  programa  para  apresentar  todos  os  valores  numéricos  inteiros  
//		ímpares situados na faixa de 0 à 50. Para verificar se o número é impar, efetuar dentro do laço a 
//		verificação lógica desta condição com a instrução if, perguntando se o número é impar. Sendo, mostre-o.
		
		String lista = "";
		for(int i = 0; i <= 50; i++) {
			if(i % 2 == 1) {
				lista += i + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, "Esses números são ímpares \n" + lista);
		
	}

}
