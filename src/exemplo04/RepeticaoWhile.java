/**
 * 
 */
package exemplo04;

/**
 * Programa para demonstrar la�o de repeti��o While
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class RepeticaoWhile {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		//Declarando as vari�veis
		int indice;
		
		//iniciando a vari�vel
		indice = 0;
		
		//efetuando o la�o de repeti��o para exibir o cubo de um numero
		while (indice < 10 ) {//inicio do la�o de repeti��o
			System.out.println(indice+"ao cubo: " + ((indice * indice)* indice));
			indice++;
		}//fim do la�o de repeti��o
	}

}
