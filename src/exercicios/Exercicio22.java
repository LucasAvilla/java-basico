package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o numero de carros vendidos, valor total de vendas,
 * salarario base e o valor por venda. Calcular e exibir o salario final
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/0/2021
 */

public class Exercicio22 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a variável
		int ncarros;
		double totalvendas, salario, valorcarros;

		// Atribuindo valor a variavel
		ncarros = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de carros vendidos:"));
		totalvendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total das suas vendas: R$"));
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario fixo: R$"));
		valorcarros = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor recebido por carro vendido: R$"));

		// Calcular o valor final do salario do vendedor
		salario = salario + (totalvendas * 0.05) + (valorcarros * ncarros);

		// Exibe o salario final para o usuario
		JOptionPane.showMessageDialog(null, "O salario final sera de : R$ " + salario);

	}
}
