package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstra o uso do comando If Else
 * 
 * @author lavilla
 * @since 08/02/2021
 */

public class CondicionalIfElseEncadeado {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		double imc, altura, peso;

		// Capturando os dados do usuario
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));

		// Calculando o IMC
		imc = peso / Math.pow(altura, 2);

		// Exibir o resultado do IMC
		if (imc > 18.5) {
			JOptionPane.showMessageDialog(null, "Abaioxo do peso!");
		} else if ((imc >= 18.5) && (imc <= 24.9)) {
			JOptionPane.showMessageDialog(null, "Peso ideal!");
		} else if ((imc >= 25) && (imc <= 29.9)) {
			JOptionPane.showMessageDialog(null, "Acima do peso!");
		} else if ((imc >= 30) && (imc <= 34.9)) {
			JOptionPane.showMessageDialog(null, "Obesidade Nivel 1!");
		} else {
			JOptionPane.showMessageDialog(null, "Obesidade Mórbida!");
		}

	}

}
