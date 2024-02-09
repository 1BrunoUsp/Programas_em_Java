package listaI;

import javax.swing.JOptionPane;

public class I7 {

	public static void main(String[] args) {
		// Desenvolva um programa para ler a idade de um conjunto de alunos 
		//(N alunos) de uma sala de aula e calcular a média das idades destes alunos.
		String resp = "";
		double i = Double.parseDouble(JOptionPane.showInputDialog("Escreva a quantidade de alunos da sala: "));
		double somaIdades = 0;

		for (int f = 0; f < i; f++) {
		    double idade = Double.parseDouble(JOptionPane.showInputDialog("Informe a idade do aluno"));
		    somaIdades += idade;
		}

		double mediaIdades = somaIdades / i;
		resp += mediaIdades;

		JOptionPane.showMessageDialog(null, resp);
	}
}