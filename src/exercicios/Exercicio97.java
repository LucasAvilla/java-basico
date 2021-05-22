package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um vetor de 20 números.Após isto, deverá ser lido mais um
 * número qualquer e verificar se esse número existe no vetor ou não. Se
 * existir, o programa deve gerar um novo vetor sem esse número.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 12/02/2021
 */

public class Exercicio97 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando o vetor
		double vetor[];
		String vazio = "";

		// incializando e definindo o vetor
		vetor = new double[20];

		// Variável para auxiliar para buscar um registro
		double aux;

		// valorizando o vetor com os dados do usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para armazenar no vetor:"));
		}

		aux = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de busca:"));

		// Varrendo o vetor para verificar os registros
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == aux) {
				vetor[i] = vetor[i] - aux;// Caso encontre o numero repetido
				if (i == 0) {
					i = Integer.parseInt(vazio);// remove o numero repetido do vetor
					// Exibe para o usuario o vetor sem a posição que apresenta o numero repetido
					System.out.println(vetor[i]);
				}
			} else {
				// Exibe o vetor na integra para o usuario
				System.out.println(vetor[i]);
			}

		}
	}

}
