package Dojo;

import java.util.Scanner;

public class Att1 {

	public static void main(String[] args) {
		// 		// Algoritmo que capture as informa��es de uma compra realizada em uma loja virtual e determine qual o m�todo de envio mais adequado, considerando o peso do produto, o valor da compra e a regi�o de entrega.
		Scanner leia = new Scanner(System.in);
		int peso, preco, regiao;
		
		System.out.println("Escreva o peso em Kg do produto");
		peso = leia.nextInt();
		System.out.println("Escreva o pre�o do produto");
		preco = leia.nextInt();
		System.out.println("Escreva a regi�o que deve ser entregue, sendo o n�mero 1 para Sul, n�mero 2 para Sudeste, n�mero 3 para Centro-Oeste e o n�mero 4 para Norte ou Nordeste");
		regiao = leia.nextInt();
		
			switch (regiao) {
            case 1:
                if (preco >= 300.0 && peso <= 5) {
                    System.out.println("Ser� entregue por meio da Sedex");
                } else {
                   System.out.println("Ser� entregue por meio da PAC");
                   }break;
            case 2:
                if (preco >= 300.0 && peso <= 2) {
                	System.out.println("Ser� entregue por meio da Sedex");
                } else {
                	 System.out.println("Ser� entregue por meio da PAC");
                }
			    break;
			  case 3:
			      if (preco >= 500 && peso <= 5) {
			    	  System.out.println("Ser� entregue por meio da Sedex");
				} else {
					System.out.println("Ser� entregue por meio da PAC");
				}
			    break;
			  case 4:
				  if (preco >= 1000 && peso <= 5) {
					  System.out.println("Ser� entregue por meio da Sedex");
				  } else {
					  System.out.println("Ser� entregue por meio da PAC");
				  }break;
				  default: System.out.println("N�mero de Regi�o digitado ERRADO");
				  return;
			} 
			 
			
			}
	}
