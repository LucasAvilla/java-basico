package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 10 numeros. Todos os numeros abaixo de 40 devem ser
 * somados e ao final exibir o resultado da soma para o usuario
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class Exercicio77 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando e inicializando as variáveis
		int soma = 0;
		int valor = 0;

		// Solicita os valores para o usuario
		for (int i = 0; i < 10; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
			if (valor < 40) {//Se o numero for menor que 40 incrementa na soma
				soma = soma + valor;//soma recebe ela mesma mais o valor
			}
		}
		
		// Exibe o resultado da soma dos numeros menores que 40 para o usuario
		JOptionPane.showMessageDialog(null, "A soma dos valores menor que 40 é " + soma);

	}
}
