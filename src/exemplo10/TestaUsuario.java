package exemplo10;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utilização de exceções em Java
 * 
 * @author Lucas Igor A M Nogueira
 * @since 23 de fev. de 2021
 */

public class TestaUsuario {

	/*
	 * Método principal para executar a classe
	 */

	public void receberDados() {

		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, "Cadastro de Usuario", 0);
		} else {
			JOptionPane.showMessageDialog(null, "Nome Válido!", "Cadastro de Usuario", 1);
		}
		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, Mensagem.nomeInvalido, "Cadastro de Usuario", 0);
		} else {
			JOptionPane.showMessageDialog(null, "Nome Válido!", "Cadastro de Usuario", 1);
		}
		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeIdade))) {
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalida, "Cadastro de Usuario", 0);
		} else {
			JOptionPane.showMessageDialog(null, "Idade Válida!", "Cadastro de Usuario", 1);

		}

	}// fim do Método

	public static void main(String[] args) {
		new TestaUsuario().receberDados();

	}

}// Fim da classe
