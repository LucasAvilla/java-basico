package exercicios;

/**
 * Programa que desenhe na tela um retângulo de 60 colunas (a partir da coluna 1
 * da tela) e 10 linhas (a partir da linha 1 da tela), sendo que a borda deste
 * retângulo será formada pelo caractere ‘+’. Lembre-se que somente a primeira e
 * última linha deverão ter todas as colunas preenchidas com o caractere ‘+’. As
 * demais linhas (entre 2 e 9) só terão as colunas 1 e 60 preenchidas.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 12/02/2021
 */
public class Exercicio87 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		//Declarando e incializando a variável
		String ret = "";

		//Contagem de linhas
		for (int i = 0; i < 10; i++) {

			//Atribuição da primeira e ultima linha
			if ((i == 0) || (i == 9)) {

				// Atribui o simbolo de "+" nas linhas
				for (int j = 0; j < 60; j++) {
					ret += "+";
				}
			} else {

				//Atribui o simbolo de "+" nas colunas
				for (int j = 0; j < 60; j++) {
					if ((j == 0) || (j == 59)) {
						ret += "+";
					} else {
						ret += " ";// Atribui o espaço vazio do retangulo atraves das colunas
					}
				}
			}

			// Quebra de linha para que forme a figura
			ret += "\n";
		}

		// Exibe a figura do retangulo para o usuario
		System.out.println(ret);
	}
}