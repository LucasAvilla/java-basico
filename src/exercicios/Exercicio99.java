package exercicios;

import javax.swing.JOptionPane;

/**
 * Faça um programa para ler um vetor de 10 números. Após isto, ler mais um
 * número qualquer, calcular e escrever quantas vezes esse número aparece no
 * vetor.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 12/02/2021
 */

public class Exercicio99 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando o vetor
		double vetor[], num;
		int contador = 0;

		// Inicializando e definindo o tamanho dos vetores
		vetor = new double[10];

		// Valorizando as posições do vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para o vetor:"));
		}

		// Armazenando valor da variável x
		num = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja buscar:"));

		// Varrendo o vetor para verificar os registros
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == num) {
				contador++;
			}
		}

		// Exibe para o usuario o nuimero de vezes que o numero escolhido aparece no
		// vetor
		JOptionPane.showMessageDialog(null, "O numero informado aparece no vetor: " + contador + " vezes");

	}
}
