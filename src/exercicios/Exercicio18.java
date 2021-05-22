package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o numero de eleitores de um municipio, os votos
 * brancos, nulos e validos. Calular e exibir o percentual que cada voto
 * representa na eleição
 * 
 * @author Lucas Igor A M Nogueira
 * @since 05/042/2021
 */

public class Exercicio18 {

	/*
	 * Método principal para executar o programa
	 */

	public static void main(String[] args) {

		// Declarando as variaveis
		int totaleleitores, votosBr, votosNulos, votosVal;
		double percvotosBr, percvotosNulos, percvotosVal;

		// Atribuindo valor as variáveis
		totaleleitores = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de Eleitores:"));
		votosBr = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de Votos Brancos:"));
		votosNulos = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de Votos Nulos:"));
		votosVal = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de Votos Validos:"));

		// Calculando o percentual de votos brancos
		percvotosBr = (votosBr * 100) / totaleleitores;

		// Calculando o percentual de votos nulos
		percvotosNulos = (votosNulos * 100) / totaleleitores;

		// Calculando o percentual de votos validos
		percvotosVal = (votosVal * 100) / totaleleitores;

		// Exibe o total de eleitores e o percentual de cada tipo de voto
		JOptionPane.showMessageDialog(null,
				"O percentual em relação ao total de eleitores é:" + "\n" + "Total de Eleitores: " + totaleleitores
						+ "\n" + "Percentual de votos brancos: " + percvotosBr + " %" + "\n"
						+ "Percentual de votos nulos: " + percvotosNulos + " %" + "\n" + "Percentual de votos validos: "
						+ percvotosVal + " %");

	}
}
