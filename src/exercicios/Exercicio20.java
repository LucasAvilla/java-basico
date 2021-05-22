package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para converter dolar em real
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/0/2021
 */

public class Exercicio20 {

	/*
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a vari�vel
		double valor;

		// Atribuindo valor a variavel
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor em dolar: $"));

		// calular a convers�o do valor para Reais
		valor = 6.61 * valor;

		// Exibe o valor do dolar convertido em reais
		JOptionPane.showMessageDialog(null, "O valor convertido em reais � de: R$ " + valor);

	}
}
