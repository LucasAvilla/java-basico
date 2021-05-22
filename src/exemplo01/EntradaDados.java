/**
 * 
 */
package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar entrada de dados fornecido pelo usuario
 * 
 * @author lavilla
 * @since 05/02/2021
 */
public class EntradaDados {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando variável
		String nome;

		// Atribuir valor para variável nome informado pelo usuario
		nome = JOptionPane.showInputDialog("Digite o seu nome:");

		// Exibindo dados no console
		System.out.println("Seu nome é: " + nome);

	}

}
