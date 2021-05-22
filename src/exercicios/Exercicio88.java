package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber os nomes de 10 pessoas e armazenenar os nomes lidos em
 * um vetor. Após isto, permitir a leitura de mais 1 nome e escrever a mensagem
 * ACHEI, se o nome estiver entre os 10 nomes ou NÃO ACHEI caso contrário.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 11/02/2021
 *
 */
public class Exercicio88 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando o vetor String
		String nomes[];

		// inicializar e definir o tamanho do vetor
		nomes = new String[10];

		// recebendo do usuario os nomes e armazenando em um vetor
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Informe um nome");
		}

		// recebendo do usuario um nome qualquer
		String busca = JOptionPane.showInputDialog("Informe o nome a ser procurado");

		// variavel auxiliar para contar as vezes que achou o nome escolhido pelo
		// usuario
		boolean achou = false;

		// varrendo o vetor para verificar se o nome informado pelo usuario existe
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals(busca)) {
				achou = true;
			}
		}

		// exibindo o resultado da busca
		if (achou) {
			System.out.println("ACHEI");
		} else {
			System.out.println("NÃO ACHEI");
		}

	}

}
