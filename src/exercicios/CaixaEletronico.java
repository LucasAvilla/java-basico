package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para simular o funcionamento de um caixa eletrônico
 * 
 * @author lavilla
 * @since 08/02/2021
 */
public class CaixaEletronico {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as variaveis
		double valorsaque;
		int c2, c5, c10, c20, c50, r2, r5, r10, r20, r50, valor;

		// Atribuindo valor para as variáveis
		valorsaque = Double.parseDouble(JOptionPane.showInputDialog("=====CAIXA ELETRONICO====" + "\n" + 
																	"Notas disponiveis: R$ 2.00, R$ 5.00, R$ 10.00, R$ 20.00, R$ 50.00" + "\n\n" + 
																	" Informe qual o valor a ser sacado:"));

		valor = (int) valorsaque;

		// Verifico se o saque é executavel
		if ((valorsaque - valor > 0) || (valorsaque < 2) || (valorsaque == 3)) {
			JOptionPane.showMessageDialog(null,"Valores indisponiveis para saque no caixa eletrônico." + "\n" +
											   "Saque não efetuado!");
		} else {

			// Calculando as notas para saque
			c50 = valor / 50;
			r50 = valor % 50;

			c20 = r50 / 20;
			r20 = r50 % 20;

			c10 = r20 / 10;
			r10 = r20 % 10;

			c5 = r10 / 5;
			r5 = r10 % 5;

			c2 = r5 / 2;
			r2 = r5 % 2;

			//Verificando arredondamento em caso de sobra
			//Verificando casos terminados em 1 e 3 
			if (r2 > 0) {
				if ((valor % 50 == 1) || (valor % 50 == 3)) {
					c50 = c50 - 1;
					c20 = c20 + 2;
					c5 = c5 + 1;
					c2 = c2 + 3;
				} else {
					if (c5 > 0) {
						c5 = c5 - 1;
						c2 = c2 + 3;
					} else if (c10 > 0) {
						c10 = c10 - 1;
						c5 = c5 + 1;
						c2 = c2 + 3;
					} else if (c20 > 0) {
						c20 = c20 - 1;
						c10 = c10 + 1;
						c5 = c5 + 1;
						c2 = c2 + 3;
					} else {
						c50 = c50 - 1;
						c20 = c20 + 1;
						c10 = c10 + 1;
						c5 = c5 + 1;
						c2 = c2 + 3;
					}
				}
			}

			// Exibe a quantidade de cada tipo de nota para o valor desejado
			JOptionPane.showMessageDialog(null,"Valor do saque realizado: R$ " + valorsaque + "\n" + 
											   "Cedulas utilizadas para o saque:" + "\n"+ 
											   "Notas de R$50,00: " + c50 + "\n" + 
											   "Notas de R$20,00: " + c20 + "\n" +
											   "Notas de R$10,00: " + c10 + "\n" + 
											   "Notas de R$5,00: " + c5 + "\n" + 
											   "Notas de R$2,00: " + c2);
		}
	}
}