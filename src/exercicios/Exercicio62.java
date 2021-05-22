package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber as tres notas do aluno e a media dos exercicios.
 * Calcular a media de aproveitamento do aluno e exibir o conceito do aluno
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio62 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as variáveis
		double n1, n2, n3, mediadosexercicios, mediadeaproveitamento;

		// Solicita as informações referente as notas para o usuario e armanzena nas
		// variáveis
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da primeira avalição:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da segunda avalição:"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da terceira avalição:"));
		mediadosexercicios = Double.parseDouble(JOptionPane.showInputDialog("Informe a dos exercicios avaliativos:"));

		// Calcula a media de aproveitamento do aluno
		mediadeaproveitamento = (n1 + (n2 * 2) + (n3 * 3) + mediadosexercicios) / 7;

		// verifica qual a faixa de conceito se enquadra e exibe para o usuario
		if (mediadeaproveitamento >= 9.0) {
			JOptionPane.showMessageDialog(null, "O conceito do aluno foi A");
		} else if ((mediadeaproveitamento >= 7.5) && (mediadeaproveitamento < 9.0)) {
			JOptionPane.showMessageDialog(null, "O conceito do aluno foi B");
		} else if ((mediadeaproveitamento >= 6.0) && (mediadeaproveitamento < 7.5)) {
			JOptionPane.showMessageDialog(null, "O conceito do aluno foi C");
		} else {
			JOptionPane.showMessageDialog(null, "O conceito do aluno foi D");
		}

	}

}
