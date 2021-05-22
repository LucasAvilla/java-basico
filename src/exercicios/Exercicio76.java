package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 10 numeros, calcular e exibir a soma total dos numeros.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class Exercicio76 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		int valor = 0;

		// Solicita os valores para o usuario e calcula a soma
		for (int i = 1; i < 11; i++) {
			valor += Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));

		}

		// Exibe a soma dos numeros para o usuario
		JOptionPane.showMessageDialog(null, "A soma dos numeros digitados é: " + valor);

	}

}
