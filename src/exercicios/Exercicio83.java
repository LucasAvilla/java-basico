package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o codigo e pre�o de 5 produtos e exibir o maior pre�o e
 * a media dos pre�os.
 * 
 * @author Lucas Igor A M Nogueira
 */

public class Exercicio83 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando e inicializando as vari�veis
		double preco, media = 0, maior;
		@SuppressWarnings("unused")
		int codigo;

		// Solicita para o usua o codigo do produto
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do produto:"));
		do {// solicita o pre�o do produto para o usuario
			preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o do produto: R$"));
		} while (preco <= 0);// La�o de condi��o para que o pre�o seja informado seja valido

		// Parametro de valor
		maior = preco;
		media += preco;

		for (int i = 1; i < 5; i++) {// la�o para informar os codigos e pre�os
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do produto:"));
			do {
				preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o do produto: R$"));
			} while (preco <= 0);// La�o de condi��o para que o pre�o seja informado seja valido

			if (preco > maior) {// Testa se o pre�o informado � maior que o parametro atual
				maior = preco;// se pre�o maior, atribui novo valor para maior
			}

		// Armazena os valores dos produtos
		media += preco;
		}
		
		// Calcula a media dos pre�os. Exibe o maior pre�o e a media para o usuario
		JOptionPane.showMessageDialog(null, "O maior pre�o � R$ " + maior + "\n" +
											"A media dos pre�os � R$ " + media / 5);

	}
}
