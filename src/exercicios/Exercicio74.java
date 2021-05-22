package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 10 valores, calcular e exibir a media aritmética desses
 * valores.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class Exercicio74 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		int valor = 0;
		double media;

		// Solicita os valores para o usuario
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
			valor = valor + i;// incrementa o valor digitado ao numero
		}

		// Calcula a media dos numeros digitados
		media = valor / 10;

		// Exibe a media dos numeros digitados para o usuario
		JOptionPane.showMessageDialog(null, "A media dos numeros digitados é: " + media);

	}

}
