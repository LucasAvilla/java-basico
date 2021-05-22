package exercicios;

/**
 * Programa para exibir a sequencia numerica de 1 a 10 numerada de 1 a 10 com o
 * primeiro numero alterando de 1 a 10
 * 
 * @author Lucas Igor A M Nogueira
 * @since 11/02/2021
 */

public class Exercicio86 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		String res = "";
		@SuppressWarnings("unused")
		int seq;

		for (int i = 1; i < 11; i++) {
			seq = 1 + i;
			res += "(" + i + ",1 2 3 4 5 6 7 8 9 10) \n";
		}

		System.out.println(res);

	}
}