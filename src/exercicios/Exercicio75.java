package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o numero de alunos de uma turma, as notas dos alunos,
 * calcular e exibir a media aritmética das notas.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class Exercicio75 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		int alunos;
		double notas = 0, media;

		// Solicita o numero de alunos da turma para o usuario
		alunos = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de alunos:"));

		// Solicita as notas dos alunos para o usuario
		for (int i = 0; i < alunos; i++) {//repeti conforme o numero de alunos informado
			notas += Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do aluno: "));
		}

		// Calcula a media das notas da turma
		media = notas / alunos;

		// Exibe a media da turma para o usuario
		JOptionPane.showMessageDialog(null, "A media dos alunos da turma é: " + media);

	}

}
