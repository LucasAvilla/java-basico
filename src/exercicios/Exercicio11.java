package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores do usuario e exibir o valor da
 * multiplica��o
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */

public class Exercicio11 {

	/*
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		double valor1, valor2, res;

		// Atribuindo valor para as vari�veis
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero:"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero:"));

		// Calculando a multiplica��o das vari�veis
		res = valor1 * valor2;

		// Exibindo o resultado da multiplica��o para o usuario
		JOptionPane.showMessageDialog(null, "A multiplica��o dos numeros digitados �: " + res);

	}
}
