package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e exibi-los em ordem crescente para o
 * usuario
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */
public class Exercicio42 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as variáveis
		double num1, num2;

		// Atribuindo valor para as variáveis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primerio numero:"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero:"));

		// Verificando os valores e exibindo-os em ordem crescente
		if (num1 == num2) {
			JOptionPane.showMessageDialog(null, "Valores iguais, informar valores distintos.");
		} else if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "Os numeros em ordem crescente são: " + num2 + " e " + num1);
		} else {
			JOptionPane.showMessageDialog(null, "Os numeros em ordem crescente são: " + num1 + " e " + num2);
		}

	}
}
