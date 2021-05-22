package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores do usuario e exibir o valor da divis�o
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */

public class Exercicio12 {

	/*
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		double valor1, valor2, res;

		// Atribuindo valor para as vari�veis
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero:"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero:"));

		// Calculando a divis�o das vari�veis
		res = valor1 / valor2;

		// Exibindo o resultado da divis�o para o usuario
		JOptionPane.showMessageDialog(null, "A divis�o do primeiro pelo segundo numero digitado �: " + res);

	}
}
