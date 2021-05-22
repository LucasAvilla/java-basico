package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar convers�o de dados do tipo string para double
 * 
 * @since 05/02/2021
 * @author lavilla
 */
public class ConverterDadosDouble {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		//Declarando vari�veis
		double valor1, valor2, resultado;
		
		//Atribuindo valores para a vari�vel informado
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
		
		//Efetuando calculo da divis�o
		resultado = valor1 / valor2;
		
		//Exibindo o resultado da divis�o
		System.out.println("O resultado da divis�o �: " + resultado);
	}

}
