package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o numero total de mercadorias e o valor de cada uma.
 * Calcular o valor total do estoque e a media de valor das mercadorias.
 * 
 * @author Lucs Igor A M Nogueira
 * @since 10/02/2021
 */

public class Exercicio80 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando e inicializando as variáveis
		double valor = 0;
		int quantidade;

		// Solicita ao usuario o quantidade total de mercadorias no estoque
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de mercadorias:"));

		for (int i = 0; i < quantidade; i++) {// laço de repetição para incrementar o valor das mercadorias
			valor += Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da mercadoria: R$ "));
		}

		// Calcula e exibe o valor total do estoque e a media do valor de cada
		// mercadoria
		JOptionPane.showMessageDialog(null, "O valor total de mercadorias em estoque é: R$ " + valor + "\n"	+ 
											"A media do valor das mercadorias é R$: " + valor / quantidade);

	}

}
