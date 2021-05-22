package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber os tipos de moedas guardadas, calcular e exibir o total
 * para o usuario.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 06/02/2021
 */

public class Exercicio33 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		int moeda01, moeda05, moeda10, moeda25, moeda50, moeda1;
		double total;

		// Atribuindo valor para as variáveis
		moeda01 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 0,01 centavo guardadas:"));
		moeda05 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 0,05 centavo guardadas:"));
		moeda10 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 0,10 centavo guardadas:"));
		moeda25 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 0,25 centavo guardadas:"));
		moeda50 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 0,50 centavo guardadas:"));
		moeda1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 1 real guardadas:"));

		// Calculando o valor total de moedas guardadas
		total = (moeda01 * 0.01) + (moeda05 * 0.05) + (moeda10 * 0.1) + (moeda25 * 0.25) + (moeda50 * 0.5)
				+ (moeda1 * 1);

		// Exibindo o valor total de moedas guardadas para o usuario
		JOptionPane.showMessageDialog(null, "O valor total de moedas poupadas foi de R$ " + total);

	}
}
