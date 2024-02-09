package Matriz;
import javax.swing.JOptionPane;
public class M3 {

	public static void main(String[] args) {
		// BRUNO e JENIFER
		
		int matriz[][] = new int[5][5];
		int v1[] = new int[5];
		int v2[] = new int[5];
		int l, c;
		
		String vetorL = "";
		String vetorC = "";
		String matrix = "";
		for(l = 0; l<= 4; l++) {
			for(c = 0; c<=4; c++) {
				matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor " + (c + 1) +" ° valor da linha"));
				matrix +=  matriz[l][c] + "  " ;
			}
			matrix += "\n";
		}
		for(int i = 0 ; i <= 4 ; i ++) {
			v1[i] += matriz[i][0];
			v1[i] += matriz[i][1];
			v1[i] += matriz[i][2];
			v1[i] += matriz[i][3];
			v1[i] += matriz[i][4];
			
			v2[i] += matriz[0][i];
			v2[i] += matriz[1][i];
			v2[i] += matriz[2][i];
			v2[i] += matriz[3][i];
			v2[i] += matriz[4][i];
		}
//		v1[0] = matriz[0][0] + matriz[0][1] + matriz[0][2] + matriz[0][3] + matriz[0][4];
//		v1[1] = matriz[1][0] + matriz[1][1] + matriz[1][2] + matriz[1][3] + matriz[1][4];
//		v1[2] = matriz[2][0] + matriz[2][1] + matriz[2][2] + matriz[2][3] + matriz[2][4];
//		v1[3] = matriz[3][0] + matriz[3][1] + matriz[3][2] + matriz[3][3] + matriz[3][4];
//		v1[4] = matriz[4][0] + matriz[4][1] + matriz[4][2] + matriz[4][3] + matriz[4][4];
//		
//		v2[0] = matriz[0][0] + matriz[1][0] + matriz[2][0] + matriz[3][0] + matriz[4][0];
//		v2[1] = matriz[0][1] + matriz[1][1] + matriz[2][1] + matriz[3][1] + matriz[4][1];
//		v2[2] = matriz[0][2] + matriz[1][2] + matriz[2][2] + matriz[3][2] + matriz[4][2];
//		v2[3] = matriz[0][3] + matriz[1][3] + matriz[2][3] + matriz[3][3] + matriz[4][3];
//		v2[4] = matriz[0][4] + matriz[1][4] + matriz[2][4] + matriz[3][4] + matriz[4][4];
//		
			for(int i = 0 ; i <= 4 ; i++) {
				vetorL += "\n|" + v1[i] + "|"+ "\n";
				vetorC += "\n|" + v2[i] + "|"+ "\n";
			}
		JOptionPane.showMessageDialog(null, "A Soma das linhas :" + vetorL + "\n A Soma das colunas : " + vetorC + "\n A matriz : \n" + matrix);
		
		

	}

}
