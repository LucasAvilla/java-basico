package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demontrar a utilização do componente JoptionPane acessando
 * atributos estaticos
 * 
 * @author Lucas Igor A M Nogueira
 * @since 23 de fev. de 2021
 */
public class TestaJoptionPane {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Utilizando o JoptionPane com construtor para exibição de mensagem de erro
		JOptionPane.showMessageDialog(null, Mensagem.erroIncluido, Titulo.cadastroUsuario, 0); // 0 codigo do icone de
																								// erro

		// Utilizando o JoptionPane com construtor para exibição de mensagem de
		// informação
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroUsuario, 1); // 1 codigo do icone
																									// de info

		// Utilizando o JoptionPane com construtor para exibição de mensagem de
		// advertencia
//		JOptionPane.showMessageDialog(null, "Conteudo", "Titulo", 2); // 2 codigo do icone de advertencia

		// Utilizando o JoptionPane com construtor para exibição de mensagem de
		// interrogação
//		JOptionPane.showMessageDialog(null, "Conteudo", "Titulo", 3); // 3 codigo do icone de duvida
	}

}
