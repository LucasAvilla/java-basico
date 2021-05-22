package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um valor e exibir se � positivo ou negativo (zero
 * considerar como positivo)
 * 
 * @author Lucas Igor A M Nogueira
 * @since 09/02/2021
 * 
 */
public class Exercicio37 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {
		// Declarando as vari�veis
		double num;
		
		//Atribuindo valor para vari�vel
		num = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero para verificar" + "\n"+
															 "se � POSITIVO ou NEGATIVO."));
		
		//Verificando o numero e exibindo para o usuario
		if (num >= 0) {
			JOptionPane.showMessageDialog(null,"Esse numero � POSITIVO");
		}else {
			JOptionPane.showMessageDialog(null,"Esse numero � NEGATIVO");	
		}
	}
	
}
