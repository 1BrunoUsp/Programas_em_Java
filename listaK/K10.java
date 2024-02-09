package listaK;

import javax.swing.JOptionPane;

public class K10 {


	public static void main(String[] args) {
		// Desenvolva um programa para calcular a soma de todos os numero impares de 0 à 20 e a
       //  multiplicação de todos os números pares de 0 à 20.
		
		int i = 1;
		int x = 1;
		int soma = 0;
		int mult = 1;
		String impar = "";
		String par= "";
		JOptionPane.showMessageDialog(null, "Soma dos ímpares");
		do {
			if(i % 2 == 1) {
				soma = soma + i;
				impar += "Soma : "+soma +"-"+ i + " : Ímpar "+"\n";	
			}
			i++;
		}while(i<=20);
		JOptionPane.showMessageDialog(null, "Números ímpares até o 20 e somados: "+ "\n" + impar );
		JOptionPane.showMessageDialog(null, "Multiplicação dos pares");
		do {
			 if(x % 2 == 0){
				mult = mult * x;
				par += "Multiplicação : " +mult+"-"+x+" : Par"+"\n";	
				}
			 x++;
		}while(x<=20);
		JOptionPane.showMessageDialog(null, "Números pares até o 20 e multiplicados: "+ "\n"  + par );
	
	}
}