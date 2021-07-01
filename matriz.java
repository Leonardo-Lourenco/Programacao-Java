/**
 * 
 */
package basico;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class matriz {

	
	public static void main(String[] args) {
		
		/** 
		 
		 // PRIMEIRA FORMA MANUAL
		
		int matriz[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		for(int i = 0; i<3; i++) {
			
			for(int j =0; j<3; j++) {
				
				
				System.out.print(matriz[i][j]);
				
			}
			
			System.out.println("");
		}
		
		
		
		*/
		
		
		
		
		
		// SEGUNDA FORMA PEDINDO PARA PESSOA INFORMAR O TAMANHO E VALORES DA MATRIZ
		
		Scanner entrada = new Scanner(System.in);
		
        int matriz[][], nLinhas, nColunas;
        
        
        nLinhas = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas LINHAS:  "));
        nColunas = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas COLUNAS:  "));
        
        matriz = new int[nLinhas][nColunas];
        
		
        System.out.println("Informe os valores da MATRIZ");
        
		for(int i = 0; i<nLinhas; i++) {
			
			for(int j =0; j<nColunas; j++) {
				
				
				System.out.print("Matriz  [ "+i+"] [" +j+"]: ");
				matriz[i][j] = entrada.nextInt();
				
			}
			
		}
		
		
		System.out.println("Exibindo valores da Matriz");
		
       for(int i = 0; i<nLinhas; i++) {
			
			for(int j =0; j<nColunas; j++) {
				
				
				System.out.print(matriz[i][j]);
				
			}
			
			System.out.println("");
		}
		
		
		
			
		
	}

}
