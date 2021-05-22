package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a quantidade de sanduiches e exibir o total de recheio
 * para produzir os sanduiches
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/0/2021
 */

public class Exercicio29 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a variável
		int sanduiches;
		double queijo, presunto, carne;

		// Atribuindo valor a variavel
		sanduiches = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de sanduiches a serem feitos: "));

		// calcular o total de recheio em kg
		queijo = sanduiches * (0.05 * 2);
		presunto = sanduiches * 0.05;
		carne = sanduiches * (0.05 * 2);

		// Exibe o total de recheio para produzir os sanduiches para o usuario
		JOptionPane.showMessageDialog(null, "A quantidade necessaria de recheio para " + sanduiches + " sanduiches são:" + "\n" + 
											 queijo + " Kg de queijo" + "\n" + 
											 presunto + " Kg de presunto" + "\n" + 
											 carne + " Kg carne");
	}

}
