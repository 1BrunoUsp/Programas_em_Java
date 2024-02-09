package listaI;

import javax.swing.JOptionPane;

public class I15 {

	public static void main(String[] args) {
		// Desenvolva  um  programa  para  calcular  a  potência  de  um  número  por  uma  base  qualquer.  
//		O programa deverá realizar a leitura da base e do expoente.
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base: "));
        int expoente = Integer.parseInt(JOptionPane.showInputDialog("Informe o expoente: "));
        
        int resultado = 1;
        
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        
        JOptionPane.showMessageDialog(null, base + " elevado a " + expoente + " é igual a: " + resultado);
    }
}