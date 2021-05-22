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
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		int idade;
		double altura, peso;

		// Atribuindo valor para as variáveis
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso:"));

		// Exibindo informações para o usuario no console
		System.out.println("Sua idade é: " + idade + " Anos." + "\n" + 
						   "Sua altura é de: " + altura + " m." + "\n" +
						   "Seu peso é: " + peso + " Kg.");

	}

}
