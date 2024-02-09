package listaJ;

import java.util.Scanner;

public class J6 {

	public static void main(String[] args) {
		// O programa dever� solicitar a leitura da idade, da regi�o em que reside (Centro, Leste, Norte, Oeste ou Sul) e o sexo das pessoas. O programa dever� realizar a pesquisa enquanto houver a solicita��o de uma nova entrada de dados atrav�s da vari�vel RESP
		Scanner leia = new Scanner(System.in);
        int idade = 0, regiao = 0, sexo = 0, homensCentro = 0, mulheresCentro = 0, homensLeste = 0, mulheresLeste = 0, 
            homensNorte = 0, mulheresNorte = 0, homensOeste = 0, mulheresOeste = 0, homensSul = 0, 
            mulheresSul = 0, homensMenoresLeste = 0, mulheresMaioresSul = 0, totalPessoas = 0, totalH = 0, totalF = 0;
        String RESP = "S";
        
        while (RESP.equalsIgnoreCase("S")) {
            System.out.print("Digite a idade: ");
            idade = leia.nextInt();
            leia.nextLine();
            System.out.print("Digite a regi�o em que reside (Centro=1, Leste=2, Norte=3, Oeste=4, Sul=5): ");
            regiao = leia.nextInt();
            leia.nextLine();
            System.out.print("Digite o sexo (1-Masculino / 2-Feminino): ");
            sexo = leia.nextInt();
            leia.nextLine();
            
            if (sexo == 1) {
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
                        break;
                    case 4:
                        homensOeste++;
                        break;
                    case 5:
                        homensSul++;
                        break;
                }
            } else if (sexo == 2) {
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
                        break;
                    case 5:
                        mulheresSul++;
                        break;
                }
            }
            System.out.print("Deseja realizar uma nova entrada de dados? (S/N) ");
            RESP = leia.nextLine();
            totalPessoas++;
        }
        System.out.println("Total de homens e mulheres por regi�o:");
        System.out.println("Centro - Homens: " + homensCentro + " Mulheres: " + mulheresCentro);
        System.out.println("Leste - Homens: " + homensLeste + " Mulheres: " + mulheresLeste);
        System.out.println("Norte - Homens: " + homensNorte + " Mulheres: " + mulheresNorte);
        System.out.println("Oeste - Homens: " + homensOeste + " Mulheres: " + mulheresOeste);
        System.out.println("Sul - Homens: " + homensSul + " Mulheres: " + mulheresSul);
        System.out.println("Percentual das mulheres:");
        System.out.println("percentual de mulheres na regi�o do centro: " + (mulheresCentro*100/totalF) + "%");
        System.out.println("percentual de mulheres na regi�o Leste: " + (mulheresLeste*100/totalF) + "%");
        System.out.println("percentual de mulheres na regi�o Norte: " + (mulheresNorte*100/totalF) + "%");
        System.out.println("percentual de mulheres na regi�o Oeste: " + (mulheresOeste*100/totalF) + "%");
        System.out.println("percentual de mulheres na regi�o sul: " + (mulheresSul*100/totalF) + "%");
        System.out.println("Percentual dos homens:");
        System.out.println("percentual de homens na regi�o do centro: " + (homensCentro*100/totalH) + "%");
        System.out.println("percentual de homens na regi�o Leste: " + (homensLeste*100/totalH) + "%");
        System.out.println("percentual de homens na regi�o Norte: " + (homensNorte*100/totalH) + "%");
        System.out.println("percentual de homens na regi�o Oeste: " + (homensOeste*100/totalH) + "%");
        System.out.println("percentual de homens na regi�o sul: " + (homensSul*100/totalH) + "%");
        if(idade < 18 && sexo == 1 && regiao == 2) {
        	System.out.println("O total de Homens que moram na regi�o leste e s�o menores de idade: " + homensMenoresLeste  );
        }if(idade >=18 && sexo == 2 && regiao == 5) {
        	System.out.println("O total de Mulheres que moram na regi�o sul e s�o maiores de idade: " + mulheresMaioresSul  );
        }
        System.out.println("Percentual de homens que moram no centro da cidade: " + (homensCentro*100)/totalH + "%");
        System.out.println("Pessoas que moram em S�o Paulo: " + totalPessoas);
	}
} 
