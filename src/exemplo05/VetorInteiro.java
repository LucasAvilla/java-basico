package exemplo05;

/**
 * Programa para demonstrar utiliza��o de VETOR do tipo inteiro
 * 
 * @author Lucas Igor A M Nogueira
 * @since 11/02/2021
 */
public class VetorInteiro {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		int vetor[];

		// iniciando o vetor e informando a quantidade de posi��es (tamanho)
		vetor = new int[3];

		// Adicionando o valor 10 na primeira posi��o do vetor no seu indice 0
		vetor[0] = 10;

		// Adicionando o valor 5 na segunda posi��o do vetor no seu indice 1
		vetor[1] = 5;

		// Adicionando o valor 25 na terceira posi��o do vetor no seu indice 2
		vetor[2] = 25;

		// Exibindo o valor da primeira posi��o do vetor
		System.out.println(vetor[0]);

		// Exibindo o valor da segunda posi��o do vetor
		System.out.println(vetor[1]);

		// Exibindo o valor da tercira posi��o do vetor
		System.out.println(vetor[2]);

	}

}
