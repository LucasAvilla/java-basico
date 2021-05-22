package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o salario e vale-refeição do usuario e exibir no
 * console 
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */

public class Exercicio08 {

	/*
	 * Método principal para executar o program
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		double salario, vale;

		// Atribuindo valor para as variáveis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario R$:"));
		vale = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do seu vale-refeição R$:"));

		// Exibindo informações para o usuario no console
		System.out.println("Seu salario é de R$ " + salario + "\n" +
							"Seu vale-refeição é de R$ " + vale);

	}

}
