package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a nota de 0 à 10 das duas avaliações do aluno, calcular
 * e exibir a media para o usuario
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class Exercicio65 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		double nota1, nota2;

		// inicializando as variáveis
		nota1 = 0;

		do {
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira avaliação:"));

		} while ((nota1 >= 10) || (nota1 < 0));// condição do laço de repetição

		// inicializando as variáveis
		nota2 = 0;

		do {
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda avaliação:"));
		} while ((nota2 >= 10) || (nota2 < 0));// condição do laço de repetição

		// Calculando a media do aluno e exibe o resultado para o usuario
		JOptionPane.showMessageDialog(null, "A média do aluno é: " + (nota1 + nota2) / 2);

	}
}