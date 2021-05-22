package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber idade, altura e peso do usuario e exibir no no console
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */
public class Exercicio07 {

	/*
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		int idade;
		double altura, peso;

		// Atribuindo valor para as vari�veis
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso:"));

		// Exibindo informa��es para o usuario no console
		System.out.println("Sua idade �: " + idade + " Anos." + "\n" + 
						   "Sua altura � de: " + altura + " m." + "\n" +
						   "Seu peso �: " + peso + " Kg.");

	}

}
