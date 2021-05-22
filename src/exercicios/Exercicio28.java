package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o valor da conta e dividir entre os amigos e exibir o
 * resultado com apenas um deles pagando centavos
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/0/2021
 */

public class Exercicio28 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a variável
		int valorcarlos, valorandre;
		double conta, valorfelipe, valordividido;

		// Atribuindo valor a variavel
		conta = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta: R$"));

		// calcular valor da conta dividida
		valordividido = conta / 3;
		valorcarlos = (int) valordividido;
		valorandre = (int) valordividido;
		valorfelipe = conta - (valorcarlos + valorandre);

		// Exibe o total de dias para o usuario
		JOptionPane.showMessageDialog(null, "Valor pago por Carlos: R$ " + valorcarlos + ",00" + "\n" +
											"Valor pago por André: R$ " + valorandre + ",00"  + "\n" +
											"Valor pago por Felipe: R$ " + valorfelipe);
	}
}
