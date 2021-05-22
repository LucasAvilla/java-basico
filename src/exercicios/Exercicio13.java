package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir o valor da exponencia��o de um numero
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */
public class Exercicio13 {

	/*
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		double num;

		// Atribuindo valor a vari�vel
		num = 6;

		// calculando a exponecia��o da vari�vel
		num = Math.pow(num, 2);

		// Exibindo o resultado da divis�o para o usuario
		JOptionPane.showMessageDialog(null, "A exponencia��o do numero 6 ao quadrado �: " + num);

	}
}
