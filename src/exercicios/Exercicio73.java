package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 10 valores e exibir quantos estão no intervala de 10 -
 * 20 e quantos estão fora.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class Exercicio73 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		int contador1, contador2, valor;

		// Inicializando as variáveis
		contador1 = 0;
		contador2 = 0;

		// Solicita os valores para o usuario
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
			if ((valor >= 10) && (valor <= 20)) {//Verifica o intervalo dos numeros informados
				contador1++;//incrementa na variável os numeros dentro do intervalo solicitado
			} else {
				contador2++;//incrementa na variável os numeros fora do intervalo
			}
		}

		// Exibe a contagem dentro e fora do intervalo solicitado para o usuario
		JOptionPane.showMessageDialog(null, "Os numeros digitados no intervalo 10 à 20 foram: " + contador1 + "\n" +
											"Os numeros digitados fora do intervalo 10 à 20 foram: " + contador2);

	}

}
