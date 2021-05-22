package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber quatro idades, 2 homens e 2 mulheres. Calcular a soma
 * da idade da mulher mais nova e o homem mais velho e o produto das outras duas
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio58 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as variáveis
		int idadeA, idadeB, idadeC, idadeD, maiorA, maiorB, menorA, menorB, mult, soma;

		// Solicita que o usuario informe as quatro idades e armazena nas variáveis
		idadeA = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do primeiro homem:"));
		idadeB = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do segundo homem:"));
		idadeC = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da primeira mulher:"));
		idadeD = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da segunda mulher:"));

		// Compara a maior e a menor idade entre os homens e atribui as variáveis
		if (idadeA > idadeB) {
			maiorA = idadeA;
			menorA = idadeB;
		} else {
			maiorA = idadeB;
			menorA = idadeA;
		}

		// Compara a maior e a menor idade entre os homens e atribui as variáveis
		if (idadeC > idadeD) {
			maiorB = idadeC;
			menorB = idadeD;
		} else {
			maiorB = idadeD;
			menorB = idadeC;
		}

		// Calcular a soma e produto das idades e armazenar na variavel correspondente a
		// operação
		soma = maiorA + menorB;
		mult = menorA * maiorB;

		// Exibe a soma da idade da mulher mais nova e o homem mais velho e o produto
		// das outras duas
		JOptionPane.showMessageDialog(null, "A soma das idades do homem mais velho e da mulher mais nova é " +soma+ " anos"+"\n"+
											"O produto das idades do homem mais novo e da mulher mais velha é "+mult+ " anos");

	}

}
