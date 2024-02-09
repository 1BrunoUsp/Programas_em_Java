package listaI;

import javax.swing.JOptionPane;

public class I3 {

	public static void main(String[] args) {
		//Desenvolva  um  programa  para  apresentar  os  resultados  da  tabuada  do  número  5  no  
		//seguinte layout: “5 x “ N “ = “ 5*N

		
		String Result = "";
		for(int i = 0; i <= 10 ; i++) {
			int n = 5 * i;
			Result += "5 X " + i + " = " + n + "\n";
		}
		JOptionPane.showMessageDialog(null, Result );
		
	}

}
