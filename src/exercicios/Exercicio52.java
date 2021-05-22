package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber tres valores e exibir em ordem crescente para o usuario
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio52 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as variáveis
		double num1, num2, num3;

		// solicita ao usuario tres numeros distintos e atribui as variáveis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero:"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero diferente:"));
		num3 = Double.parseDouble(JOptionPane.showInputDialog("Informe um ultimo numero diferente dos anteriores:"));

		// Verifica os numeros informados e exibi-os em ordem crescente para o usuario
		if ((num1 < num2) && (num1 < num3) && (num2 < num3)) {
			JOptionPane.showMessageDialog(null, "Os mumeros em ordem crescente é " + num1 + ", " + num2 + " e " + num3);
		} else if ((num1 < num2) && (num1 < num3) && (num3 < num2)) {
			JOptionPane.showMessageDialog(null, "Os mumeros em ordem crescente é " + num1 + ", " + num3 + " e " + num2);
		} else if ((num2 < num1) && (num2 < num3) && (num1 < num3)) {
			JOptionPane.showMessageDialog(null, "Os mumeros em ordem crescente é " + num2 + ", " + num1 + " e " + num3);
		} else if ((num2 < num1) && (num2 < num3) && (num3 < num1)) {
			JOptionPane.showMessageDialog(null, "Os mumeros em ordem crescente é " + num2 + ", " + num3 + " e " + num1);
		} else if ((num3 < num1) && (num3 < num2) && (num1 < num2)) {
			JOptionPane.showMessageDialog(null, "Os mumeros em ordem crescente é " + num3 + ", " + num1 + " e " + num2);
		} else {
			JOptionPane.showMessageDialog(null, "Os mumeros em ordem crescente é " + num3 + ", " + num2 + " e " + num1);
		}

	}

}
