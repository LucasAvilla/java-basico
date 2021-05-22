package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a temperatura em Fahrenheit e exibir em graus celsius
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/0/2021
 */

public class Exercicio23 {

	/*
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a vari�vel
		double temperatura;

		// Atribuindo valor a variavel
		temperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit:"));

		// calcular a convers�o da temperatura
		temperatura = (temperatura - 32) / 1.8;

		// Exibe a temperatura convertida em graus celsus para o usuario
		JOptionPane.showMessageDialog(null, "A temperatura Fahrenheit convertida em graus celsius � " + temperatura);

	}
}