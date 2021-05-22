package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar conversão de dados do tipo string para double
 * 
 * @since 05/02/2021
 * @author lavilla
 */
public class ConverterDadosDouble {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		//Declarando variáveis
		double valor1, valor2, resultado;
		
		//Atribuindo valores para a variável informado
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
		
		//Efetuando calculo da divisão
		resultado = valor1 / valor2;
		
		//Exibindo o resultado da divisão
		System.out.println("O resultado da divisão é: " + resultado);
	}

}
