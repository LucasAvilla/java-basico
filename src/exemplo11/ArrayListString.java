package exemplo11;

import java.util.ArrayList;

/**
 * Classe para demonstrar a utiliza��o de Array list do tipo String
 * 
 * @author Lucas Igor A M Nogueira
 * @since 23 de fev. de 2021
 */

public class ArrayListString {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declarar e instanciar uma lista de String
		ArrayList<String> listaString = new ArrayList<String>();

		// adicionar registro na lista de string
		listaString.add("Elemento 1");
		listaString.add("Elemento 2");
		listaString.add("Elemento 3");

		// Exibindo o conteudo da lista
		System.out.println(listaString.get(0));
		System.out.println(listaString.get(1));
		System.out.println(listaString.get(2));

		// Adicionado em uma posi��o especifica
		listaString.add(1, "Elemento 1.5");

		// varrendo lista para exibir para o usuario
		for (String obj : listaString) {
			System.out.println(obj);
		}

		// obtendo o tamanho da lista de String
		System.out.println("O tamanho da lista �: " + listaString.size());

		// pesquisando valor especifico na lista
		if (listaString.contains("Elemento 1")) {
			System.out.println("Elemento encontrado!");
		} else {
			System.out.println("Elemento n�o encontrado!");
		}

		// descobrindo o indice do elemento pesquisado
		int indice = listaString.indexOf("Elemento 1");
		System.out.println("Indice: " + indice);

		// Adicionado uma nova posi��o
		listaString.add("Elemento 4");

		// obtendo o tamanho da lista de String
		System.out.println("O tamanho da lista �: " + listaString.size());

		// removendo um elemento da lista
		listaString.remove("Elemento 1.5");
		for (String string : listaString) {
			System.out.println(string);
		}

		// obtendo o tamanho da lista de String
		System.out.println("O tamanho da lista �: " + listaString.size());

	}
}