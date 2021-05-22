package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e exibir o maior deles
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio41 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as vari�veis
		double valor1, valor2;

		// Atribuindo valor para as vari�veis
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primerio valor:"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor:"));

		// Verificando os valores e exibindo o maior deles para o usuario
		if (valor1 == valor2) {
			JOptionPane.showMessageDialog(null, "Valores iguais, informar valores distintos.");
		} else if (valor1 > valor2) {
			JOptionPane.showMessageDialog(null, "O maior valor �: " + valor1);
		} else {
			JOptionPane.showMessageDialog(null, "O maior valor �: " + valor2);
		}

	}

}
