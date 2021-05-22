package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores do usuario e exibir o valor da
 * multiplicação
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */

public class Exercicio11 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		double valor1, valor2, res;

		// Atribuindo valor para as variáveis
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero:"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero:"));

		// Calculando a multiplicação das variáveis
		res = valor1 * valor2;

		// Exibindo o resultado da multiplicação para o usuario
		JOptionPane.showMessageDialog(null, "A multiplicação dos numeros digitados é: " + res);

	}
}
