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
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		String nome;
		int celular;
		String cidade;

		// Atribuindo valores as vari�veis
		nome = JOptionPane.showInputDialog("Informe qual o seu nome:");
		celular = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu celular:"));
		cidade = JOptionPane.showInputDialog("Informe qual a sua cidade:");

		// Exibindo informa��es para o usuario no console
		System.out
				.println("Seu nome �: " + nome + "\n" + 
						 "Seu celular �: " + celular + "\n" + 
						 "Sua cidade �: " + cidade);


	}
}
