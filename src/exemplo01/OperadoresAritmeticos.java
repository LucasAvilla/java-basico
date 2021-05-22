package exemplo01;

/**
 * Programa para demonstrar operadores aritmeticos
 * 
 * @author lavilla
 * @since 05/02/2021
 *
 */
public class OperadoresAritmeticos {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando as variáveis
		int adicao, subtracao, multiplicacao, modulo;
		double divisao;

		// Exemplo de Adição
		adicao = 10 + 5;

		// Exemplo de Subtração
		subtracao = 10 - 5;

		// Exemplo de multiplicação
		multiplicacao = 24 * 3;

		// Exemplo de divisão
		divisao = 25 / 6.0;

		// Exemplo de modulo
		modulo = 10 % 3;

		// exibindo resultado no console
		System.out.println("10 + 5 =" + adicao);
		System.out.println("10 - 5 = " + subtracao);
		System.out.println("24 * 3 = " + multiplicacao);
		System.out.println("25 / 6.0 = " + divisao);
		System.out.println("10 % 3 = " + modulo);
	}

}
