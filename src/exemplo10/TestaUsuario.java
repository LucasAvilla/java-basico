package exemplo10;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utiliza��o de exce��es em Java
 * 
 * @author Lucas Igor A M Nogueira
 * @since 23 de fev. de 2021
 */

public class TestaUsuario {

	/*
	 * M�todo principal para executar a classe
	 */

	public void receberDados() {

		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, "Cadastro de Usuario", 0);
		} else {
			JOptionPane.showMessageDialog(null, "Nome V�lido!", "Cadastro de Usuario", 1);
		}
		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, Mensagem.nomeInvalido, "Cadastro de Usuario", 0);
		} else {
			JOptionPane.showMessageDialog(null, "Nome V�lido!", "Cadastro de Usuario", 1);
		}
		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeIdade))) {
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalida, "Cadastro de Usuario", 0);
		} else {
			JOptionPane.showMessageDialog(null, "Idade V�lida!", "Cadastro de Usuario", 1);

		}

	}// fim do M�todo

	public static void main(String[] args) {
		new TestaUsuario().receberDados();

	}

}// Fim da classe
