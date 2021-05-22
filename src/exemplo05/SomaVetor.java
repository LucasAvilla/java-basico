package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a soma de um vetor do tipo inteiro
 * 
 * @author Lucas Igor A M Nogueira
 * @since 11/02/2021
 */

public class SomaVetor {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando o vetor
		int vetor[];

		// Inicializando o vetor e definindo seu tamanho
		vetor = new int[5];

		// Declarando variável auxiliar para soma e inicializando
		int soma = 1;

		// Valorizando as posições do vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
		}
		
		//Soma os valores armazenados no vetor
		for (int i = 0; i < vetor.length; i++) {
			soma *= vetor[i];
		}

		// Exibindo o resultado da soma do vetor
		System.out.println(soma);
	}

}
