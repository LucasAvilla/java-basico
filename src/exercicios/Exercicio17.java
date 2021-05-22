package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a idade em anos, meses e dias do usuario, calcular e
 * exibir sua idade em dias
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */

public class Exercicio17 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a variável
		int ano, mes, dia;

		// atribuindo valor a variável
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em anos:"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em meses"));
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em dias"));

		// Calculando a idade em dias
		ano = ano * 365;
		mes = mes * 30;
		dia = dia + mes + ano;

		// Exibindo a idade em dias para o usuario
		JOptionPane.showMessageDialog(null, "A sua idade equivale a: " + dia + " dias.");

	}
}
