package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a temperatura em Fahrenheit e exibir em graus celsius
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/0/2021
 */

public class Exercicio24 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando a variável
		double n1, n2, n3, mediafinal;

		// Atribuindo valor a variavel
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

		// calcular a media final
		mediafinal = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

		// Exibe a media final do aluno para o usuario
		JOptionPane.showMessageDialog(null, "A media final do aluno é " + mediafinal);

	}
}
