
package basico;

import javax.swing.JOptionPane;

public class Aula10 {

	
	public static void main(String[] args) {
		
		String texto;
		char letra;
		double ValorDecimal;
		float valorFloat;
		
		texto = JOptionPane.showInputDialog("Digite um texto: ");
		letra = JOptionPane.showInputDialog("Digite uma letra: ").charAt(0);
		ValorDecimal = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor DOUBLE: "));
		valorFloat = Float.parseFloat(JOptionPane.showInputDialog("Informe um valor do tipo FLOAT: "));
		
		System.out.print("");
		
		JOptionPane.showMessageDialog(null, "O texto informado é: " + texto);
		JOptionPane.showMessageDialog(null, "O letra informado é: " + letra);
		JOptionPane.showMessageDialog(null, "O valor  informado DOUBEL é: " + ValorDecimal);
		JOptionPane.showMessageDialog(null, "O valor  informado FLOAT é: " + valorFloat);
		
		
		
		

	}

}
