package Dojo;
import javax.swing.JOptionPane;
public class Att2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int escolha, bovina=4, tulipa=2, linguica=2, farofa=1, refri=5;
		int amg1=2, amg2=2, amg3=2, amg4=2, amg5=2, amg6=2, amg7=2; 
		int amg1Car=0, amg1Tul=0, amg1Lin=0, amg1Far=0, amg1Ref=0;
		int amg2Car=0, amg2Tul=0, amg2Lin=0, amg2Far=0, amg2Ref=0;
		int amg3Car=0, amg3Tul=0, amg3Lin=0, amg3Far=0, amg3Ref=0;
		int amg4Car=0, amg4Tul=0, amg4Lin=0, amg4Far=0, amg4Ref=0;
		int amg5Car=0, amg5Tul=0, amg5Lin=0, amg5Far=0, amg5Ref=0;
		int amg6Car=0, amg6Tul=0, amg6Lin=0, amg6Far=0, amg6Ref=0;
		int amg7Car=0, amg7Tul=0, amg7Lin=0, amg7Far=0, amg7Ref=0;
		
		for(int i=0;i<amg1;i++) {
			
		String opcoes[] = {"500g carne bovina", "500g tulipa", "500g linguica de frango","1KG farofa","1L refrigerante"};
		escolha = JOptionPane.showOptionDialog(null, "Escolha dois itens para levar", "Churrasco", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		
		if(bovina<=0 && tulipa<=0 && linguica<=0 && farofa<=0 && refri<=0) {
			break;
		}
		
		if (escolha==0){
			bovina--;
			amg1Car++;
			if(bovina<0) {
				JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
				i--;
			    }
			}
		if (escolha==1){
			tulipa--;
			amg1Tul++;
			if(tulipa<0) {
				JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
				i--;
			    }
			}
		if (escolha==2){
			linguica--;
			amg1Lin++;
			if(linguica<0) {
				JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
				i--;
			    }
			}
		if (escolha==3){
			farofa--;
			amg1Far++;
			if(farofa<0) {
				JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
				i--;
			    }
			}
		if (escolha==4){
			refri--;
			amg1Ref++;
			if(refri<0) {
				JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
				i--;
			    }
			}
		
		
		      }
		for(int i=0;i<amg2;i++) {
			
			String opcoes[] = {"500g carne bovina", "500g tulipa", "500g linguica de frango","1KG farofa","1L refrigerante"};
			escolha = JOptionPane.showOptionDialog(null, "Escolha dois itens para levar", "Churrasco", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			
			if(bovina<=0 && tulipa<=0 && linguica<=0 && farofa<=0 && refri<=0) {
				break;
			}
			
			if (escolha==0){
				bovina--;
				amg2Car++;
				if(bovina<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==1){
				tulipa--;
				amg2Tul++;
				if(tulipa<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==2){
				linguica--;
				amg2Lin++;
				if(linguica<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==3){
				farofa--;
				amg2Far++;
				if(farofa<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==4){
				refri--;
				amg2Ref++;
				if(refri<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			
			
			      }
		for(int i=0;i<amg3;i++) {
			
			String opcoes[] = {"500g carne bovina", "500g tulipa", "500g linguica de frango","1KG farofa","1L refrigerante"};
			escolha = JOptionPane.showOptionDialog(null, "Escolha dois itens para levar", "Churrasco", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			
			if(bovina<=0 && tulipa<=0 && linguica<=0 && farofa<=0 && refri<=0) {
				break;
			}
			
			if (escolha==0){
				bovina--;
				amg3Car++;
				if(bovina<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==1){
				tulipa--;
				amg3Tul++;
				if(tulipa<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==2){
				linguica--;
				amg3Lin++;
				if(linguica<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==3){
				farofa--;
				amg3Far++;
				if(farofa<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==4){
				refri--;
				amg3Ref++;
				if(refri<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			
			
			      }
		for(int i=0;i<amg4;i++) {
			
			String opcoes[] = {"500g carne bovina", "500g tulipa", "500g linguica de frango","1KG farofa","1L refrigerante"};
			escolha = JOptionPane.showOptionDialog(null, "Escolha dois itens para levar", "Churrasco", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			
			if(bovina<=0 && tulipa<=0 && linguica<=0 && farofa<=0 && refri<=0) {
				break;
			}
			
			if (escolha==0){
				bovina--;
				amg4Car++;
				if(bovina<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==1){
				tulipa--;
				amg4Tul++;
				if(tulipa<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==2){
				linguica--;
				amg4Lin++;
				if(linguica<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==3){
				farofa--;
				amg4Far++;
				if(farofa<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==4){
				refri--;
				amg4Ref++;
				if(refri<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			
			
			      }
		for(int i=0;i<amg5;i++) {
			String opcoes[] = {"500g carne bovina", "500g tulipa", "500g linguica de frango","1KG farofa","1L refrigerante"};
			escolha = JOptionPane.showOptionDialog(null, "Escolha dois itens para levar", "Churrasco", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			
			if(bovina<=0 && tulipa<=0 && linguica<=0 && farofa<=0 && refri<=0) {
				break;
			}
			
			if (escolha==0){
				bovina--;
				amg4Car++;
				if(bovina<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==1){
				tulipa--;
				amg4Tul++;
				if(tulipa<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==2){
				linguica--;
				amg4Lin++;
				if(linguica<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==3){
				farofa--;
				amg4Far++;
				if(farofa<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==4){
				refri--;
				amg4Ref++;
				if(refri<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			
			
			      }
		for(int i=0;i<amg6;i++) {
			String opcoes[] = {"500g carne bovina", "500g tulipa", "500g linguica de frango","1KG farofa","1L refrigerante"};
			escolha = JOptionPane.showOptionDialog(null, "Escolha dois itens para levar", "Churrasco", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			
			if(bovina<=0 && tulipa<=0 && linguica<=0 && farofa<=0 && refri<=0) {
				break;
			}
			
			if (escolha==0){
				bovina--;
				amg4Car++;
				if(bovina<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==1){
				tulipa--;
				amg4Tul++;
				if(tulipa<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==2){
				linguica--;
				amg4Lin++;
				if(linguica<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==3){
				farofa--;
				amg4Far++;
				if(farofa<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==4){
				refri--;
				amg4Ref++;
				if(refri<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			
			
			
			      }
		for(int i=0;i<amg7;i++) {
			String opcoes[] = {"500g carne bovina", "500g tulipa", "500g linguica de frango","1KG farofa","1L refrigerante"};
			escolha = JOptionPane.showOptionDialog(null, "Escolha dois itens para levar", "Churrasco", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			
			if(bovina<=0 && tulipa<=0 && linguica<=0 && farofa<=0 && refri<=0) {
				break;
			}
			
			if (escolha==0){
				bovina--;
				amg4Car++;
				if(bovina<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==1){
				tulipa--;
				amg4Tul++;
				if(tulipa<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==2){
				linguica--;
				amg4Lin++;
				if(linguica<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==3){
				farofa--;
				amg4Far++;
				if(farofa<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			if (escolha==4){
				refri--;
				amg4Ref++;
				if(refri<0) {
					JOptionPane.showMessageDialog(null, "Escolha outra opcao","Alerta",JOptionPane.WARNING_MESSAGE );
					i--;
				    }
				}
			
			
			
			      }
		JOptionPane.showMessageDialog(null, "\n Amigo 1 escolheu 500g Bovina: "+ amg1Car + "\n Amigo 1 escolheu 500g Tulipa: "+ amg1Tul+
				"\n Amigo 1 escolheu 500g Linguica de Frango: "+ amg1Lin+ "\n Amigo 1 escolheu 1Kg Farofa: "+ amg1Far+ "\n Amigo 1 escolheu 1L Refrigerante: "+ amg1Ref+
				 "\n Amigo 2 escolheu 500g Bovina: "+ amg2Car + "\n Amigo 2 escolheu 500g Tulipa: "+ amg2Tul+
					"\n Amigo 2 escolheu 500g Linguica de Frango: "+ amg2Lin+ "\n Amigo 2 escolheu 1Kg Farofa: "+ amg2Far+ "\n Amigo 2 escolheu 1L Refrigerante: "+ amg2Ref+
					 "\n Amigo 3 escolheu 500g Bovina: "+ amg3Car + "\n Amigo 3 escolheu 500g Tulipa: "+ amg3Tul+
						"\n Amigo 3 escolheu 500g Linguica de Frango: "+ amg3Lin+ "\n Amigo 3 escolheu 1Kg Farofa: "+ amg3Far+ "\n Amigo 3 escolheu 1L Refrigerante: "+ amg3Ref+
						 "\n Amigo 4 escolheu 500g Bovina: "+ amg4Car + "\n Amigo 4 escolheu 500g Tulipa: "+ amg4Tul+
							"\n Amigo 4 escolheu 500g Linguica de Frango: "+ amg4Lin+ "\n Amigo 4 escolheu 1Kg Farofa: "+ amg1Far+ "\n Amigo 4 escolheu 1L Refrigerante: "+ amg4Ref);
		
		}

}
