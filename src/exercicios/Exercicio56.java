package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio56 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as vari�veis
		double num1, num2;

		// Solicita ao usuario que informe dois numeros
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero:"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero:"));

		// Verifica qual dos numeros � maior ou se s�o iguais e exibe uma mensagem para
		// o usuario
		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "O Primeiro � maior");
		} else if (num2 > num1) {
			JOptionPane.showMessageDialog(null, "O Segundo � maior");
		} else {
			JOptionPane.showMessageDialog(null, "Os numeros s�o IGUAIS");
		}

	}

}
