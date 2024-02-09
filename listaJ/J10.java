package listaJ;

import java.util.Scanner;

public class J10 {

	public static void main(String[] args) {
		// programa deverá receber o voto de cada entrevistado e ao final deverá apresentar  a  colocação,  o  total  de  votos  e  o  percentual  de  votos  de  cada  automóvel.  Os  possíveis empatestambém deverão ser verificados. 
		        Scanner leia1 = new Scanner(System.in);
		        int n1;
		        int corsa = 0;
		        int palio = 0;
		        int gol = 0;
		        String RESP = "s";
		        while(RESP.equalsIgnoreCase("s")) {
		            System.out.println("Vote em 1 das marcas sendo 1-Corsa, 2-Palio e 3-Gol");
		            n1 = leia1.nextInt();
		            if(n1 == 1) {
		                corsa++;
		            } else if(n1 == 2) {
		                palio++;
		            } else if(n1 == 3) {
		                gol++;
		            }
		            System.out.println("Deseja fazer mais um voto ? (s/n)");
		            RESP = leia1.next();
		        }
		        System.out.println("A votação encerrou, e o resultado foi: " + corsa + " Para o Corsa, " + palio + " para o Palio e " + gol + " para o Gol.");
		        if(corsa == palio && palio == gol) {
		            System.out.println("A votação empatou, por favor refaça.");
		        }
		        leia1.close();
		    }
		}