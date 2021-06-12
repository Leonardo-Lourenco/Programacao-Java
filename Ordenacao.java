/**
 * 
 */
package basico;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ordenacao {

	
	public static void main(String[] args) {
		
		// AULA 29 : ORDENAÇÃO BUBBLE SORT
		
		// { 8, 9, 3 }
		
		
		Scanner entrada = new Scanner(System.in);
		int vet[],qtdElementos, aux;
		
		qtdElementos = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetro: "));
		
		// pega o valor informado e guardar nesta variavel
		vet = new int[qtdElementos];
		
		for(int i =0;i<qtdElementos;i++) {
			
			System.out.println((i+1)+ " . Digite um valor: ");
			vet[i] = entrada.nextInt();
			
			
		}
		
		
		// Método BUBLLE SORT
		
		for(int i =0; i<(qtdElementos-1); i++) {
			
			for(int j =0;j<(qtdElementos-1); j++ ) {
				
				if(vet[j] > vet[j +1]) { // valor atual > valor seguinte = troca as posições
					
					aux = vet[j];
					vet[j] = vet[j +1];
					vet[j+1] = aux;
					
					
					
					
				}
				
				
			}
			
			
		}
		
		//Exibindo valores em ordem crescente
		
		System.out.println("Valores em ORDEM CRESCENTE");
		
		for(int i =0; i<qtdElementos; i++) {
			
			System.out.println(vet[i]+ "  -  ");
			
		}
		
		
		// Exibindo valores em ORDEM DESCRESCENTE
		System.out.println("Valores em ORDEM DECRESCENTE");
		
		
	   for(int i =(qtdElementos-1); i>=0; i--) {
			
			System.out.println(vet[i]+ "  -  ");
			
		}
		
		

	}

}
