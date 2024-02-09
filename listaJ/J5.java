package listaJ;

import java.util.Scanner;

public class J5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int sexo, resp, contador, contMasc, contFemi, contSim, contNao, total;
		double porcentagem, porcentagem2, porcentagem3, porcentagem4, porc1, porc2, porc3, porc4, result1, result2, result3, result4;
		contador = 0; contMasc = 0; contFemi = 0; contSim = 0; contNao = 0;
		
		System.out.println("Quantas pessoas irão realizar a pesquisa?");
		contador = leia.nextInt();
		System.out.println("Digite o valor anterior Porfavor!");
		total = leia.nextInt();
	
		while(contador > 0) {
			System.out.println("Digite 1 para masculino e 2 para feminino");
			sexo = leia.nextInt();
			if(sexo == 1) {
				contMasc = (contMasc + 1);
			}else if(sexo == 2){
				contFemi = (contFemi + 1);
			}
			System.out.println("Digite 1 se gostou do produto e 2 para não");
			resp = leia.nextInt();
			if(resp == 1) {
				contSim = (contSim + 1);
			}else if(resp == 2){
				contNao = (contNao + 1);}
			
			contador = (contador - 1);
		}
		System.out.println("Pessoas que responderam SIM :" + contSim + "!");
		System.out.println("Pessoas que respoderam NÃO :" + contNao + "!");
		porcentagem = (contMasc * 100) / total;
		porc1 = (contNao * 100) / total;
		result1 = (porcentagem + porc1) / 2;
		System.out.println("Sexo Masculino que respondeu NÃO:" + result1 +"%");
		porcentagem2 = (contMasc * 100) / total;
		porc2 = (contSim * 100) / total;
		result2 = (porcentagem2 + porc2) / 2;
		System.out.println("Sexo Masculino que respondeu SIM:" + result2 + "%");
		porcentagem3 = (contFemi * 100) / total;
		porc3 = (contNao * 100) / total;
		result3 = (porcentagem3 + porc3) / 2;
		System.out.println("Sexo Feminino que respondeu NÃO:" + result3 + "%" );
		porcentagem4 = (contFemi * 100) / total;
		porc4 = (contSim * 100) / total;
		result4 = (porcentagem4 + porc4) / 2;
		System.out.println("Sexo Feminino que respondeu SIM:" + result4 + "%");
		
		
		
	}



	}


