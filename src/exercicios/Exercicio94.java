package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor N qualquer (que será o tamanho dos vetores). Após,
 * ler dois vetores A e B (de tamanho N cada um) e depois armazenar em um
 * terceiro vetor SOMA a soma dos elementos do vetor A com os do vetor B
 * (respeitando as mesmas posições) e escrever o vetor Soma.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 12/02/2021
 */

public class Exercicio94 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando o vetor
		double vetorA[], vetorB[], vetorC[];
		int n;

		n = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho dos vetores:"));

		// inicializando os vetores
		vetorA = new double[n];
		vetorB = new double[n];
		vetorC = new double[n];

		// Valorizando o vetorA com os dados do usuario
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para o vetor A:"));
		}

		// Valorizando o vetorB com os dados do usuario
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para o vetor B:"));
		}

		// VetorC recebe a soma dos vetores A e B e armazena
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}

		// Exibindo o resultado da soma armazenada no vetorC para o usuario
		for (int i = vetorC.length - 1; i >= 0; i--) {
			System.out.println(vetorC[i]);
		}
	}
}
