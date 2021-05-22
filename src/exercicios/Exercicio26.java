package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o dia e mes de uma data e exibir o total de dias desde
 * o inicio do ano
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/0/2021
 */

public class Exercicio26 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a variável
		int dia, mes;

		// Atribuindo valor a variavel
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia do ano:"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes do ano:"));

		// calcular o total de dias desde o inicio do ano
		dia = (dia - 1) + ((mes - 1) * 30);

		// Exibe o total de dias para o usuario
		JOptionPane.showMessageDialog(null, "O total de dias foram de " + dia + " dias.");

	}
}
