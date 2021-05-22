package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e armazenar em um vetor. Após isto, o programa
 * deve ordenar os números no vetor em ordem crescente. Receber mais um número
 * qualquer e inserir esse novo número mantendo a ordem crescente do vetor.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 12/02/2021
 */

public class Exercicio96 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando os vetores
		int num, aux, vetor[];

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

		// Solicita para o usuario um novo numero para ser incluido no vetor
		num = Integer.parseInt(JOptionPane.showInputDialog("Informe um novo numero para ser inserido:"));

		// Testa qual posição do vetor o numero informado pelo usuario deve ocupar
		// mantendo a ordem crescente e o numero de posições do vetor
		// O maior numero sera removido da ultima posição
		if (num <= vetor[0]) {
			vetor[9] = vetor[8];
			vetor[8] = vetor[7];
			vetor[7] = vetor[6];
			vetor[6] = vetor[5];
			vetor[5] = vetor[4];
			vetor[4] = vetor[3];
			vetor[3] = vetor[2];
			vetor[2] = vetor[1];
			vetor[1] = vetor[0];
			vetor[0] = num;
		} else if ((num < vetor[1]) && (num > vetor[0])) {
			vetor[9] = vetor[8];
			vetor[8] = vetor[7];
			vetor[7] = vetor[6];
			vetor[6] = vetor[5];
			vetor[5] = vetor[4];
			vetor[4] = vetor[3];
			vetor[3] = vetor[2];
			vetor[2] = vetor[1];
			vetor[1] = num;
		} else if ((num < vetor[2]) && (num > vetor[1])) {
			vetor[9] = vetor[8];
			vetor[8] = vetor[7];
			vetor[7] = vetor[6];
			vetor[6] = vetor[5];
			vetor[5] = vetor[4];
			vetor[4] = vetor[3];
			vetor[3] = vetor[2];
			vetor[2] = num;
		} else if ((num < vetor[3]) && (num > vetor[2])) {
			vetor[9] = vetor[8];
			vetor[8] = vetor[7];
			vetor[7] = vetor[6];
			vetor[6] = vetor[5];
			vetor[5] = vetor[4];
			vetor[4] = vetor[3];
			vetor[3] = num;
		} else if ((num < vetor[4]) && (num > vetor[3])) {
			vetor[9] = vetor[8];
			vetor[8] = vetor[7];
			vetor[7] = vetor[6];
			vetor[6] = vetor[5];
			vetor[5] = vetor[4];
			vetor[4] = num;
		} else if ((num < vetor[5]) && (num > vetor[4])) {
			vetor[9] = vetor[8];
			vetor[8] = vetor[7];
			vetor[7] = vetor[6];
			vetor[6] = vetor[5];
			vetor[5] = num;
		} else if ((num < vetor[6]) && (num > vetor[5])) {
			vetor[9] = vetor[8];
			vetor[8] = vetor[7];
			vetor[7] = vetor[6];
			vetor[6] = num;
		} else if ((num < vetor[7]) && (num > vetor[6])) {
			vetor[9] = vetor[8];
			vetor[8] = vetor[7];
			vetor[7] = num;
		} else if ((num < vetor[8]) && (num > vetor[7])) {
			vetor[9] = vetor[8];
			vetor[8] = num;
		} else {
			vetor[9] = num;
		}

		// Exibindo os valores do vetor em ordem crescente
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}