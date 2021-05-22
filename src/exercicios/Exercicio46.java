package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o numero de conta do cliente, saldo, debito e credito.
 * Calcular e exibir o saldo atual da conta e verificar se o saldo final é
 * positivo ou negativo
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */
public class Exercicio46 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as variáveis
		int numeroconta;
		double saldo, credito, debito, saldoatual;

		// solicita as informações de conta, saldo, debito e credito ao usuario
		numeroconta = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da sua conta corrente:"));
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo da sua conta: R$"));
		credito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de credito disponivel: R$"));
		debito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total dos debitos: R$"));

		// calcula o saldo atualizado da conta e armazena
		saldoatual = saldo - debito + credito;

		//Exibe a conta e o saldo atual para o usuario
		//Testa o valor do saldo final e informa se esta positivo ou negativo
		if (saldoatual >= 0) {
			JOptionPane.showMessageDialog(null,"O saldo atualizado da conta nº " + numeroconta + " é de R$ " + saldoatual +"\n"+
											   "Saldo POSITIVO");
		}else {
			JOptionPane.showMessageDialog(null,"O saldo atualizado da conta nº " + numeroconta + " é de R$ " + saldoatual +"\n"+
					   						   "Saldo NEGATIVO");

		}
		
	}
	
}
