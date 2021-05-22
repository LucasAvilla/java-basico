package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber as horas trabalhadas no mes e o salario hora. Calcular
 * e exibir o salario total do funcionario.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio44 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as vari�veis
		int jornada, horasExt;
		double valorExt, salariohora, salariototal;

		// Atribuindo valor para as vari�veis
		jornada = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de horas trabalhadas no mes:"));
		salariohora = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario por hora trabalhada no mes:"));

		// Calculando os valores das vari�veis
		horasExt = jornada - 40;
		valorExt = salariohora + ((salariohora * 50) / 100);
		salariototal = (salariohora * 40) + (valorExt * horasExt);

		// Verifica as condi��es para pagar hora extra e exibi o salario total para o
		// usuario
		if (jornada > 40) {
			JOptionPane.showMessageDialog(null, "O salario total desse mes � de R$ " + salariototal);
		} else {
			salariototal = salariohora * jornada;
			JOptionPane.showMessageDialog(null, "O salario total desse mes � de R$ " + salariototal);
		}

	}

}
