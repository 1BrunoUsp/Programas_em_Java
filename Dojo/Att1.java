package Dojo;

import java.util.Scanner;

public class Att1 {

	public static void main(String[] args) {
		// 		// Algoritmo que capture as informações de uma compra realizada em uma loja virtual e determine qual o método de envio mais adequado, considerando o peso do produto, o valor da compra e a região de entrega.
		Scanner leia = new Scanner(System.in);
		int peso, preco, regiao;
		
		System.out.println("Escreva o peso em Kg do produto");
		peso = leia.nextInt();
		System.out.println("Escreva o preço do produto");
		preco = leia.nextInt();
		System.out.println("Escreva a região que deve ser entregue, sendo o número 1 para Sul, número 2 para Sudeste, número 3 para Centro-Oeste e o número 4 para Norte ou Nordeste");
		regiao = leia.nextInt();
		
			switch (regiao) {
            case 1:
                if (preco >= 300.0 && peso <= 5) {
                    System.out.println("Será entregue por meio da Sedex");
                } else {
                   System.out.println("Será entregue por meio da PAC");
                   }break;
            case 2:
                if (preco >= 300.0 && peso <= 2) {
                	System.out.println("Será entregue por meio da Sedex");
                } else {
                	 System.out.println("Será entregue por meio da PAC");
                }
			    break;
			  case 3:
			      if (preco >= 500 && peso <= 5) {
			    	  System.out.println("Será entregue por meio da Sedex");
				} else {
					System.out.println("Será entregue por meio da PAC");
				}
			    break;
			  case 4:
				  if (preco >= 1000 && peso <= 5) {
					  System.out.println("Será entregue por meio da Sedex");
				  } else {
					  System.out.println("Será entregue por meio da PAC");
				  }break;
				  default: System.out.println("Número de Região digitado ERRADO");
				  return;
			} 
			 
			
			}
	}
