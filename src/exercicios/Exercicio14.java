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
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		double num;

		// Atribuindo valor a vari�vel
		num = 6;

		// calculando o modulo das vari�veis
		num = num % 2;

		// Exibindo o resultado da divis�o para o usuario
		JOptionPane.showMessageDialog(null, "O modulo da divis�o do numero 6 por 2 �: " + num);
	}
}