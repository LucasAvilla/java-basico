package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e armazenar em um vetor. Após isto, o programa
 * deve ordenar os números no vetor em ordem crescente. Escrever o vetor
 * ordenado.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 12/02/2021
 */

public class Exercicio95 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando os vetores
		int aux, vetor[];

		// Inicializando e definindo o tamanho dos vetores
		vetor = new int[10];
		aux = 0;

		// lendo os valores do vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor para o vetor:"));
		}

		// Colocando os elementos em ordem
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}

		// Exibindo os valores do vetor em ordem
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}