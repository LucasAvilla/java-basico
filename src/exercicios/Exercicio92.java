package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um vetor A de 10 posições. Armazenar mais um numero em X.
 * Armazenar no vetor M cada elemento multiplicados por X. Exibir o vetor M.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 12/02/2021
 */

public class Exercicio92 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando o vetor
		double vetorA[], vetorM[], x;

		// Inicializando e definindo o tamanho dos vetores
		vetorA = new double[10];
		vetorM = new double[10];

		// Valorizando as posições do vetor
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do vetor A:"));
		}

		// Armazenando valor da variável x
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de X:"));

		// Multiplica os elementos do vetorA pelo numero informado X
		for (int i = 0; i < vetorM.length; i++) {
			vetorM[i] = vetorA[i] * x;// Armazena no vetorM a multiplicação do vetorA por X
		}

		// Exibe para o usuario o vetorM
		for (int i = 0; i < vetorM.length; i++) {
			System.out.println(vetorM[i]);
		}

	}

}
