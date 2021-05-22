package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber as medidas dos lados de um triangulo. Calcular e exibir
 * se formam um triangulo ou n�o.
 * 
 * @author lavilla
 * @since 09/02/2021
 */

public class Exercicio54 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as vari�veis
		double a, b, c, bc, ac, ab;

		// Solicita ao usuario as medidas a, b e c do triangulo e armazena nas vari�veis
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida do lado do A:"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida do lado do B:"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida do lado do C:"));

		// Calcula a soma dos lados BC, AC e AB e armazena nas vari�veis
		bc = b + c;
		ac = a + c;
		ab = a + b;

		// Verifica a condi��o para formar um triangulo e exibe para o usuario
		if ((a < bc) && (b < ac) && (c < ab)) {
			JOptionPane.showMessageDialog(null, "Os valores de A, B e C formam um triangulo");
		} else {
			JOptionPane.showMessageDialog(null, "Os valores de A, B e C n�o formam um triangulo");
		}

	}

}
