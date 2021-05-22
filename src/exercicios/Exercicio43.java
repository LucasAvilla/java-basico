package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a hora de inicio e termino de uma partida de xadrez e
 * exibir a dura��o do jogo em horas.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 */

public class Exercicio43 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as vari�veis
		int horaI, horaF, tempo;

		// Atribuindo valor para as vari�veis
		horaI = Integer.parseInt(JOptionPane.showInputDialog("Informe o horario de inicio da partida:"));
		horaF = Integer.parseInt(JOptionPane.showInputDialog("Informe o horario de termino da partida:"));

		// Calcula a dura��o da partida e exibe o tempo para o usuario
		if (horaI < horaF) {
			tempo = horaF - horaI;
			JOptionPane.showMessageDialog(null, "O tempo da partida foi de " + tempo + " horas.");
		} else {
			tempo = (24 - horaI) + horaF;
			JOptionPane.showMessageDialog(null, "O tempo da partida foi de " + tempo + " horas.");
		}

	}

}
