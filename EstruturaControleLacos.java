
// Aula 15: Estrutura de Controle IF / ELSE
 
/**
 		Estrutura IF

        if (condicao) {
            instrucao1;
        }else{
            instrucao2;
        }

 */

/*8
Operadores: 

    ==  : Igualdade
    !=  : Diferente
    <   : menor que
    >   : maior que
    <=  : menor ou igual que
    >=  : maior ou igual que
    
 */


package basico;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EstruturaControleLacos {

	public static void main(String[] args) {
		
		/** 
		
		int num, dados = 5;
		
		// = -> num = 2; 
		// == -> num == 5 
		
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:  "));
		
		if(num <= dados) {
			
			// INSTRUÇÃO ...
			JOptionPane.showMessageDialog(null, "Número igual a  é 5");
		} else {
			
			// INSTRUÇÃO
			JOptionPane.showMessageDialog(null, "Número informado é maior que  5");
			
		}
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	// Aula 16: Estrutura de Controle SWITCH
		
		/**
		 
		 
		 	switch(opcao){
		 	
		 		case 1: Instrucao1;
		 				break;
		 				
		 		case 2: Instrucao2;
		 				break;	
		 				
		 		case 3: Instrucao3;
		 				break;	
		 				
		 		case N: InstrucaoN;
		 				break;	
		 				
		 		default: CasoNaoAtendaIntrucaoes;
		 				 break;			
		 	}
			 
		 
		 */
		
		
		
		/**
		 
		 
		 
		int opcao;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção de  1 a 4 :  "));
		
		
		switch(opcao) {
		
		case 1: JOptionPane.showMessageDialog(null, "Valor informado é 1");
				break;
				
		case 2: JOptionPane.showMessageDialog(null, "Valor informado é 2");
		break;		
		
		case 3: JOptionPane.showMessageDialog(null, "Valor informado é 3");
		break;
		
		case 4: JOptionPane.showMessageDialog(null, "Valor informado é 4");
		break;
		
		default: JOptionPane.showMessageDialog(null, "Valor informado não disponível no MENU ");
		
		
		}
		
		
		*/
		
		
		
		
		
		
		
		
		

		// Aula 17: Laço While
		
		
		/**
		 	 
		 	 while(condicao) {
		 	 	
		 	 	Instrucao;
		 	 
		 	 }
		 
		 
		 
		 */
		
		
		/**
		
		
		// Programa para exibir 10 valores
		
		int i = 10;
		
		while(i >= 1) {
			
			System.out.println(i); // 1 2 3 4  10
			i--;
		}
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// Aula 18: Laço Do While
		
		
		/**
		
		do {
			
			// instrução
			
		} while(condicao);
		
		
		*/
		
		
		
		/** 
		
		int i = 50;
		
		
		do {
			
		   // Instrução 
			System.out.println(i); // 1 2 
			i--;
			
			
			
		} while(i>=1);
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Aula 19:  Laço FOR
		
		
				/**
				 	
				 	for(inicia; condicao; decremento ou incremento){
				 	
				 		Instrucao;
				 	
				 	}
				 
				 
				 
				 */
		
		
		// int i;
		
		for(int i = 1; i < 10; i ++) {  // 1 2 3 
			
			// Instrução
			System.out.println(i); // 1 
			
			}
		
		
		
		
		

	}

}
