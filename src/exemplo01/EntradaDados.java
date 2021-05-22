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
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando vari�vel
		String nome;

		// Atribuir valor para vari�vel nome informado pelo usuario
		nome = JOptionPane.showInputDialog("Digite o seu nome:");

		// Exibindo dados no console
		System.out.println("Seu nome �: " + nome);

	}

}
