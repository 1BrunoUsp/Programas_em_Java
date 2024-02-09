package listaI;

import javax.swing.JOptionPane;

public class I5 {

	public static void main(String[] args) {
		// Desenvolva um programa para ler quatro notas de 10 alunos e calcular a média destas notas por aluno.
		
		String tabela = "";
		
		for(int i = 0; i <= 10; i++) {
			String nome = JOptionPane.showInputDialog(null, "Digite o Nome do aluno");
			int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
			int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
			int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a terceira nota: "));
			int n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quarta nota: "));
			JOptionPane.showMessageDialog(null, "Próximo Aluno!");
			double media = (n1+n2+n3+n4)/4;
			
			tabela += "A média do(a) aluno(a) " + nome + " foi de: " + media + "\n";
		}
		
		JOptionPane.showMessageDialog(null, tabela);

	}

}
