package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o numero de ma��s compradas, calcular e exibir o custo
 * total
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */
public class Exercicio38 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as vari�veis
		int maca;
		double valor;

		// Atribuindo valor para as vari�veis
		maca = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de ma��s compradas:"));

		// Calcula e exibe o valor da compra para o usuario
		if (maca >= 12) {
			valor = maca * 1;
			JOptionPane.showMessageDialog(null, "O total da compra foi de R$ " + valor);
		} else {
			valor = maca * 1.3;
			JOptionPane.showMessageDialog(null, "O total da compra foi de R$ " + valor);
		}

	}

}
