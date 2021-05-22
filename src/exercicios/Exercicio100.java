package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler e armazenar em um vetor a temperatura m�dia de todos os
 * dias da semana. Calcular e escrever: a menor temperatura da semana , a maior
 * temperatura da semana, a temperatura m�dia semanal, o n�mero de dias na
 * semana em que a temperatura foi inferior � m�dia semanal.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 12/02/2021
 */

public class Exercicio100 {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando, inicializando e definido tamanho dos vetores e vari�veis
		String temperatura = "";
		String dia[] = { "Domingo", "Segunda", "Ter�a", "Quarta", "Quinta", "Sexta", "Sabado" };
		double maior = 0, menor = 500, media = 0, soma = 0, contador = 0;

		//Recebe do usuario a temperatura conforme o dia solicitado
		for (int i = 0; i < dia.length; i++) {
			temperatura = JOptionPane.showInputDialog("Informe a temeperatura de " + dia[i]);
			soma += Double.parseDouble(temperatura);//armazena a soma das temperaturas da semana

			if (Double.parseDouble(temperatura) > maior) {
				maior = Double.parseDouble(temperatura);//valida a maior temperatura informada
			}

			if (Double.parseDouble(temperatura) < menor) {
				menor = Double.parseDouble(temperatura);//valida a menor temperatura informada
			}
			
			//Calcula a media da temperatura da semana
			media = soma / 7; 

			//Verifica quantos dias a temperatura da semana ficou abaixo da media semanal
			if (Double.parseDouble(temperatura) < media) {
				contador++;
			}

			// Exibindo a media da turma e a numero de notas acima dessa media para o
			// usuario
			JOptionPane.showMessageDialog(null,"A menor temperatura da semana foi " + menor + "\n" + 
											   "A maior temperatura da semana foi " + maior + "\n" + 
											   "Temperatura m�dia semanal  foi " + media + "\n" +
											   "O n�mero de dias na semana em que a temperatura \n"+
											   "foi inferior � m�dia semanal foram " + contador);

		}
	}
}