package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores, calcular a soma dos numeros no intervalo
 * dos valores informados, incluindo-os. O segundo valor deve ser sempre maior
 * que o primeiro.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class Exercicio78 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando e inicializando as vari�veis
		int valor1, valor2, soma = 0;

		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));

		do {
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor:"));
		} while (valor1 >= valor2);// la�o de repeti��o at� ser informado um numero maior que o primeiro

		for (int i = valor1; i <= valor2; i++) {
			soma += i;// incrementa a soma com o intervalo dos numeros informados
		}
		// Exibe o valor da soma do intervalo dos numeros para o usuario
		JOptionPane.showMessageDialog(null, "A soma dos inteiros entre o intervalo informado �: " + soma);

	}
}
