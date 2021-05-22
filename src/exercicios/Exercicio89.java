package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a nota de 20 alunos, calcular a media da turma e exibir
 * a media e quantas notas ficaram acima dessa media.
 * 
 * @author Lucas Igor M Nogueira
 * @since 11/02/2021
 */
public class Exercicio89 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando vetor, variáveis e inicializando as variáveis
		int contador = 0, soma = 0, vetor[];
		double media;

		// Inicializando e definindo o tamanho do vetor
		vetor = new int[20];

		// Valorizando as posições do vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota do aluno:"));
		}

		// Soma os valores armazenados no vetor
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		// Calcula a media das notas armazenadas nos vetores
		media = soma / 20;

		// Varrendo o vetor para verificar numeros de notas acima da media
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > media) {
				contador++;
			}
		}

		// Exibindo a media da turma e a numero de notas acima dessa media para o
		// usuario
		JOptionPane.showMessageDialog(null,
				"A média da turma foi " + media + "\n" + "Acima da media a turma obteve " + contador + " notas.");
	}
}
