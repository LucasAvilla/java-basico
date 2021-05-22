package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 10 valores do usuario e exibir quantos desses são
 * NEGATIVOS
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class Exercicio72 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		int contador, valor;

		// inicializando a variável
		contador = 0;

		// Solicita os valores para o usuario
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
			if (valor < 0) {// Se o valor for negativo ele incrementa na variavel
				contador++;
			}
		}

		// Exibe quantos numeros NEGATIVOS foram digitados para o usuario
		JOptionPane.showMessageDialog(null, "A quantidade de numeros negativos digitados foi de: " + contador);

	}

}
