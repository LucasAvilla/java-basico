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
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a variável
		int num;

		// atribuindo valor a variável
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));

		// Calculando o antecessor da variável
		num = num - 1;

		// Exibindo o numero antecessor para o usuario
		JOptionPane.showMessageDialog(null, "O antecessor do numero digitado é " + num);
	}

}
