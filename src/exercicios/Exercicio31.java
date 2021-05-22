package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o total de frangos da granja e exibir o custo de
 * marca��o
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */
public class Exercicio31 {

	/*
	 * M�todo principal de execu��o do programa
	 */

	public static void main(String[] args) {

		// Declarando variaveis
		int frangos;
		double custo;

		// Atribuindo valor as vari�veis
		frangos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de frangos da granja:"));

		// Calcular o valor total de marca��o dos frangos
		custo = frangos * (4 + (3.5 * 2));

		// Exibe o custo total da granja com marca��o para o usuario
		JOptionPane.showMessageDialog(null, "O custo total para marcar " + frangos + " frangos � de R$ " + custo);

	}

}
