package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o salario atual do funcionario e o percentual do
 * reajuste. Calular e exibir o valor do novo salario.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/042/2021
 */

public class Exercicio19 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as variaveis
		double salario, ajuste, novosalario;

		// Atribuindo valor as variáveis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salario: R$"));
		ajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual do reajuste:"));

		// Calculando o valor do novo salario
		novosalario = salario * (ajuste / 100);
		novosalario = salario + novosalario;

		// Exibindo o valor do novo salario
		JOptionPane.showMessageDialog(null, "O valor do novo salario é de: R$ " + novosalario);

	}
}
