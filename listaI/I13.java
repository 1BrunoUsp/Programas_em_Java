package listaI;

import javax.swing.JOptionPane;

public class I13 {

	public static void main(String[] args) {
		// Desenvolva  um  programa  para  calcular  a  
//		soma  de  todos  os  numero  impares  de 1 à 20  e  a multiplicação de todos os números pares de 1 à 20.

		
		int soma = 0;
		int mult = 1;
		String impar = "";
		String par= "";
		JOptionPane.showMessageDialog(null, "Soma dos ímpares");
		for(int i = 0; i <= 20; i++) {
			if(i % 2 == 1) {
				soma = soma + i;
				impar += "Soma : "+soma +"-"+ i + " : Ímpar "+"\n";
			} 
	}
		JOptionPane.showMessageDialog(null, "Números ímpares até o 20 e somados: "+ "\n" + impar );
		JOptionPane.showMessageDialog(null, "Multiplicação dos pares");
		for(int x = 1; x <= 20; x++) {
			if(x % 2 == 0){
				mult = mult * x;
				par += "Multiplicação : " +mult+"-"+x+" : Par"+"\n";	
				}
		}
		JOptionPane.showMessageDialog(null, "Números pares até o 20 e multiplicados: "+ "\n"  + par );

	}
}
