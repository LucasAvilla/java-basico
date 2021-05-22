package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a quantidade de litros de refresco, calcular e exibir o
 * total de partes
 * 
 * @author Lucas Igor A M Nogueira
 * @since 06/02/2021
 * 
 */

public class Exercicio34 {

	/*
	 * Método principal para executar o programa
	 */
	
	public static void main(String[] args) {
		
		//Declarando as variáveis
		double litros, suco, agua;
		
		//Atribuindo valor as variaveis
		litros = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de litros de refresco desejada:"));
		
		//Calculando o valor das partes para a quantidade de litros informado
		suco = litros * 0.2;
	    agua = litros * 0.8;
		
	    //Exibe o total de litros das partes para a quantidade de refresco para o usuario
	    JOptionPane.showMessageDialog(null,"O total de suco de maracuja sera de "+ suco + " l e o de agua mineral sera de " + agua +" l");
	    
	}
}
