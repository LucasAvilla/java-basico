package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 20 numeros e exibir na ordem inversa para o usuario
 * 
 * @author Lucas Igor A M Nogueira
 * @since 12/02/2021
 */

public class Exercicio93 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando o vetor
		double vetor[];

		// Inicializando e definindo tamanho do vetor
		vetor = new double[20];

		// Valorizando o vetor com os dados do usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para o vetor:"));
		}

		// Exibindo os dados na ordem inversa para o usuario
		for (int i = vetor.length - 1; i >= 0; i--) {
			System.out.println(vetor[i]);
		}

	}

}
