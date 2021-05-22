package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o pre�o do litro da gasolina e volar total pago.
 * Calcular e exibir o total de litros abastecidos.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/0/2021
 */

public class Exercicio25 {

	/*
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a vari�vel
		double preco, valor, litros;

		// Atribuindo valor a variavel
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o do litro da gasolina: "));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total pago pela gasolina:"));

		// calcular o total de litros abastecidos
		litros = valor / preco;

		// Exibe o total de litros abastecidos para o usuario
		JOptionPane.showMessageDialog(null, "O total de litros abastecidos foi de " + litros + " litros");

	}
}
