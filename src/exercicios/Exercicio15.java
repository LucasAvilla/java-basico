package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um numero e exibir seu antecessor.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */

public class Exercicio15 {

	/*
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a vari�vel
		int num;

		// atribuindo valor a vari�vel
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));

		// Calculando o antecessor da vari�vel
		num = num - 1;

		// Exibindo o numero antecessor para o usuario
		JOptionPane.showMessageDialog(null, "O antecessor do numero digitado � " + num);
	}

}
