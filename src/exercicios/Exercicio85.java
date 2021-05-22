package exercicios;

/**
 * Programa para exibir as tabuadas de 1 � 10 para o ususario
 * 
 * @author Lucas Igor A M Nogueira
 * @since 11/02/2021
 */

public class Exercicio85 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Vari�vel auxiliar para exibir o resultado
		String res1, res2, res3, res4, res5, res6, res7, res8, res9, res10, mensagem = "";
		int resultadoTabuada;

		// Atruindo a variavel de resultado seu cabe�alho
		res1 = "Tabuada do 1\n";

		// la�o para calcular a tabuada
		for (int i = 1; i < 11; i++) {
			// calculando o valor do resultado
			resultadoTabuada = 1 * i;
			res1 += "1 x " + i + " = " + resultadoTabuada + "\n";
		}

		// Atruindo a variavel de resultado seu cabe�alho
		res2 = "Tabuada do 2\n";

		// la�o para calcular a tabuada
		for (int i = 1; i < 11; i++) {
			// calculando o valor do resultado
			resultadoTabuada = 2 * i;
			res2 += "2 x " + i + " = " + resultadoTabuada + "\n";
		}
		// atruindo a variavel de resultado seu cabe�alho
		res3 = "Tabuada do 3\n";

		// la�o para calcular a tabuada
		for (int i = 1; i < 11; i++) {
			// calculando o valor do resultado
			resultadoTabuada = 3 * i;
			res3 += "3 x " + i + " = " + resultadoTabuada + "\n";
		}

		// atruindo a variavel de resultado seu cabe�alho
		res4 = "Tabuada do 4\n";

		// la�o para calcular a tabuada
		for (int i = 1; i < 11; i++) {
			// calculando o valor do resultado
			resultadoTabuada = 4 * i;
			res4 += "4 x " + i + " = " + resultadoTabuada + "\n";
		}

		// atruindo a variavel de resultado seu cabe�alho
		res5 = "Tabuada do 5\n";

		// la�o para calcular a tabuada
		for (int i = 1; i < 11; i++) {
			// calculando o valor do resultado
			resultadoTabuada = 5 * i;
			res5 += "5 x " + i + " = " + resultadoTabuada + "\n";
		}

		// atruindo a variavel de resultado seu cabe�alho
		res6 = "Tabuada do 6\n";

		// la�o para calcular a tabuada
		for (int i = 1; i < 11; i++) {
			// calculando o valor do resultado
			resultadoTabuada = 6 * i;
			res6 += "6 x " + i + " = " + resultadoTabuada + "\n";
		}

		// atruindo a variavel de resultado seu cabe�alho
		res7 = "Tabuada do 7\n";

		// la�o para calcular a tabuada
		for (int i = 1; i < 11; i++) {
			// calculando o valor do resultado
			resultadoTabuada = 7 * i;
			res7 += "7 x " + i + " = " + resultadoTabuada + "\n";
		}

		// atruindo a variavel de resultado seu cabe�alho
		res8 = "Tabuada do 8\n";

		// la�o para calcular a tabuada
		for (int i = 1; i < 11; i++) {
			// calculando o valor do resultado
			resultadoTabuada = 8 * i;
			res8 += "8 x " + i + " = " + resultadoTabuada + "\n";
		}

		// atruindo a variavel de resultado seu cabe�alho
		res9 = "Tabuada do 9\n";

		// la�o para calcular a tabuada
		for (int i = 1; i < 11; i++) {
			// calculando o valor do resultado
			resultadoTabuada = 9 * i;
			res9 += "9 x " + i + " = " + resultadoTabuada + "\n";
		}

		// atruindo a variavel de resultado seu cabe�alho
		res10 = "Tabuada do 10\n";

		// la�o para calcular a tabuada
		for (int i = 1; i < 11; i++) {
			// calculando o valor do resultado
			resultadoTabuada = 10 * i;
			res10 += "10 x " + i + " = " + resultadoTabuada + "\n";
		}

		// Concatenando as mensagens de resultado
		mensagem += res1 + "\n";
		mensagem += res2 + "\n";
		mensagem += res3 + "\n";
		mensagem += res4 + "\n";
		mensagem += res5 + "\n";
		mensagem += res6 + "\n";
		mensagem += res7 + "\n";
		mensagem += res8 + "\n";
		mensagem += res9 + "\n";
		mensagem += res10;

		// Exibindo as tabuadas de 1 � 10 para o usuario
		System.out.println(mensagem);

	}

}
