package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o numero de maçãs compradas, calcular e exibir o custo
 * total
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */
public class Exercicio38 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as variáveis
		int maca;
		double valor;

		// Atribuindo valor para as variáveis
		maca = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de maçãs compradas:"));

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
