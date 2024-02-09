package Vetor;
import javax.swing.JOptionPane;
public class V1 {

	public static void main(String[] args) {
		//
		double vetorA[] = new double [20];
		double vetorB[] = new double [20];
		double vetorC[] = new double [20];
		
		String soma="";
		
		for (int i=0; i < vetorC.length; i++) {
			vetorA[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Vetor A: " + (i + 1) +" °"));
			vetorB[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Vetor B: " + (i + 1) +" °"));
			
			vetorC[i] = vetorA[i] + vetorB[i];
			soma += "a soma do vetor A: " + vetorA[i] + " com o vetor B: " + vetorB[i] + " é igual a: " + vetorC[i] + "\n";
			
		}
		JOptionPane.showMessageDialog(null, soma);
	}

}
