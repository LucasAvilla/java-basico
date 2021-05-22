package exemplo05;

/**
 * Programa para demonstrar utilização de VETOR do tipo inteiro
 * 
 * @author Lucas Igor A M Nogueira
 * @since 11/02/2021
 */
public class VetorInteiro {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		int vetor[];

		// iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new int[3];

		// Adicionando o valor 10 na primeira posição do vetor no seu indice 0
		vetor[0] = 10;

		// Adicionando o valor 5 na segunda posição do vetor no seu indice 1
		vetor[1] = 5;

		// Adicionando o valor 25 na terceira posição do vetor no seu indice 2
		vetor[2] = 25;

		// Exibindo o valor da primeira posição do vetor
		System.out.println(vetor[0]);

		// Exibindo o valor da segunda posição do vetor
		System.out.println(vetor[1]);

		// Exibindo o valor da tercira posição do vetor
		System.out.println(vetor[2]);

	}

}
