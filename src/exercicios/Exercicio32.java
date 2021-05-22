package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber os refrigerentes comprados e exibir o seu total em
 * litros
 * 
 * @author Lucas Igor A M Nogueira
 * @since 06/02/2021
 */
public class Exercicio32 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// Declarando as variáveis
		int lata, garrafa, garrafa2;
		double litros;

		// Atribuindo valor as variáveis
		lata = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de latas 350 ml compradas:"));
		garrafa = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de garrafas de 600 ml compradas:"));
		garrafa2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de garrafas de 2l compradas:"));

		// Calculando o total de litros conforme o produto
		litros = (garrafa2 * 2) + (lata * 0.35) + (garrafa * 0.6);

		// Exibindo a quantidade de litros comprados para o usuario
		JOptionPane.showMessageDialog(null,"O total de litros de refrigerante que ele comprou foi de " + litros + "litros.");

	}

}
