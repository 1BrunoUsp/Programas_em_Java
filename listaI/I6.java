package listaI;

import javax.swing.JOptionPane;

public class I6 {

	public static void main(String[] args) {
		// Desenvolva um programa para ler a m�dia de 20 alunos e 
//		calcular a quantidade de alunos que foram aprovados. 
//		Para um aluno ser aprovado a sua m�dia deve ser maior ou igual a 6.
		int alunoAp = 0;
		
		
		for(int i = 0; i <= 20; i++) {
			int media = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a m�dia do aluno"));
			if(media >= 6) {
				alunoAp++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "A quantidade de alunos que foram aprovados � de: " + alunoAp);

	}

}
