package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir o valor do modulo de dois numeros
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */

public class Exercicio14 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		double num;

		// Atribuindo valor a variável
		num = 6;

		// calculando o modulo das variáveis
		num = num % 2;

		// Exibindo o resultado da divisão para o usuario
		JOptionPane.showMessageDialog(null, "O modulo da divisão do numero 6 por 2 é: " + num);
	}
}