package listaK;

import javax.swing.JOptionPane;

public class K5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0, regiao = 0, sexo = 0, homensCentro = 0, mulheresCentro = 0, homensLeste = 0, mulheresLeste = 0, homensNorte = 0, 
			    mulheresNorte = 0, homensOeste = 0, mulheresOeste = 0, homensSul = 0, mulheresMaioresOeste = 0, mulheresSul = 0, 
			    homensMenoresLeste = 0, mulheresMaioresSul = 0, totalPessoas = 0, totalH = 0, totalF = 0, homensMenoresNorte = 0;
			int contador = 0;
			do {
			    idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade."));
			    regiao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua região:"
			            + "\n1- Centro"
			            + "\n2- Leste"
			            + "\n3- Norte"
			            + "\n4- Oeste"
			            + "\n5- Sul"));

			    String opcoes[] = {"masculino", "feminino"};
			    sexo = JOptionPane.showOptionDialog(null, "Sexo", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

			    if (sexo == 0) {
			        totalH++;
			        switch (regiao) {
			            case 1:
			                homensCentro++;
			                break;
			            case 2:
			                homensLeste++;
			                if (idade < 18) {
			                    homensMenoresLeste++;
			                }
			                break;
			            case 3:
			                homensNorte++;
			                if (idade < 18) {
			                    homensMenoresNorte++;
			                }
			                break;
			            case 4:
			                homensOeste++;
			                break;
			            case 5:
			                homensSul++;
			                break;
			        }
			    } else if (sexo == 1) {
			        totalF++;
			        switch (regiao) {
			            case 1:
			                mulheresCentro++;
			                break;
			            case 2:
			                mulheresLeste++;
			                if (idade >= 18) {
			                    mulheresMaioresSul++;
			                }
			                break;
			            case 3:
			                mulheresNorte++;
			                break;
			            case 4:
			                mulheresOeste++;
			                if (idade >= 18) {
			                    mulheresMaioresOeste++;
			                }
			                break;
			            case 5:
			                mulheresSul++;
			                break;
			        }
			    }

			    contador = JOptionPane.showConfirmDialog(null, "Deseja dar mais uma resposta?", "Pergunta", JOptionPane.YES_NO_OPTION);
			} while (contador == 0);

			JOptionPane.showMessageDialog(null, "Total de homens que moram na zona Leste e Central: " + (homensLeste + homensCentro) + 
			    "\nPercentual de mulheres que moram na zona Oeste, Norte e Sul: " + ((mulheresNorte + mulheresOeste + mulheresSul) * 100) / totalF + "%" +
			    "\nTotal de homens menores de 18 anos morando na zona Norte: " + homensMenoresNorte +
			    "\nPercentual de mulheres maiores de 18 anos morando na zona Oeste: " + (mulheresMaioresOeste * 100) / totalF + "%" +
			    "\nPercentual de mulheres que moram no Centro: " + (mulheresCentro * 100) / totalF + "%");
	}
}
           
		
