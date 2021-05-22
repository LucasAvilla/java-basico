/**
 * 
 */
package exemplo04;

/**
 * Programa para demonstrar laço de repetição While
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class RepeticaoWhile {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		//Declarando as variáveis
		int indice;
		
		//iniciando a variável
		indice = 0;
		
		//efetuando o laço de repetição para exibir o cubo de um numero
		while (indice < 10 ) {//inicio do laço de repetição
			System.out.println(indice+"ao cubo: " + ((indice * indice)* indice));
			indice++;
		}//fim do laço de repetição
	}

}
