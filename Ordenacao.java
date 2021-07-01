/**
 * 
 */
package basico;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ordenacao {

	
	public static void main(String[] args) {
		
	/**
	
		
		
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
		
	
	
	
	 */
		
		
		
		
		
	
		
	/**
	
	
	
		
	
	// AULA 30 : Ordenação por Inserção - Insertion Sort 
		
	
	Scanner entrada = new Scanner(System.in);
	
	int vet [], qtdElementos, aux, pos;
	
	qtdElementos = Integer.parseInt(JOptionPane.showInputDialog("Informe otamanho do VETOR"));
	
	vet = new int[qtdElementos];
	
	//  Informar os valores do VETOR
	
	for(int i =0; i<qtdElementos; i++) {
		
		System.out.println((i+1)+ ". Digite um número: ");
		vet[i] = entrada.nextInt();
	}
	
	
	for(int i =0; i < qtdElementos; i++) {
		
		pos = i;
		aux = vet[i];
		
		while((pos > 0) && vet[pos-1]> aux) {
			
			vet[pos] = vet[pos-1];
			pos --;
			
			
			
		}
		
		vet[pos] = aux;
		
	}
		
	
	// Exibindo valores:
	
	System.out.println("ORDEM CRESCENTE");
	
	for(int i =0; i< qtdElementos; i++) {
		System.out.print(vet[i]+ "  -  ");
		
		
	}
	
	// 	Exibindo em ORDEM DSCRESCENTE
	
	System.out.println("ORDEM CRESCENTE");
	
	for(int i = (qtdElementos-1); i>=0; i --) {
		System.out.print(vet[i]+ "  -  ");
		
		
	}
	
	
	
	 
	 */
		
		
		
		
		
		
		
		
	
	
	
		
		
		
	//  Aula 31: Busca Sequencial 	

		
	
	int vetor[] = {  8, 5, 1,  7, 6}; 
	int valor;
	boolean encontrarValor = false;
	
	valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja encontrar?"));
	
	
	// buscar este valor
	
	int i =0;
	
	while(i<5 && encontrarValor == false) {
		
		if(vetor[i] == valor) {
			
			encontrarValor = true;
			
			
		}
		
		i ++;
		
	};
	
	if(encontrarValor ==  false) {
		
		
		JOptionPane.showMessageDialog(null, "Valor informado não existe no VETOR");
		
		
		
	} else {
		
		JOptionPane.showMessageDialog(null, "Valor informado encontrado no VETOR"+(-1));
		
	}
	
	
		
		

	}

}
