package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber uma quantidade, depois ler essa quantidade de numeros.
 * Calcular a media dos numeros lidos e qual o maior numero.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class Exercicio82 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando e inicializando as vari�veis
		double valor, media = 0, maior;
		int quantidade;

		// Solicitando que o usuario informe a quantidade
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
		
		valor = quantidade;
		
		//Parametro de valores 
		maior = valor;

		for (int i = 0; i < quantidade; i++) {//la�o de repeti��o para os valores conforme a quantidade
			valor = Double.parseDouble(JOptionPane.showInputDialog("valor"));

			if (valor > maior) {//testa se o valor � maior que maior 
				maior = valor; //se valor for maior, substitui maior
			}
			
			//Armazena os valores informados
			media += valor;

		}
		
		//Calcula a media dos valores informados. Exibe o maior numero e a media para o usuario
		JOptionPane.showMessageDialog(null, "O maior valor �: " + maior + "\n" + 
											"A media dos numeros �: " + media / quantidade);

	}
}
