package listaG;

import java.util.Scanner;

public class G1 {

	public static void main(String[] args) {
		// Algorítimo que avisa qual é o erro pelo código informado
		Scanner leia = new Scanner(System.in);
    	int x;
   	 System.out.println("Escreva o Número do Erro");    	 
        x = leia.nextInt(); 
		 
        String Cod_Erro = "";
               
               switch (x) {
                   case 1: Cod_Erro = "Identificador Inválido";  
                     break;
                   case 2:  Cod_Erro = "Esperando Número Inteiro";  
                     break;
                   case 3:  Cod_Erro = "Tipo de Dado Indefinido";    
                     break;
                   case 4:  Cod_Erro = "Parâmetro Incorreto";   
                     break;
                   case 5:  Cod_Erro = "Memória Insuficiente";   
                     break;
                   default:  System.out.println("Erro não identificado!");
                   return;
               }
               System.out.println("Número Digitado: " + x + ", Erro identificado!: " + Cod_Erro);
	leia.close();
       }
     
   }

