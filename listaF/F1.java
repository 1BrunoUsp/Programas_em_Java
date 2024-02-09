package listaF;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		// Algorítimo que fala o departamento de cada funcionário pelo seu código.
		Scanner leia = new Scanner(System.in);
		int cod;
		
		System.out.println("Digite o código informado pelo seu chefe");
		cod = leia.nextInt();

		  if(cod == 10){
		        System.out.println("Seu departamento é de Contabilidade");}
		    
		        else   if(cod == 12) {
		        	System.out.println("Seu departamento é de Almoxarifado");}
		        
		        else if(cod == 14) {
		        		System.out.println("Seu departamento é de Informática");
		        	  }else {
		        		System.out.println("Código inexistente");
		        	}
		  leia.close();
}
}

		        		
		        	
	

			

				  
			  
		
		
		



				
			
		
	

					
