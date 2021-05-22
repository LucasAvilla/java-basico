package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor e imprimir o seu intervalo
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */
public class Exercicio69 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		int n;

		// Solicitando o valor N para o usuario
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));

		// Exibindo o intervalo entre 1 e N escolhido pelo usuario
		for (int i = 1; i <= n; i++) {
			System.out.println("Numero: " + i);
		}

	}

}
