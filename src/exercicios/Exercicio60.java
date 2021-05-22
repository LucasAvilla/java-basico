package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o codigo de usuario e senha. Exibir se o acesso foi
 * permitido
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio60 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as variáveis
		int codigo, senha;

		// Solicitar o codigo de acesso ao usuario
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo de usuario:"));

		// Testa o codigo informado pelo usuario, se estiver incorreto exibe a mensagem
		// de acesso invalido
		if (1234 == codigo) {
			JOptionPane.showMessageDialog(null, "USUARIO INVÁLIDO!!!");
		} else {
			// Se o codigo estiver correto, solicita a senha de acesso ap usuario
			senha = Integer.parseInt(JOptionPane.showInputDialog("Informe sua senha de acesso:"));

			// Testa a senha de acesso informada e exibe a mensagem de acesso permitido ou
			// negado
			if (9999 == senha) {
				JOptionPane.showMessageDialog(null, "Acesso permitido");
			} else {
				JOptionPane.showMessageDialog(null, "SENHA INCORRETA, ACESSO NEGADO");
			}
		}
	}

}
