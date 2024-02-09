package listaD;

import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
		// Algorítimo que lê o cod do departamento e explana a função
		
		int codigoDepartamento;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe seu código dito pelo superior");
		codigoDepartamento = leia.nextInt();
		
		if (codigoDepartamento == 1){
			System.out.println("Seu departamento é o de Expedição");
		}
		{
		    if(codigoDepartamento == 2){
		    	System.out.println("Seu departamento é o de Recursos Humanos");
		    }
		    {
		    	if(codigoDepartamento == 3){
			    	System.out.println("Seu departamento é o de Logística");
			    }
			    {
			    	if(codigoDepartamento == 4){
				    	System.out.println("Seu departamento é o de Contabilidade");
				    }
				    if(codigoDepartamento > 4) {
				    	System.out.println("Código inválido");
				    }
				    }
			    }
		    }

	}

}
