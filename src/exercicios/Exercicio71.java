package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a tabuada do valor escolhido pelo usuario
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */
public class Exercicio71 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando e inicializando as vari�veis
		int tabuada = -1;
		String resultado;
		double calculoDaTabuada;

		// Solicitando o valor da tabuada para o usuario
		while ((tabuada <= 0) || (tabuada > 10)) {// Testa se o valor � valido
			tabuada = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		}

		// Cabe�alho do resultado
		resultado = "Tabuada do " + tabuada + "\n";

		// la�o de repeti��o para calcular a tabuada
		for (int i = 0; i < 11; i++) {
			calculoDaTabuada = tabuada * i;
			resultado += tabuada + " x " + i + " = " + calculoDaTabuada + "\n";
		}

		// Exibindo o resultado da tabuada escolhida para o usuario
		JOptionPane.showMessageDialog(null, resultado);

	}

}
