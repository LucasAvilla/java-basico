package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores do usuario e exibir o valor da soma
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */

public class Exercicio09 {

	/*
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		double valor1, valor2, res;

		// Atribuindo valor para as vari�veis
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero:"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero:"));

		// Calculando a soma das vari�veis
		res = valor1 + valor2;

		// Exibindo o resultado da soma para o usuario
		JOptionPane.showMessageDialog(null, "A soma dos numeros digitados �: " + res);

	}

}
