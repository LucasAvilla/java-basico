package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber quantidade de camisetas P, M e G vendidas e exibir o
 * valor da venda
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/0/2021
 */

public class Exercicio27 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a variável
		int p, m, g, valor;

		// Atribuindo valor a variavel
		p = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de camisetas vendidas P:"));
		m = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de camisetas vendidas M:"));
		g = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de camisetas vendidas G:"));

		//Calcular o valor total das vendas das camisetas
		valor = (p * 10) + (m * 12) + (g * 15);

		// Exibe o total de dias para o usuario
		JOptionPane.showMessageDialog(null, "O total arrecadado com a venda foi de R$ " + valor);

	}
}
