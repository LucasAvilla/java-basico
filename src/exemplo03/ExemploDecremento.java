package exemplo03;

/**
 * Programa para demonstrar decremento de valores
 * 
 * @author Lucas Igor A M Nogueira
 * @since 10/02/2021
 */

public class ExemploDecremento {

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando as vari�veis
		int numero;
		
		//Atribuindo valor para vari�vel
		numero = 1;
		
		System.out.println(numero);// exibe o valor 1
	
		numero = numero - 1;//decremento

		System.out.println(numero);// exibindo o valor 0

		numero = 10;
		
		numero--;//decremento -1

		System.out.println(numero);// exibindo o valor 9
		
		numero--;//decremento -1
		numero--;//decremento -1
		
		System.out.println(numero);// exibindo o valor 7

	}

}
