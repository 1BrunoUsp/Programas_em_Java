package listaK;

import javax.swing.JOptionPane;

public class K11 {

	public static void main(String[] args) {
		// Desenvolva um programa para ler um número e calcular o fatorial deste número.
//		Fatorial: F(4) = 4! = 4*3*2*1 = 24
//				F(0) = 0! = 1
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		int menssagem;
        int fatorial = 1;
        menssagem = n;

        do {
            fatorial *= n;
            n--;
        } while (n > 0);

        JOptionPane.showMessageDialog(null, "O fatorial do número "+"\n" + menssagem + "\n"+ " é : "+"\n" + fatorial);
    }
}