package listaF;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		// Algor�timo que fala o departamento de cada funcion�rio pelo seu c�digo.
		Scanner leia = new Scanner(System.in);
		int cod;
		
		System.out.println("Digite o c�digo informado pelo seu chefe");
		cod = leia.nextInt();

		  if(cod == 10){
		        System.out.println("Seu departamento � de Contabilidade");}
		    
		        else   if(cod == 12) {
		        	System.out.println("Seu departamento � de Almoxarifado");}
		        
		        else if(cod == 14) {
		        		System.out.println("Seu departamento � de Inform�tica");
		        	  }else {
		        		System.out.println("C�digo inexistente");
		        	}
		  leia.close();
}
}

		        		
		        	
	

			

				  
			  
		
		
		



				
			
		
	

					
