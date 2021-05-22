package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber tres valores, verificar calcular a multiplica��o dos 2
 * menores e exibir para o usuario.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio51 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as vari�veis
		double num1, num2, num3, multi;

		// solicita ao usuario tres numeros distintos e atribui as vari�veis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero:"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero diferente:"));
		num3 = Double.parseDouble(JOptionPane.showInputDialog("Informe um ultimo numero diferente dos anteriores:"));

		// Verifica os dois numeros menores informados, calcula a multiplica��o deles e
		// exibi para o usuario
		if ((num1 < num2) && (num2 < num3)) {
			multi = num1 * num2;
			JOptionPane.showMessageDialog(null, "A multiplica��o dos dois numeros menores � " + multi);
		} else if ((num2 > num1) && (num2 > num3)) {
			multi = num1 * num3;
			JOptionPane.showMessageDialog(null, "A multiplica��o dos dois numeros menores � " + multi);
		} else {
			multi = num2 * num3;
			JOptionPane.showMessageDialog(null, "A multiplica��o dos dois numeros menores � " + multi);
		}

	}

}
