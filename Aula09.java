
package basico;

// Aula 09 : Entrada e Saída de Dados com JOoptionPane | Soma de 2 Valores |

import javax.swing.JOptionPane;

public class Aula09 {

	
	public static void main(String[] args) {
		
		int valorA;
		int valorB;
		
		valorA = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		valorB = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro  valor: "));
		
		int total = valorA + valorB;
		
		JOptionPane.showMessageDialog(null, "A soma dos valores é: "+ total);
		
		
		
		
		

	}

}
