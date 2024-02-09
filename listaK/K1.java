package listaK;

import javax.swing.JOptionPane;

public class K1 {

	public static void main(String[] args) {
		// Desenvolva  um  programa  para  apresentar  os  números  de  1  até  100  em  ordem  crescente  e depois em ordem decrescente.
        int num = 0;
        String ordCres = "";
        String ordDecr = "";

        JOptionPane.showMessageDialog(null, "Ordem Crescente");
        do {
            ordCres += num + "\n";
            num++;
        } while (num <= 100);
        JOptionPane.showMessageDialog(null, ordCres);
        num = 100;
        ordDecr = "";
        JOptionPane.showMessageDialog(null, "Ordem Decrescente");
        do {
            ordDecr += num + "\n";
            num--;
        } while (num >= 0);
        JOptionPane.showMessageDialog(null, ordDecr);
    }
}

