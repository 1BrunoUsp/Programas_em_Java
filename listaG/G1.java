package listaG;

import java.util.Scanner;

public class G1 {

	public static void main(String[] args) {
		// Algor�timo que avisa qual � o erro pelo c�digo informado
		Scanner leia = new Scanner(System.in);
    	int x;
   	 System.out.println("Escreva o N�mero do Erro");    	 
        x = leia.nextInt(); 
		 
        String Cod_Erro = "";
               
               switch (x) {
                   case 1: Cod_Erro = "Identificador Inv�lido";  
                     break;
                   case 2:  Cod_Erro = "Esperando N�mero Inteiro";  
                     break;
                   case 3:  Cod_Erro = "Tipo de Dado Indefinido";    
                     break;
                   case 4:  Cod_Erro = "Par�metro Incorreto";   
                     break;
                   case 5:  Cod_Erro = "Mem�ria Insuficiente";   
                     break;
                   default:  System.out.println("Erro n�o identificado!");
                   return;
               }
               System.out.println("N�mero Digitado: " + x + ", Erro identificado!: " + Cod_Erro);
	leia.close();
       }
     
   }

