package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber do usuario seu nome, celular e cidade e exibir no
 * console
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 *
 */

public class Exercicio06 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		String nome;
		int celular;
		String cidade;

		// Atribuindo valores as variáveis
		nome = JOptionPane.showInputDialog("Informe qual o seu nome:");
		celular = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu celular:"));
		cidade = JOptionPane.showInputDialog("Informe qual a sua cidade:");

		// Exibindo informações para o usuario no console
		System.out
				.println("Seu nome é: " + nome + "\n" + 
						 "Seu celular é: " + celular + "\n" + 
						 "Sua cidade é: " + cidade);


	}
}
