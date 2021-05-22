package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor e exibir se ele é maior que 10 ou não
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */
public class Exercicio36 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		double num;

		// Atribuindo valor para a variável
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));

		// Verificando se o numero é maior que 10 exibindo para o usuario
		if (num > 10) {
			JOptionPane.showMessageDialog(null, "É MAIOR QUE 10");
		} else {
			JOptionPane.showMessageDialog(null, "NÃO É MAIOR QUE 10");
		}
	}

}
