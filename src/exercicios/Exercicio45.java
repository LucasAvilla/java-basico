package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o salario e as vendas efetuadas de um vendedor.
 * Calcular o valor das faixas de comiss�o e exibir o salario final para o
 * usuario
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio45 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as vari�veis
		double salario, totalvendas, comissao1, comissao2;

		// Solicitando inform��es para o usuario
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario do vendedor:"));
		totalvendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o total das vendas realizadas:"));

		// Atribui valor as variaveis conforme a faixa do total de vendas.
		comissao1 = salario + ((totalvendas * 3) / 100);

		// O valor 45 representa o valor teto da comiss�o1 de at� 1500.
		comissao2 = salario + 45 + (((totalvendas - 1500) * 5) / 100);

		// Exibe o valor do salario total com base na faixa de comiss�o para o usuario
		if (totalvendas <= 1500) {
			JOptionPane.showMessageDialog(null, "O salario total desse mes � de R$ " + comissao1);
		} else {
			JOptionPane.showMessageDialog(null, "O salario total desse mes � de R$ " + comissao2);
		}
	}

}
