package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar converção de tipo de dados
 * 
 * @author lavilla
 * @since 05/02/2021
 */
public class ConverterDadosInt {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando variáveis
		int valor1, valor2, resultado;

		// Recebendo valor do usuario
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor:"));

		// Calculando o resultado da soma
		resultado = valor1 + valor2;

		// Exibindo resultado da soma
		System.out.println("O resultado é: " + resultado);

	}

}
