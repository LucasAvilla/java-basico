package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir a media aritmética dos numeros inteiros entre
 * 15 e 100 incluindo-os.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class Exercicio79 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando e inicializando as variáveis
		int media = 0, contador = 0;

		for (int i = 15; i <= 100; i++) {// laço de repetição dos numeros no intervalo
			media += i;// Incrementa a soma dos numeros do intervalo a media
			contador++;// Incrementa a quantidade de numeros no intervalo informado
		}

		// Calcula e exibe o resultado da media da soma dos numeros no intervalo
		// informado pela quantidade de numeros
		JOptionPane.showMessageDialog(null, "A media aritmetica dos numeros é: " + media / contador);

	}

}
