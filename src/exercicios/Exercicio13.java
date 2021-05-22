package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir o valor da exponenciação de um numero
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */
public class Exercicio13 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		double num;

		// Atribuindo valor a variável
		num = 6;

		// calculando a exponeciação da variável
		num = Math.pow(num, 2);

		// Exibindo o resultado da divisão para o usuario
		JOptionPane.showMessageDialog(null, "A exponenciação do numero 6 ao quadrado é: " + num);

	}
}
