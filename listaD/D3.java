package listaD;

import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
		// Algor�timo que l� o cod do departamento e explana a fun��o
		
		int codigoDepartamento;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe seu c�digo dito pelo superior");
		codigoDepartamento = leia.nextInt();
		
		if (codigoDepartamento == 1){
			System.out.println("Seu departamento � o de Expedi��o");
		}
		{
		    if(codigoDepartamento == 2){
		    	System.out.println("Seu departamento � o de Recursos Humanos");
		    }
		    {
		    	if(codigoDepartamento == 3){
			    	System.out.println("Seu departamento � o de Log�stica");
			    }
			    {
			    	if(codigoDepartamento == 4){
				    	System.out.println("Seu departamento � o de Contabilidade");
				    }
				    if(codigoDepartamento > 4) {
				    	System.out.println("C�digo inv�lido");
				    }
				    }
			    }
		    }

	}

}
