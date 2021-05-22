package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 10 numeros e exibir o maior e o menor numero
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class Exercicio81 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		double valor, menor, maior;

		// Solicita para o usuario o primeiro valor
		valor = Double.parseDouble(JOptionPane.showInputDialog("valor"));

		// Armazena esse primeiro valor como parametro para os demais numeros
		maior = valor;
		menor = valor;

		for (int i = 0; i < 10; i++) {// la�o de repeti��o para armazenar os demais numeros
			valor = Double.parseDouble(JOptionPane.showInputDialog("valor"));

			if (valor > maior) {// testa se o valor � maior que maior
				maior = valor;// caso o valor seja maior, atribui o valor como novo maior
			}

			if (valor < menor) {// testa se o valor � menor que menor
				menor = valor;// caso o valor seja menor, atribui o valor como novo menor
			}
		}

		// Exibe para o usuario o maior e menor valor informado
		JOptionPane.showMessageDialog(null, "O maior valor �: " + maior + "\n" + 
											"O menor valor �: " + menor);
	}
}
