package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a utilização de vetor tipo Double
 * 
 * @author Lucas Igor A M Nogueira @since11/02/2021
 */

public class VetorDouble {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando o vetor
		double vetor[];

		// inicializando e definindo tamanho do vetor
		vetor = new double[5];

		// Valorizando o vetor e recebendo dado do usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor:"));
		}

		// Exibindo os valores contidos no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
