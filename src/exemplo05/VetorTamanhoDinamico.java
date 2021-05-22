package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstra vetor com o ususario informando seu tamanho
 * 
 * @author Lucas Igor A M Nogueira
 * @since 11/02/2021
 */
public class VetorTamanhoDinamico {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando o vetor
		int vetor[];

		// variável auxiliar informada pelo usuario para definir o tamanho do vetor
		int tamanho;

		// usuario informando o tamanho do vetor
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor:"));

		// inicializando o vetor e definindo o seu tamanho
		vetor = new int[tamanho];

		// Recebendo os valores do usuario para armazenar nos vetores
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
		}

		// Exibir os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
