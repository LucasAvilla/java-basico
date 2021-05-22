package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a quantidade de cada tipo de fruta em kg. Calcular o
 * valor pago total e exibir para o usuario
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio59 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as variáveis
		double morangoKg, macaKg, valorMorg, valorMaca, valortotal;

		// Solicita ao usuario quantos kg de cada fruta comprou
		morangoKg = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso do morango:"));
		macaKg = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da maçã:"));

		// Verifica o peso da fruta comprada, calcula o valor do Kg e atribui a variável
		if (morangoKg <= 5) {
			valorMorg = morangoKg * 2.50;
		} else {
			valorMorg = morangoKg * 2.20;
		}

		if (macaKg <= 5) {
			valorMaca = macaKg * 1.80;
		} else {
			valorMaca = macaKg * 1.50;
		}

		// Verifica se é aplicavel o segundo nivel de descontos
		if ((morangoKg + macaKg >= 8) || (valorMorg + valorMaca > 25)) {
			valortotal = (valorMorg + valorMaca) - (((valorMorg + valorMaca) * 25) / 100);
		} else {
			valortotal = valorMorg + valorMaca;
		}

		// Exibe para o usuario o valor total que deve ser pago pela compra
		JOptionPane.showMessageDialog(null, "O valor a ser pago pelo cliente é de R$ " + valortotal);

	}

}
