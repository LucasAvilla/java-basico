package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o uso da condicional Switch
 * 
 * @author lavilla
 * @since 08/02/2021
 */

public class CondicionalSwitch {

	/*
	 * M?todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as vari?veis
		int mes;

		// capturando dados do usuario
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o m?s:"));

		// Exibindo o m?s para o usuario
		switch (mes) {
		case 1: {
			JOptionPane.showMessageDialog(null, "M?s escolhido - Janeiro");
			break;
		}
		case 2: {
			JOptionPane.showMessageDialog(null, "M?s escolhido - Fevereiro");
			break;
		}
		case 3: {
			JOptionPane.showMessageDialog(null, "M?s escolhido - Mar?o");
			break;
		}
		case 4: {
			JOptionPane.showMessageDialog(null, "M?s escolhido - Abril");
			break;
		}
		case 5: {
			JOptionPane.showMessageDialog(null, "M?s escolhido - Maio");
			break;
		}
		case 6: {
			JOptionPane.showMessageDialog(null, "M?s escolhido - Junho");
			break;
		}
		case 7: {
			JOptionPane.showMessageDialog(null, "M?s escolhido - Julho");
			break;
		}
		case 8: {
			JOptionPane.showMessageDialog(null, "M?s escolhido - Agosto");
			break;
		}
		case 9: {
			JOptionPane.showMessageDialog(null, "M?s escolhido - Setembro");
			break;
		}
		case 10: {
			JOptionPane.showMessageDialog(null, "M?s escolhido - Outubro");
			break;
		}
		case 11: {
			JOptionPane.showMessageDialog(null, "M?s escolhido - Novembro");
			break;
		}
		case 12: {
			JOptionPane.showMessageDialog(null, "M?s escolhido - Dezembro");
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "N?o consta no calendario!");
		}
	}
}
