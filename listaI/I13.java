package listaI;

import javax.swing.JOptionPane;

public class I13 {

	public static void main(String[] args) {
		// Desenvolva  um  programa  para  calcular  a  
//		soma  de  todos  os  numero  impares  de 1 � 20  e  a multiplica��o de todos os n�meros pares de 1 � 20.

		
		int soma = 0;
		int mult = 1;
		String impar = "";
		String par= "";
		JOptionPane.showMessageDialog(null, "Soma dos �mpares");
		for(int i = 0; i <= 20; i++) {
			if(i % 2 == 1) {
				soma = soma + i;
				impar += "Soma : "+soma +"-"+ i + " : �mpar "+"\n";
			} 
	}
		JOptionPane.showMessageDialog(null, "N�meros �mpares at� o 20 e somados: "+ "\n" + impar );
		JOptionPane.showMessageDialog(null, "Multiplica��o dos pares");
		for(int x = 1; x <= 20; x++) {
			if(x % 2 == 0){
				mult = mult * x;
				par += "Multiplica��o : " +mult+"-"+x+" : Par"+"\n";	
				}
		}
		JOptionPane.showMessageDialog(null, "N�meros pares at� o 20 e multiplicados: "+ "\n"  + par );

	}
}
