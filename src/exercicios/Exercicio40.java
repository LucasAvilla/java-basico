package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o ano atual e de nascimento de uma pessoa e informar se
 * podera votar esse ano.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */
public class Exercicio40 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as vari�veis
		int ano, nascimento, idade;

		// Atibuindo valor para as vari�veis
		ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano presente:"));
		nascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do seu nascimento:"));

		// Calculando a idade do usuario
		idade = (ano - 1) - nascimento;

		// Exibindo o resultado para o usuario
		if (idade >= 16) {
			JOptionPane.showMessageDialog(null, "Voc� pode votar a partir desse ano!!");
		} else {
			JOptionPane.showMessageDialog(null, "Voc� ainda n�o tem idade para votar.");
		}
	}

}
