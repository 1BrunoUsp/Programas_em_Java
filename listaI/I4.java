package listaI;

import javax.swing.JOptionPane;

public class I4 {

	public static void main(String[] args) {
		//Desenvolva  um  programa  para  ler  um  número  e  apresentar  os  resultados  da  tabuada  deste número.
		int	N = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número:"));
		  int R;
		  String tabuada="";
		 
		  
		  for(int I = 0; I <= 9; I++){ 			   
		     R = N * (I + 1);
		     tabuada += N + " X " + (I + 1) + " = " + R +"\n";
		    }
		  
		  JOptionPane.showMessageDialog(null, tabuada);

		
	}

}
