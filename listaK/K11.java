package listaK;

import javax.swing.JOptionPane;

public class K11 {

	public static void main(String[] args) {
		// Desenvolva um programa para ler um n�mero e calcular o fatorial deste n�mero.
//		Fatorial: F(4) = 4! = 4*3*2*1 = 24
//				F(0) = 0! = 1
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		int menssagem;
        int fatorial = 1;
        menssagem = n;

        do {
            fatorial *= n;
            n--;
        } while (n > 0);

        JOptionPane.showMessageDialog(null, "O fatorial do n�mero "+"\n" + menssagem + "\n"+ " � : "+"\n" + fatorial);
    }
}