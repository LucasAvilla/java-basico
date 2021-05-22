package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber quantos litros e o tipo de combustivel abastecidos.
 * Calcular e exibir o valor pago para o usuario
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio57 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as variáveis
		String combustivel;
		double litros, total;

		// solicita ao usuario o tipo de combustivel
		combustivel = JOptionPane
				.showInputDialog("Informe o tipo do combustivel:" + "\n" + 
								 "A-alcool" + "\n" + 
								 "G-gasolina");

		litros = Double.parseDouble(JOptionPane.showInputDialog("Informe o quantos litros de combustivel:"));

		// Verifica quantos litros foram abastecidos
		if (litros > 20) {

			// Calcula o valor com base no tipo de combustivel e quantidade < 20 litros
			if (combustivel == "a") {
				total = ((litros * 2.90) * 0.95);
			} else {
				total = ((litros * 3.30) * 0.94);
			}

			// Exibe o valor total gasto em combustivel para o usuario
			JOptionPane.showMessageDialog(null, "O valor a ser pago pelo cliente é de R$ " + total);
		}

		if (litros < 20) {

			// Calcula o valor com base no tipo de combustivel e quantidade <= 20 litros
			if (combustivel == "g") {
				total = ((litros * 3.30) * 0.96);
			} else {
				total = ((litros * 2.90) * 0.97);
			}

			// Exibe o valor total gasto em combustivel para o usuario
			JOptionPane.showMessageDialog(null, "O valor a ser pago pelo cliente é de R$ " + total);

		}

	}

}
