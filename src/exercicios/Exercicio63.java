package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para recebe os requisitos de aposentadoria e exibir se o empregado
 * esta qualificado
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio63 {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as variáveis
		int idade, tempodetrabalho, codigo, nascimento, ingresso;
		String aposentadoria;

		// Solicita os dados do funcionario para o usuario
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do funcionario:"));
		nascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do seu nascimento:"));
		ingresso = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de ingresso na empresa:"));

		// Calcula a idade do funcionario e o tempo de trabalho na empresa
		idade = 2020 - nascimento;
		tempodetrabalho = 2020 - ingresso;

		// Verifica as condições para aposentadoria
		if ((idade >= 65) || (tempodetrabalho >= 30)) {
			aposentadoria = "Requerer aposentadoria";
		} else if ((idade >= 60) && (tempodetrabalho >= 25)) {
			aposentadoria = "Requerer aposentadoria";
		} else {
			aposentadoria = "Não requerer";

		// Exibe a idade, tempo de trabalho e se esta apto para requerer a aposentadoria
		// ou não
		JOptionPane.showMessageDialog(null, "O funcionario "+codigo + " tem " + idade + " anos." + "\n"+ 
											"Com tempo de trabalho de " + tempodetrabalho + " anos." + "\n" +
											aposentadoria);
		}
	}
}
