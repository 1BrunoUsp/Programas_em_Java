package listaK;

import javax.swing.JOptionPane;

public class K10 {


	public static void main(String[] args) {
		// Desenvolva um programa para calcular a soma de todos os numero impares de 0 � 20 e a
       //  multiplica��o de todos os n�meros pares de 0 � 20.
		
		int i = 1;
		int x = 1;
		int soma = 0;
		int mult = 1;
		String impar = "";
		String par= "";
		JOptionPane.showMessageDialog(null, "Soma dos �mpares");
		do {
			if(i % 2 == 1) {
				soma = soma + i;
				impar += "Soma : "+soma +"-"+ i + " : �mpar "+"\n";	
			}
			i++;
		}while(i<=20);
		JOptionPane.showMessageDialog(null, "N�meros �mpares at� o 20 e somados: "+ "\n" + impar );
		JOptionPane.showMessageDialog(null, "Multiplica��o dos pares");
		do {
			 if(x % 2 == 0){
				mult = mult * x;
				par += "Multiplica��o : " +mult+"-"+x+" : Par"+"\n";	
				}
			 x++;
		}while(x<=20);
		JOptionPane.showMessageDialog(null, "N�meros pares at� o 20 e multiplicados: "+ "\n"  + par );
	
	}
}