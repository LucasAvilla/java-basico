package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber as dimens�es de retangulo, calcular e exibir sua area
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */

public class Exercicio16 {

	/*
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a vari�vel
		double base, altura, area;

		// atribuindo valor a vari�vel
		base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do retagulo:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do retagulo:"));

		// Calculando a area do retangulo
		area = base * altura;

		// Exibindo o valor da area do retangulo para o usuario
		JOptionPane.showMessageDialog(null, "A area do retangulo �: " + area + " m�.");
	}
}
