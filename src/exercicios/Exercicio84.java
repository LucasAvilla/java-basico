package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o salario e numero de filhos de cada habitante.
 * Calcular e exibir a media de salario, de filhos, maior salario e percentual
 * de pessoas com salario menor que R$ 150,00.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class Exercicio84 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando e inicializando as vari�veis
		double salario, mediasalario = 0, filhos = 0, maior = 0;
		int contador = 0, menor = 0;

		// Solicita as informa��es sobre os habitantes ao usuario
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salario: R$"));

		if (salario > 0) {// condi��o para prosseguir a execu��o
			filhos += Integer.parseInt(JOptionPane.showInputDialog("filhos"));
			mediasalario += salario;// Soma o valor dos salarios informados e armazena
			maior = salario;

			if ((salario < 150) && (salario > 0)) {
				menor++;
			}

			while (salario > 0) {
				salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salario: R$"));

				if (salario > 0) {// condi��o para prosseguir a execu��o
					filhos += Integer.parseInt(JOptionPane.showInputDialog("filhos"));
					mediasalario += salario;// Soma o valor dos salarios informados e armazena
				}
				if (salario > maior) {// Testa o maior salario informado
					maior = salario;// Armazena o maior salario
				}

				if ((salario < 150) && (salario > 0)) {// Testa os salarios abaixo de 150
					menor++;// Incrementa quantos salarios est�o abaixo de 150
				}

				contador++;// conta o numero de salarios informado para descobrir os habitantes

			}
		}

		// Calcula a media salarial, media de filhos, maior salario e percentual abaixo
		// de 150. Exibe os resultados para o usuario
		JOptionPane.showMessageDialog(null, "A media salarial �: R$ " + mediasalario / contador + "\n"+
											"A media do numero de filhos �: " + filhos / contador + "\n" + 
											"O maior salario � de: R$ " + maior	+ "\n" +
											"O percentual das pessoas com o salario menor que R$ 150 �: " + (menor * 100) / contador + "%");
	}

}
