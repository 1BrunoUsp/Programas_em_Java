package listaJ;

import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {
		//  solicitar  o  sexo  do  entrevistado  e  o código do curso que deseja realizar.
		Scanner leia = new Scanner(System.in);
        int totalHomen = 0;
        int totalMulher = 0;
        int totalHomensEng = 0;
        int totalMulheresPsi = 0;
        int totalMed = 0;
        int totalHomensAdm = 0;
        int totalMulheresMed = 0;
        int totalEntr = 0;
        
        String resp = "s";
        while (resp.equalsIgnoreCase("s")) {
            System.out.print("Informe o sexo do entrevistado 1 Masculino e 2 Feminino: ");
            int sexo = leia.nextInt();
            
            System.out.print("Informe o código do curso desejado: 1-Engenharia da computação, 2-Administração, 3-Medicina, 4-Psicologia");
            int codCurso = leia.nextInt();
            if (sexo == 1) {
            	totalHomen++;
            }	if(sexo == 2) {
            	totalMulher++;
            }
            if (sexo == 1 && codCurso == 1) {
                totalHomensEng++;
            }
            	else if (sexo == 2 && codCurso == 4) {
                totalMulheresPsi++;
            }
            		if (codCurso == 3) {
            			totalMed++;
            }
            			if (sexo == 1 && codCurso == 2) {
            				totalHomensAdm++;
            }
            				if (sexo == 2 && codCurso == 3) {
            					totalMulheresMed++;
            }
            System.out.print("Deseja informar mais um entrevistado? S/N");
            resp = leia.next();
            totalEntr++;
        }
        System.out.println("Total de entrevistados: " + totalEntr);
        System.out.println("Total de homens que pretendem cursar Engenharia da Computação: " + totalHomensEng);
        System.out.println("Total de mulheres que pretendem cursar Psicologia: " + totalMulheresPsi);
        System.out.println("Percentual de pessoas que pretendem cursar Medicina: " + (totalMed*100/totalEntr) + "%");
        System.out.println("Percentual de homens que pretendem cursar Administração: " + (totalHomensAdm*100/(totalHomen+totalMulher)) + "%");
        System.out.println("Percentual de mulheres que pretendem cursar Medicina: " + (totalMulheresMed*100/(totalHomen+totalMulher)) + "%");
        
       
    }
}