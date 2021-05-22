package exemplo04;

/**
 * Programa para demonstra a utilização do comando de repetição Do While
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class RepeticaoDoWhile {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as variável
		int i;

		// iniciando a variável
		i = 10;

		do {
			System.out.println(i + " ao cubo é: " + ((i * i) * i));
			i++;

		} while (i < 10);

	}

}
