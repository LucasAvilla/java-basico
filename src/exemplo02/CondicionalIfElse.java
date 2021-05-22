package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstra o uso do comando If Else
 * 
 * @author lavilla
 * @since 08/02/2021
 */

public class CondicionalIfElse {

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
		} else {
			JOptionPane.showMessageDialog(null, "Peso ideal!");
		}
	}

}
