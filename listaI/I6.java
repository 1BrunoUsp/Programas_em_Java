package listaI;

import javax.swing.JOptionPane;

public class I6 {

	public static void main(String[] args) {
		// Desenvolva um programa para ler a média de 20 alunos e 
//		calcular a quantidade de alunos que foram aprovados. 
//		Para um aluno ser aprovado a sua média deve ser maior ou igual a 6.
		int alunoAp = 0;
		
		
		for(int i = 0; i <= 20; i++) {
			int media = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a média do aluno"));
			if(media >= 6) {
				alunoAp++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "A quantidade de alunos que foram aprovados é de: " + alunoAp);

	}

}
