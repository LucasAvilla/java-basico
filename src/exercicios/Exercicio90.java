package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 20 numeros positivos e exibir o maior valor e a posição
 * no vetor
 * 
 * @author Lucas Igor A M Nogueira
 * @since 11/02/2021
 */

public class Exercicio90 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando o vetor
		double maior = 0, vetor[];

		// inicializando e definindo o tamanho do vetor
		vetor = new double[20];

		// Valorizando as posições do vetor
		for (int i = 0; i < vetor.length; i++) {
			do {
				vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do vetor:"));
			} while (vetor[i] < 0);// laço de repetição em quanto nao for informado um valor valido

			if (vetor[i] > maior) {// Verifica se o numero informado é o maior
				maior = vetor[i];
			}
		}

		// Varrendo o vetor para verificar os registros
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == maior) {

				// Exibe para o usuario o maior valor e sua posição
				JOptionPane.showMessageDialog(null, "O maior valor é " + maior + "\n" + 
													"No vetor de posição " + i);
			}
		}
	}

}
