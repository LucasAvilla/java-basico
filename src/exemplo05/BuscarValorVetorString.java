package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para buscar um valor especifico do vetor String
 * 
 * @author Lucas Igor A M Nogueira
 * @since 11/02/2021
 */

public class BuscarValorVetorString {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declarando o vetor
		String vetor[];

		// incializando e definindo o vetor
		vetor = new String[3];

		// Variável para auxiliar para buscar um registro
		String nome = "Lucas";

		// valorizando o vetor com os dados do usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome:");
		}

		// Varrendo o vetor para verificar os registros
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals("Lucas")) {
				System.out.println("Achei o " + nome + " que você procurava na posição: " + i);
			}
		}

	}

}
