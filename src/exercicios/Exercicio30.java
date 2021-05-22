package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a temperatura em celsius e exibir em Fahrenheit
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/0/2021
 */

public class Exercicio30 {

	/*
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a vari�vel
		double temperatura;

		// Atribuindo valor a variavel
		temperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus celsius: "));

		// calcular a convers�o da temperatura
		temperatura = (temperatura * 9 / 5) + 32;

		// Exibe a temperatura convertida de graus celsus para Fahrenheit para o usuario
		JOptionPane.showMessageDialog(null,
				"A emperatura em graus celsius convertida para Fahrenheit � " + temperatura + " F�");

	}
}