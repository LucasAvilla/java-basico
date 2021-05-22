package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a nota de 0 � 10 das duas avalia��es do aluno, calcular
 * e exibir a media para o usuario
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class Exercicio65 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		double nota1, nota2;

		// inicializando as vari�veis
		nota1 = 0;

		do {
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira avalia��o:"));

		} while ((nota1 >= 10) || (nota1 < 0));// condi��o do la�o de repeti��o

		// inicializando as vari�veis
		nota2 = 0;

		do {
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda avalia��o:"));
		} while ((nota2 >= 10) || (nota2 < 0));// condi��o do la�o de repeti��o

		// Calculando a media do aluno e exibe o resultado para o usuario
		JOptionPane.showMessageDialog(null, "A m�dia do aluno �: " + (nota1 + nota2) / 2);

	}
}