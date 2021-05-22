package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o codigo e preço de 5 produtos e exibir o maior preço e
 * a media dos preços.
 * 
 * @author Lucas Igor A M Nogueira
 */

public class Exercicio83 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando e inicializando as variáveis
		double preco, media = 0, maior;
		@SuppressWarnings("unused")
		int codigo;

		// Solicita para o usua o codigo do produto
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do produto:"));
		do {// solicita o preço do produto para o usuario
			preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto: R$"));
		} while (preco <= 0);// Laço de condição para que o preço seja informado seja valido

		// Parametro de valor
		maior = preco;
		media += preco;

		for (int i = 1; i < 5; i++) {// laço para informar os codigos e preços
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do produto:"));
			do {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto: R$"));
			} while (preco <= 0);// Laço de condição para que o preço seja informado seja valido

			if (preco > maior) {// Testa se o preço informado é maior que o parametro atual
				maior = preco;// se preço maior, atribui novo valor para maior
			}

		// Armazena os valores dos produtos
		media += preco;
		}
		
		// Calcula a media dos preços. Exibe o maior preço e a media para o usuario
		JOptionPane.showMessageDialog(null, "O maior preço é R$ " + maior + "\n" +
											"A media dos preços é R$ " + media / 5);

	}
}
