package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a exibi��o de dados para o usuario
 * 
 * @author lavilla
 * @since 05/02/2021
 */
public class SaidaDados {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando as variaveis
		double num1, num2, res;

		// atribuindo valor para as vari�veis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero"));

		// efetuando a multiplica��o
		res = num1 * num2;

		// exibindo o resultado para o usuario no console
		JOptionPane.showMessageDialog(null, "Primeiro valor digitado: " + num1 + "\n" +
											"Segundo valor digitado: " + num2 + "\n" +
											"O resultado da multiplica��o �: " + res);

	}

}
