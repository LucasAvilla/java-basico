package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o total de frangos da granja e exibir o custo de
 * marcação
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/02/2021
 */
public class Exercicio31 {

	/*
	 * Método principal de execução do programa
	 */

	public static void main(String[] args) {

		// Declarando variaveis
		int frangos;
		double custo;

		// Atribuindo valor as variáveis
		frangos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de frangos da granja:"));

		// Calcular o valor total de marcação dos frangos
		custo = frangos * (4 + (3.5 * 2));

		// Exibe o custo total da granja com marcação para o usuario
		JOptionPane.showMessageDialog(null, "O custo total para marcar " + frangos + " frangos é de R$ " + custo);

	}

}
