package listaJ;

import java.util.Scanner;

public class J9 {

	public static void main(String[] args) {
		// receber o voto de cada entrevistado e ao final deverá apresentar a colocação, o total de votos e o percentual de votos de cada curso
		
		Scanner leia = new Scanner(System.in);
		int ciencompt = 0; 
		int direito = 0; 
		int letras = 0;
		int participantes = 0;
		
		String RESP = "s";
		while(RESP.equalsIgnoreCase("s")) {
			System.out.println("Vote em um Concurso, Ciências Da Computação (1), Direito (2) e Letras (3) ");
			int concurso = leia.nextInt();
			if(concurso == 1){
				ciencompt++;
				
			} if(concurso == 2){
				direito++;
				
			} else if ( concurso == 3){
				letras++;
				
			}
			participantes++;
			System.out.println("Deseja Adicionar mais 1 Voto ? S/N");
			RESP = leia.next();
			
		}
				if (ciencompt > direito && ciencompt > letras && direito > letras){
					System.out.println("A votação encerrou! e os votos foram: " + ciencompt + " em Ciências da Computação, " + direito + " em Direito e" + letras + " em Letras!!");
				System.out.println("O percentual de Ciências Da Computação é: " + ((ciencompt*100) / participantes) + "% e o de Direito foi de: " + ((direito*100) / participantes) + "% e por fim, o de Letras foi de: "+ ((letras*100)/participantes) + "%" );}
					if (direito > ciencompt && direito > letras && letras > ciencompt) {
						System.out.println("A votação encerrou! e os votos foram: " + ciencompt + " em Ciências da Computação, " + direito + " em Direito e" + letras + " em Letras!!");
					System.out.println("O percentual de Ciências Da Computação é: " + ((ciencompt*100) / participantes) + "% e o de Direito foi de: " + ((direito*100) / participantes) + "% e por fim, o de Letras foi de: "+ ((letras*100)/participantes) + "%");}
						if (letras > ciencompt && letras > direito && direito > ciencompt) {
							System.out.println("A votação encerrou! e os votos foram: " + ciencompt + " em Ciências da Computação, " + direito + " em Direito e " + letras + " em Letras!!");
						System.out.println("O percentual de Ciências Da Computação é: " + ((ciencompt*100) / participantes) + "% e o de Direito foi de: " + ((direito*100) / participantes) + "% e por fim, o de Letras foi de: "+ ((letras*100)/ participantes) + "%" );}
								if (letras > direito && letras > ciencompt && ciencompt > direito ) {
									System.out.println("A votação encerrou! e os votos foram: " + ciencompt + " em Ciências da Computação, " + direito + " em Direito e " + letras + " em Letras!!");
								System.out.println("O percentual de Ciências Da Computação é: " + ((ciencompt*100) / participantes) + "% e o de Direito foi de: " + ((direito*100) / participantes) + "% e por fim, o de Letras foi de: "+ ((letras*100)/participantes) + "%" );}
									if (ciencompt == direito && direito == letras) {
										System.out.println("A votação encerrou! e os votos foram: " + ciencompt + " em Ciências da Computação, " + direito + " em Direito e " + letras + " em Letras!!");
									System.out.println("O percentual de Ciências Da Computação é: " + ((ciencompt*100) / participantes) + "% e o de Direito foi de: " + ((direito*100) / participantes) + "% e por fim, o de Letras foi de: "+ ((letras*100)/participantes) + "%" );}
											if (ciencompt == direito && letras > ciencompt) {
												System.out.println("A votação encerrou! e os votos foram: " + ciencompt + " em Ciências da Computação, " + direito + " em Direito e " + letras + " em Letras!!");
											System.out.println("O percentual de Ciências Da Computação é: " + ((ciencompt*100) / participantes) + "% e o de Direito foi de: " + ((direito*100) / participantes) + "% e por fim, o de Letras foi de: "+ ((letras*100)/participantes) + "%" );}
												if (direito == letras && ciencompt < direito) {
													System.out.println("A votação encerrou! e os votos foram: " + ciencompt + " em Ciências da Computação, " + direito + " em Direito e " + letras + " em Letras!!");
												System.out.println("O percentual de Ciências Da Computação é: " + ((ciencompt*100) / participantes) + "% e o de Direito foi de: " + ((direito*100) / participantes) + "% e por fim, o de Letras foi de: "+ ((letras*100)/participantes) + "%" );}
													if (direito == letras && ciencompt > direito) {
														System.out.println("A votação encerrou! e os votos foram: " + ciencompt + " em Ciências da Computação, " + direito + " em Direito e " + letras + " em Letras!!");
													System.out.println("O percentual de Ciências Da Computação é: " + ((ciencompt*100) / participantes) + "% e o de Direito foi de: " + ((direito*100) / participantes) + "% e por fim, o de Letras foi de: "+ ((letras*100)/participantes) + "%" );}
														if ( ciencompt == letras && letras > direito) {
															System.out.println("A votação encerrou! e os votos foram: " + ciencompt + " em Ciências da Computação, " + direito + " em Direito e " + letras + " em Letras!!");
														System.out.println("O percentual de Ciências Da Computação é: " + ((ciencompt*100) / participantes) + "% e o de Direito foi de: " + ((direito*100) / participantes) + "% e por fim, o de Letras foi de: "+ ((letras*100)/participantes) + "%" );}
															if ( ciencompt == letras && direito > ciencompt) {
																System.out.println("A votação encerrou! e os votos foram: " + ciencompt + " em Ciências da Computação, " + direito + " em Direito e " + letras + " em Letras!!");
															System.out.println("O percentual de Ciências Da Computação é: " + ((ciencompt*100) / participantes) + "% e o de Direito foi de: " + ((direito*100) / participantes) + "% e por fim, o de Letras foi de: "+ ((letras*100)/participantes) + "%" );}
																if ( ciencompt == direito && direito > letras) {
																	System.out.println("A votação encerrou! e os votos foram: " + ciencompt + " em Ciências da Computação, " + direito + " em Direito e " + letras + " em Letras!!");
																System.out.println("O percentual de Ciências Da Computação é: " + ((ciencompt*100) / participantes) + "% e o de Direito foi de: " + ((direito*100) / participantes) + "% e por fim, o de Letras foi de: "+ ((letras*100)/participantes) + "%" );}
																}
															
														
													
												
								}
								
								
				
	
