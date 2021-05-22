package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor e exibir se ele � maior que 10 ou n�o
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */
public class Exercicio36 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		double num;

		// Atribuindo valor para a vari�vel
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));

		// Verificando se o numero � maior que 10 exibindo para o usuario
		if (num > 10) {
			JOptionPane.showMessageDialog(null, "� MAIOR QUE 10");
		} else {
			JOptionPane.showMessageDialog(null, "N�O � MAIOR QUE 10");
		}
	}

}
