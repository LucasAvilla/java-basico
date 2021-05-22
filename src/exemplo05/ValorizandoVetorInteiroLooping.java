package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para valorizar um vetor do tipo inteiro informado pelo usuario
 * usando o FOR
 * 
 * @author Lucas Igor A M Nogueira
 * @since 11/02/2021
 */

public class ValorizandoVetorInteiroLooping {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando o vetor
		int vetor[];

		// inicializando o vetor e definindo o seu tamanho
		vetor = new int[5];

		// Recebendo os valores do usuario com auxilio do comando FOR
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
		}

		// Exibindo os valores contidos no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
