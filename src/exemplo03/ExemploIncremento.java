package exemplo03;

/**
 * Programa para demonstrar incremento de valores
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class ExemploIncremento {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		int numero;

		// Atribuindo valor para variável
		numero = 1;

		System.out.println(numero);// exibe o valor 1

		numero = numero + 1;

		System.out.println(numero);// exibindo o valor 2

		numero++;

		System.out.println(numero);// exibindo o valor 3
		System.out.println(numero++);// exibindo o valor 3
		System.out.println(numero);// exibindo o valor 4
		System.out.println(++numero);// exibindo o valor 5
	}

}
