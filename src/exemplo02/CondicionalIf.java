package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o uso do comando If
 * 
 * @author lavilla
 * @since 08/02/2021
 */
public class CondicionalIf {

	/*
	 * M�todo principal para execu��o do programa
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		double imc, altura, peso;

		// Capturando as informa��es do usuario
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));

		// Calculando o IMC
		imc = peso / Math.pow(altura, 2);

		// Exibir o resultado do IMC
		if (imc > 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso!");
		}

		if ((imc >= 18.5) && (imc <= 24.9)) {
			JOptionPane.showMessageDialog(null, "Peso ideal!");
		}
	}
}
