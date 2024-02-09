package Matriz2;
import javax.swing.JOptionPane;

public class M3 {

    public static void main(String[] args) {
        int vetorA[] = new int[5];
        int matrizB[][] = new int[5][3];
        String matrix1 = "";
        String matrix2 = "";
        String matrix3 = "";
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º valor do vetor"));
        }

        for (int i = 0; i < matrizB.length; i++) {
            matrizB[i][0] = vetorA[i] + 5;
            matrix1 += matrizB[i][0] + "\n";
        }

        for (int i = 0; i < vetorA.length; i++) {
            matrizB[i][1] = calcularFatorial(vetorA[i]);
            matrix2 += matrizB[i][1] + "\n";
        }
        
        for (int i = 0; i < vetorA.length; i++) {
            matrizB[i][2] = vetorA[i] * vetorA[i];
            matrix3 += matrizB[i][2] + "\n";
        }

        JOptionPane.showMessageDialog(null, "coluna somada com 5 : \n" + matrix1 + "\n coluna fatorada : \n " + matrix2 + "\n coluna ao quadrado : \n " + matrix3 );
    }

    public static int calcularFatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}