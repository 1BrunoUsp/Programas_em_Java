package Dojo;

import javax.swing.JOptionPane;

public class Att3 {

	public static void main(String[] args) {
		// Uma empresa possui ônibus com 48 lugares divididos em lado direito e lado
        int lugar1[][] = {{1,2},{3,4},{5,6},{7,8},{9,10},{11,12},{13,14},{15,16},{17,18},{19,20},{21,22},{23,24}};
        int lugar2[][] = {{25,26},{27,28},{29,30},{31,32},{33,34},{35,36},{37,38},{39,40},{41,42},{43,44},{45,46},{47,48}};

        int R = 0;
        String opcoes[] = {"Mostrar Poltronas", "Vender Passagens", "Sair"};

        while (R != 2) {
            R = JOptionPane.showOptionDialog(null, "Escolha", "ÔNIBUS", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if (R == 0) {
                mostrarPoltronas(lugar1, lugar2);
            } else if (R == 1) {
                venderPassagem(lugar1, lugar2);
            }
        }
    }

    public static void mostrarPoltronas(int[][] lugar1, int[][] lugar2) {
        String matrix = "";

        for (int l = 0; l <= 11; l++) {
            for (int c = 0; c <= 1; c++) {
                matrix += "| " + lugar1[l][c] + " |";
            }
            matrix += "           ";
            for (int c = 0; c <= 1; c++) {
                matrix += "| " + lugar2[l][c] + " |";
            }
            matrix += "\n";
        }

        JOptionPane.showMessageDialog(null, matrix, "Poltronas", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void venderPassagem(int[][] lugar1, int[][] lugar2) {
        int compra = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da poltrona que deseja ocupar"));

        if (compra >= 1 && compra <= 24) {
            int linha, coluna;
            if (compra  % 2 == 0) {
                linha = compra / 2 - 1;
                coluna = 1;
            } else {
                linha = compra / 2;
                coluna = 0;
            }

            if (lugar1[linha][coluna] == 0) {
                JOptionPane.showMessageDialog(null, "Poltrona " + compra + " já está ocupada.", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                lugar1[linha][coluna] = 0;
                JOptionPane.showMessageDialog(null, "Poltrona " + compra + " vendida com sucesso.", "Venda de Passagem", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (compra >= 25 && compra <= 48) {
            int linha, coluna;
            if (compra  % 2 == 0) {
                linha = (compra - 25) / 2;
                coluna = 1;
            } else {
                linha = (compra - 25) / 2;
                coluna = 0;
            }

            if (lugar2[linha][coluna] == 0) {
                JOptionPane.showMessageDialog(null, "Poltrona " + compra + " já está ocupada.", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                lugar2[linha][coluna] = 0;
                JOptionPane.showMessageDialog(null, "Poltrona " + compra + " vendida com sucesso.", "Venda de Passagem", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número de poltrona inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

