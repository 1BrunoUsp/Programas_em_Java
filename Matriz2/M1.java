package Matriz2;

import javax.swing.JOptionPane;

public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1[][] = new int [4][6];
		int n2[][] = new int [4][6];
		int m1[][] = new int [4][6];
		int m2[][] = new int [4][6];
		int m3[][] = new int [4][6];
		
		int l1;
		int c1;
		String matrixN1 = "";
		String matrixN2 = "";
		String somaM1 = "";
		String menosM2 = "";
		String multM3 = "";
		for(l1 = 0; l1<=3 ; l1++) {
			for(c1 = 0; c1<=5 ; c1++) {
				n1[l1][c1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor " + (c1 + 1) +" ° valor da linha, da PRIMEIRA matriz"));
						n2[l1][c1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor " + (c1 + 1) +" ° valor da linha, da SEGUNDA matriz"));
					m1[l1][c1] = n1[l1][c1] + n2[l1][c1];
					m2[l1][c1] = n1[l1][c1] - n2[l1][c1];
					m3[l1][c1] = n1[l1][c1] * n2[l1][c1];
					matrixN1 += "|" + n1[l1][c1] + "|  ";
					matrixN2 += "|"+n2[l1][c1] + "|  ";
					somaM1 += "|"+m1[l1][c1] + "|   ";
					menosM2 += "|"+m2[l1][c1] + "|  ";
					multM3 += "|"+m3[l1][c1] + "|  ";
				}
			somaM1 += "\n";
			menosM2 += "\n";
			multM3 += "\n";
			matrixN1 += "\n";
			matrixN2 += "\n";
			}
			JOptionPane.showMessageDialog(null,
					"Primeira Matriz: \n" + matrixN1 + 
					"Segunda Matriz: \n" + matrixN2 + 
					"Matriz 1 e 2 Somadas: \n" + somaM1 + 
					"Matriz 1 e 2 Subtraidas: \n" + menosM2 +
					"Matriz 1 e 2 Multiplicadas: \n" + multM3);
		}
	}

