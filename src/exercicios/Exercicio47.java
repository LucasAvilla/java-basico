package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para recebero estoque atual, minimo e maximo de um produto, calcula
 * e exibr o estoque medio e se precisa realizar nova compra
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio47 {

	/*
	 * M�todo principal para executar a clase
	 */

	public static void main(String[] args) {
		// Declarando as vari�veis
		int estoqueatual, estoquemin, estoquemax;
		double estoquemedio;

		// solicita as informa��es de estoque para o usuario
		estoqueatual = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade atual do estoque:"));
		estoquemax = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade maxima de estoque:"));
		estoquemin = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade minima de estoque:"));

		// calcula o estoque medio e armazena
		estoquemedio = (estoquemax + estoquemin) / 2;

		// Testa e exibe o estoque medio e se precisa ser realizada reposi��o para o
		// usuario
		if (estoqueatual >= estoquemedio) {
			JOptionPane.showMessageDialog(null, "O estoque medio do produto � de " + estoquemedio + " unidades" + "\n" + 
												"N�o efetuar compra");
		} else {
			JOptionPane.showMessageDialog(null,	"O estoque medio do produto � de " + estoquemedio + " unidades" + "\n" + 
												"Efetuar compra");
		}
	}

}
