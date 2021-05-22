package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o valor de custo de um veiculo, calcular o valor final
 * para o consumidor e exibir para o usuario.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/0/2021
 */

public class Exercicio21 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a variável
		double custodefab;

		// Atribuindo valor a variavel
		custodefab = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de fabrica do veiculo: R$"));

		// calular o custo final do veiculo
		custodefab = custodefab + (custodefab * 0.45) + (custodefab * 0.28);

		// Exibe o custo final do veiculo para o usuario
		JOptionPane.showMessageDialog(null, "O custo final do veiculo sera de : R$ " + custodefab);

	}
}
