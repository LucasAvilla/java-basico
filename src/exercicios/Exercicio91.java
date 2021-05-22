package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 20 numeros positivos e exibir o menor valor e a posição
 * no vetor
 * 
 * @author Lucas Igor A M Nogueira
 * @since 11/02/2021
 */

public class Exercicio91 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando o vetor e variáveis
		double menor, vetor[];

		// Inicializando e definindo o tamanho do vetor
		vetor = new double[20];

		// Inicializa a auxiliar menor
		menor = vetor[0];

		// Valorizando as posições do vetor
		for (int i = 0; i < vetor.length; i++) {
			do {
				vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do vetor:"));
			} while (vetor[i] < 0);// laço de repetição em quanto nao for informado um valor valido

			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}

		// Varrendo o vetor para verificar os registros
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == menor) {

				// Exibe para o usuario o memor valor e sua posição
				JOptionPane.showMessageDialog(null, "O menor valor é " + menor + "\n" + 
													"No vetor de posição " + i);
			}
		}
	}
}