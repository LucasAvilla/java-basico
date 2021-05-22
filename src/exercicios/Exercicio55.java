package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o nome de dois times, numero de gols de cada time e
 * exibir o vencedor, caso tenha empate informar
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/2/2021
 */

public class Exercicio55 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as variaveis
		String timeA, timeB;
		int golA, golB;

		// Solicita ao usuario o nome dos times e numero de gols
		timeA = JOptionPane.showInputDialog("Informe o nome do time A:");
		golA = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de gols marcados pelo time A:"));
		timeB = JOptionPane.showInputDialog("Informe o nome do time B:");
		golB = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de gols marcados pelo time B:"));

		// verifica a quantidade de gols e exibe o resultado da partida
		if (golA > golB) {
			JOptionPane.showMessageDialog(null, "O time vencedor é o " + timeA);
		} else if (golB > golA) {
			JOptionPane.showMessageDialog(null, "O time vencedor é  o " + timeB);
		} else {
			JOptionPane.showMessageDialog(null, "EMPATE");
		}

	}

}
