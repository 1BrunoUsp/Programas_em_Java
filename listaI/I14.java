package listaI;

import javax.swing.JOptionPane;

public class I14 {

	public static void main(String[] args) {
		//Desenvolva um programa para ler um número e calcular o fatorial deste número.Fatorial: 
//		F(4) = 4! = 4*3*2*1 = 24F(0) = 0! = 1
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        int fatorial = 1;
		for(int i = n ; i >= 1; i--) {
			fatorial *= i;
		}
		JOptionPane.showMessageDialog(null, "O fatorial do número "+"\n" + n + "\n"+ " é : "+"\n" + fatorial);
		
		
	}

}
