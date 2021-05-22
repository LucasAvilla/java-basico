package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a utilização de vetor tipo String
 * 
 * @author Lucas Igor A M Nogueira @since11/02/2021
 */

public class VetorString {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando o vetor
		String vetor[];

		// inicializando e definindo tamanho do vetor
		vetor = new String[5];

		// Valorizando o vetor e recebendo dado do usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome:");
		}
		
		// Exibindo os valores contidos no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
