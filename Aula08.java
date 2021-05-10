
package basico;

// Aula 08: Entrada e Saída de dados

import java.util.Scanner;

public class Aula08 {

	
	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		
		int valor;
		
		System.out.print("Digite um número: ");
		valor = entradaDados.nextInt();
		
		System.out.println("O valor informado é: " +valor);
		
		
		System.out.println("");
		
		// Dados do Tipo FLOAT
		
		Scanner entradaDadosFloat = new Scanner(System.in);
		
		//float valorFloat;
		double valorFloat;
		
		System.out.print("Digite um número do tipo float: ");
		valorFloat = entradaDadosFloat.nextDouble();
		
		System.out.println("O valor informado é: " +valorFloat);
		
		
		
		System.out.println("");
		
		
		// Cadeias de Caracteres
		
		
		Scanner entradaDadosTexto = new Scanner(System.in);
		
		String texto;
		
		System.out.print("Digite os textos: ");
		texto =  entradaDadosTexto.nextLine();
		
		System.out.print("Textos informadoa são: " + texto);
		
		
		
		System.out.println("");
		
		
		Scanner entradaDadosLetra = new Scanner(System.in);
		
		char letra;
		
		System.out.print("Digite uma letra:  ");
		letra = entradaDadosLetra.next().charAt(0);
		
		System.out.print("A letra informada é: "+ letra);
		
		
		

	}

}
