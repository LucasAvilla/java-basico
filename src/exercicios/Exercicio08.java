package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o salario e vale-refei��o do usuario e exibir no
 * console 
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */

public class Exercicio08 {

	/*
	 * M�todo principal para executar o program
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		double salario, vale;

		// Atribuindo valor para as vari�veis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario R$:"));
		vale = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do seu vale-refei��o R$:"));

		// Exibindo informa��es para o usuario no console
		System.out.println("Seu salario � de R$ " + salario + "\n" +
							"Seu vale-refei��o � de R$ " + vale);

	}

}
