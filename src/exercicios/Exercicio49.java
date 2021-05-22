package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber tres valores distintos e exibir o menor
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio49 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as vari�veis
		double num1, num2, num3;

		// solicita ao usuario tres numeros distintos e atribui as vari�veis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero:"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero diferente:"));
		num3 = Double.parseDouble(JOptionPane.showInputDialog("Informe um ultimo numero diferente dos anteriores:"));

		// Verifica os numeros informados e exibi o menor deles para o usuario
		if ((num1 < num2) && (num1 < num3)) {
			JOptionPane.showMessageDialog(null, "O numero " + num1 + " � o menor.");
		} else if ((num2 < num1) && (num2 < num3)) {
			JOptionPane.showMessageDialog(null, "O numero " + num2 + " � o menor.");
		} else {
			JOptionPane.showMessageDialog(null, "O numero " + num3 + " � o menor.");
		}

	}

}
