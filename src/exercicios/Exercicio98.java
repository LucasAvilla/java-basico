package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois vetores V1 e V2 de 15n�meros cada. Calcular e escrever
 * a quantidade de vezes que V1 e V2 possuem os mesmos n�meros e nas mesmas
 * posi��es.
 * 
 * @author Lucas Igor A M Nogueira
 *
 */

public class Exercicio98 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando, incializando e definindo tamanho para o vetor e vari�veis
		int v1[] = new int[15];
		int v2[] = new int[15];
		int aux = 0;

		// Valorizando o v1 com os dados informados pelo usuario
		for (int i = 0; i < v1.length; i++) {
			v1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor para o vetor V1:"));
		}

		// Valorizando o v2 com os dados informados pelo usuario
		for (int i = 0; i < v2.length; i++) {
			v2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor para o vetor V2:"));
		}

		for (int i = 0; i < v2.length; i++) {
			if (v1[i] == v2[i]) {
				aux++;// armazena o numero de vezes que v1 e v2 possuem o mesmo numero na mesma
						// posi��o
			}
		}

		// Exibe para o usuario o numero de vezes que os numeros e posi��es se repetem
		// em v1 e v2
		JOptionPane.showMessageDialog(null,
				"O numero de vezes que V1 e V2 possuem os mesmos n�meros, nas mesmas posi��es � " + aux);

	}
}
