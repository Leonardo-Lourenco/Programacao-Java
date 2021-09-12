package basico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class DesafiosExercicios {

	
	public static void main(String[] args) {
		
		/**
		
		
		Exercícios 01:
		
		Você foi contratado por uma Escola para criar um programa, onde o professor 
		informe as notas dos Alunos de três avaliações, e após o professor informar está 
		nota o programa deverá calcular a Média das Notas e exibir na tela.
	
	
	 
		
		
		Scanner informarNotas = new Scanner(System.in);
		
		float nota1, nota2, nota3, media;
		
		System.out.print("Informar as 3 notas: ");
		
		nota1 = informarNotas.nextFloat();
		nota2 = informarNotas.nextFloat();
		nota3 = informarNotas.nextFloat();
		
		
		media =  (nota1 + nota2 + nota3) / 3;
		
		System.out.print("A média das Notas é:  "+media);
		
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/**
		
		
		Exercícios 02:
		
		Uma empresa precisa calcular o Salário de seus funcionários com Base nas
		horas trabalhadas por semana.
		
		Você foi contratado para resolver este problema e criar um programa para
		fazer estes cálculos.
		
		Se uma pessoa trabalha 40 horas ou menos por semana, irá receber R$ 16,00 por cada
		hora trabalhada.
		
		Se uma pessoa trabalhar mais de 40 horas semanais, ela irá receber R$ 16 por cada uma das 
		primeiras 40 horas e R$ 20,00 por cada hora extra.
		
		O programa deverá efetuar este cálculo e exibir na tela.
	
	
	
		
		
		
		int horasTrabalhadas;
		float salarioTotal;
		
		horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Informe as horas trabalhadas: "));
		
		if(horasTrabalhadas <= 40) {
			
			salarioTotal = horasTrabalhadas * 16;
			
			
		}else {
			
			
			salarioTotal = (40*16) + ((horasTrabalhadas - 40)*20);
			
		}
		
		
		JOptionPane.showMessageDialog(null, "O salário total do funcionário é:  "+salarioTotal);
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/**
		
		
		// Exercício 03
		

        Caixa Eletrônico:

        Crie um Programa que simule um caixa eletrônico, onde o saldo inicial será de R$ 150,00 reais, 
        o caixa deverá conter um Menu onde tenha as seguintes opções:

    	   1 - Depositar dinheiro
    	   2 - Efetuar Saque
    	   3 - Sair.

		
		
		
		
		final int saldoInicial = 150;
		
		int opcao;
		float depositar, saldoDisponivel, saque;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Caixa Eletronico: \n" 
				+ "1 - Depositar \n"
				+ "2 - Sacar \n"
				+ "Sair/n"));
		
		
		switch(opcao){
		
		case 1: depositar = Float.parseFloat(JOptionPane.showInputDialog(null, "Deseja depositar quanto? "));
							
				saldoDisponivel = saldoInicial + depositar; 
				JOptionPane.showMessageDialog(null, "Seu saldo é: " + saldoDisponivel);			
			
			break;
			
		case 2: saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Deseja sacar quanta? "));
		        
			if(saque > saldoInicial) {
				
				
				JOptionPane.showMessageDialog(null, "Valor indisponível para saque ");
				
						
				
			}else {
				
				saldoDisponivel = saldoInicial - saque;
				
				JOptionPane.showMessageDialog(null, "Saque realizzado com sucesso " + saldoDisponivel);
				
				
			}	
		
			break;
			
		case 3:
			break;
			
		default: JOptionPane.showMessageDialog(null, "Opção informada não disponível no MENU");	
			
			
			
			
		}
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Exercício 04:
		
		
				/**
				
						Criar um programa para identificar se o valor informado é PAR ou
						ÍMPAR , o mesmo deve ficar rodando e só pode encerrar quando
						a pessoa digitar 0;
						
				
				
				 
				 */
		
		
		int valor;
		
		valor =  Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		
		while (valor != 0) {
			
			
			if( valor %2 == 0) {
				
				 System.out.println("Valor" + valor + "é PAR");
				
				
			}else {
				
				 System.out.println("Valor" + valor + "é ÍMPAR");
				
				
			}
			
			
			valor =  Integer.parseInt(JOptionPane.showInputDialog("Digite outro um valor: "));
			
		}
		
		
		
		
		
		
		
		
		

	}

}
