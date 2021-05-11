
package basico;

import java.util.Scanner;

public class Aula11 {

	
	public static void main(String[] args) {
		
		/**
		
		// Aula 11: Operadores Aritméticos
		
		Scanner entradaDados = new Scanner(System.in);
		
		float valorA, valorB, soma, div, resto, mult, sub;
		
		System.out.print("Informe dois valores:  ");
		
		valorA = entradaDados.nextFloat();
		valorB = entradaDados.nextFloat();
		
		soma = valorA + valorB;
		div = valorA / valorB;
		mult = valorA * valorB;
		sub = valorA - valorB;
		resto = valorA % valorB;
		
		
		System.out.println("A soma dos valores é: "+soma);
		System.out.println("A Divisão dos valores é: "+div);
		System.out.println("A Multiplicação dos valores é: "+ mult);
		System.out.println("A Aubtração dos valores é: "+sub);
		System.out.println("O resto dos valores é: "+resto);
		
		
		
		
		
		// Aula 12:  Operadores Aritméticos com Asignação
		
		
		int valor = 10;
		
		// valor = valor + 5;
		
		// valor += 5;
		// valor -= 3; 
		// valor *= 2;
		valor /= 2;
		
		
		System.out.print(valor);
		
		
		
		
		
		// Aula 13: Operadores de Incremento e Decremento
		
		int valor = 5;
		
		// valor++; // valor +=1;
		
		valor--; // valor -=1;
		
		System.out.print(valor);
		
		
		*/
		
		
		// Aula 14: Clase Math em Java
		
		/**
		
		// RAIZ QUADRADA:
		
		// Método sqrt
		
		// double raizValor = Math.sqrt(9);
		
		int raizValor = (int)Math.sqrt(9);
		
		System.out.print(raizValor);
		
	
		
		// POTENCIA DE UM VALOR:
		
		double valorBase = 3, valorExpoente = 3;
		
		double res = Math.pow(valorBase,valorExpoente );
		
		System.out.print(res);
		
		
		
		
		// Redondar um Valor:
		
		//double valor = 5.85;
		
		// long res = Math.round(valor);
		
		float valorFloat = 8.92f;
		
		int res = Math.round(valorFloat);
		
		System.out.print(res);
		
		
			*/
		
		
		// Gera valores aleatórios
		
		double gerarvalor = Math.random();
		
		System.out.print(gerarvalor);

	}

}
