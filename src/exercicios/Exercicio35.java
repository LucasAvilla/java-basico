package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o ano de nascimento e atual, calcular a idade da pessoa
 * em anos, meses, dias e semanas e exibir para usuario
 * 
 * @author Lucas Igor A M Nogueira
 * @since 08/02/2021
 */

public class Exercicio35 {

	/*
	 * M�todo principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		int idadea, idadem, idaded, nascimento, atual;
		double idades;

		// Atribuindo valor as vari�veis
		nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento:"));
		atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));

		// Calculando as vari�veis
		idadea = (atual - 1) - nascimento;
		idadem = idadea * 12;
		idaded = idadem * 30;
		idades = idaded / 7;
		
		//Exibindo as idades para o usuario
		JOptionPane.showMessageDialog(null, "A sua idade em anos � : " + idadea + " anos." + "\n" +
											"A sua idade em meses � : " + idadem + " meses." + "\n" +
											"A sua idade em dias � :" + idaded + " dias." + "\n" +
											"A sua idade em semanas � :" + idades + " semanas.");
	}

}
