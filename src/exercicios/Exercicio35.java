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
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as variáveis
		int idadea, idadem, idaded, nascimento, atual;
		double idades;

		// Atribuindo valor as variáveis
		nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento:"));
		atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));

		// Calculando as variáveis
		idadea = (atual - 1) - nascimento;
		idadem = idadea * 12;
		idaded = idadem * 30;
		idades = idaded / 7;
		
		//Exibindo as idades para o usuario
		JOptionPane.showMessageDialog(null, "A sua idade em anos é : " + idadea + " anos." + "\n" +
											"A sua idade em meses é : " + idadem + " meses." + "\n" +
											"A sua idade em dias é :" + idaded + " dias." + "\n" +
											"A sua idade em semanas é :" + idades + " semanas.");
	}

}
