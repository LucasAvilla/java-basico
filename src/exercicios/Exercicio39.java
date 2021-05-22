package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber as notas do aluno. Calcular a media e exibir se o aluno
 * foi aprovado ou não
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio39 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as variáveis
		double n1, n2, media;

		// Atribuindo valor para as variáveis
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da 1a:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da 2a:"));

		// Calculando a media das notas
		media = (n1 + n2) / 2;

		// Exibindo o resultado da media e se o aluno foi ou não aprovado para o usuario
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "Aluno APROVADO com media final " + media);
		} else {
			JOptionPane.showMessageDialog(null, "Aluno REPROVADO com media final " + media);
		}
	}

}
