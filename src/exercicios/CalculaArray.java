package exercicios;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

/**
 * Classe para armazenar 10 numeros inteiros e devolve-los conforme as opções
 * apresentadas no menu.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 25 de fev. de 2021
 */

public class CalculaArray {

	private ArrayList<Integer> numeros;

	// Construtor de classe
	public CalculaArray() {

		// Declarar e instanciar uma Array de interios
		numeros = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			numeros.add(getNumero());
		}

		menuPrincipal();
	}

	// Método para criar um menu de opções
	public void menuPrincipal() {

		// Apresentar o menu de opções para o usuario
		String menu = "INFORME A OPÇÃO DESEJADA\n" 
					+ "\n1 - MAIOR ELEMENTO" 
					+ "\n2 - MENOR ELEMENTO"
					+ "\n3 - ORDENAR LISTA CRESCENTE" 
					+ "\n4 - ORDENAR LISTA DECRESCENTE" 
					+ "\n5 - MÉDIA DOS ELEMENTOS"
					+ "\n6 - SOMA DO MAIOR E MENOR ELEMENTO" 
					+ "\n7 - SOMA DOS ELEMENTOS IGUAIS"
					+ "\n8 - MÉDIA DOS ELEMENTOS IGUAIS" 
					+ "\n9 - SAIR DO SISTEMA";

		while (true) {
			try {// Bloco onde pode ser lançada uma linha de codigo de exceção
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
				processamentoPrincipal(opcao);
			} catch (Exception e) {// o que ocorrera quando a exceção for lançada
				JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida, Rotulo.calculaArray, 0);
			}
		}

	}

	// Método para controlar o processamento do programa
	public void processamentoPrincipal(int opcao) {

		switch (opcao) {
		case 1: {
			maiorElemento();
			break;
		}
		case 2: {
			menorElemento();
			break;
		}
		case 3: {
			ordenarListaCrescente();
			break;
		}
		case 4: {
			ordenarListaDecrescente();
			break;
		}
		case 5: {
			mediaDosElementos();
			break;
		}
		case 6: {
			somaDoMaiorEMenorElemento();
			break;
		}
		case 7: {
			somaDosElementosIguais();
			break;
		}
		case 8: {
			mediaDosElementosIguais();
			break;
		}
		case 9: {
			sairSistema();
			break;
		}

		// Caso o usuario informe uma opção que nao esta no menu
		default:
			JOptionPane.showMessageDialog(null, Mensagem.numeroInvalido, Rotulo.calculaArray, 0);
			break;
		}

	}

	// Método para exibir o maior elemento informado
	public void maiorElemento() {
		Collections.reverse(numeros);// Ordena a lista de forma decrescente, indice 0 sera o maior elemento
		JOptionPane.showMessageDialog(null, Mensagem.maiorElemento + numeros.get(0), Rotulo.maiorExibir, 1);

	}

	// Método para exibir o menor elemento informado
	public void menorElemento() {
		Collections.sort(numeros);// Ordena a lista de forma crescente, indice 0 sera o menor elemento
		JOptionPane.showMessageDialog(null, Mensagem.menorElemento + numeros.get(0), Rotulo.menorExibir, 1);

	}

	// Método para exibir os elementos informados em ordem crescente
	public void ordenarListaCrescente() {

		String mensagem = "Lista dos numeros em ordem Crescente\n\n";
		boolean existe = false;
		Collections.sort(numeros);

		for (Integer numero : numeros) {
			existe = true;
			mensagem += numero + "\n";
		}

		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, Rotulo.crescenteExibir, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.listaVazio, Rotulo.crescenteExibir, 2);
		}

	}

	// Método para exibir os elementos informados em ordem decrescente
	public void ordenarListaDecrescente() {

		String mensagem = "Lista dos numeros em ordem Derescente\n\n";
		boolean existe = false;
		Collections.reverse(numeros);

		for (Integer numero : numeros) {
			existe = true;
			mensagem += numero + "\n";
		}

		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, Rotulo.decrescenteExibir, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.listaVazio, Rotulo.decrescenteExibir, 2);
		}

	}

	// Método para exibir a media dos elementos informados
	public void mediaDosElementos() {
		double somaDosElementos = 0;
		String mensagem = "A media dos elementos é ";
		boolean existe = true;

		for (Integer numero : numeros) {
			somaDosElementos += numero;
		}
		double media = (somaDosElementos / 10);

		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem + media, Rotulo.mediaExibir, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.listaVazio, Rotulo.mediaExibir, 2);
		}
	}

	// Método para exibir a soma do maior e menor elemento
	public void somaDoMaiorEMenorElemento() {
		String mensagem = "A soma do maior e menor elemento é ";
		boolean existe = true;

		Collections.sort(numeros);
		int soma = numeros.get(numeros.size() - 1) + numeros.get(0);

		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem + soma, Rotulo.somaExibir, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.listaVazio, Rotulo.somaExibir, 2);
		}
	}

	// Método para exibir a soma dos elementos iguais
	public void somaDosElementosIguais() {

		// Atribuindo e inicializando variáveis auxiliares
		int contador = 1, igual = 0;
		String mensagem = "";

		// Array para numeros repetidos
		ArrayList<String> elementosIguais = new ArrayList<String>();

		Collections.sort(numeros);

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				if (numeros.get(i) == numeros.get(j) && i != j) {
					contador++;
					i = j;
				}
			}
			if (contador > 1) {
				igual = contador * numeros.get(i);
				elementosIguais.add("O elemento " + numeros.get(i) + " aparece: " + contador + " vezes.\n"
						+ "Sua soma totaliza: " + igual + ".\n");

			}

			contador = 1;
			igual = 0;
		}

		// Armazena os elementos iguais
		for (String auxigual : elementosIguais) {
			mensagem += auxigual + "\n";
		}

		// Exibe a mensagem para o usuario
		if (elementosIguais.size() == 0) {
			JOptionPane.showMessageDialog(null, Mensagem.somaIguaisVazio, Rotulo.somaiguaisExibir, 2);
		} else {
			JOptionPane.showMessageDialog(null, mensagem, Rotulo.somaiguaisExibir, 1);
		}
	}

	// Método para exibir a média dos elementos iguais
	public void mediaDosElementosIguais() {

		// Atribuindo e inicializando variáveis auxiliares
		int contador = 0;
		double media = 0;

		// Array para numeros repetidos
		ArrayList<Integer> mediaDosElementosIguais = new ArrayList<Integer>();

		// Ordenar os numeros em ordem crescente
		Collections.sort(numeros);

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				if (numeros.get(i) == numeros.get(j) && i != j) {
					contador++;
					i = j;
				}
			}
			if (contador > 1) {
				media += numeros.get(i);
				mediaDosElementosIguais.add(numeros.get(i));
			}
			contador = 1;
		}

		// Calcula a média dos elementos iguais
		media = media / mediaDosElementosIguais.size();

		// Exibe a mensagem para o usuario
		if (mediaDosElementosIguais.size() == 0) {
			JOptionPane.showMessageDialog(null, Mensagem.mediaIguaisVazio, Rotulo.mediaIguaisExibir, 2);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.mediaIguaisExibir + media, Rotulo.mediaIguaisExibir, 1);
		}

	}// fim do método

	// Método para sair do sistema
	public void sairSistema() {
		int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "Atenção", JOptionPane.YES_OPTION,
				JOptionPane.CANCEL_OPTION);

		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		}

	}// fim do método

	// Metodo para validar o elemento
	private int getNumero() {
		boolean execute = true;
		int numero = 0;
		while (execute) {
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog(Mensagem.informeNumero));

				if (Valida.isIntValido(numero)) {
					JOptionPane.showMessageDialog(null, Mensagem.numeroVazio, Rotulo.calculaArray, 0);
					execute = true;
				} else {
					execute = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.numeroInvalido, Rotulo.calculaArray, 0);
				execute = true;
			}

		}

		return numero;
	}// fim do método

	// Método principal para executar a classe
	// Ultimo método do programa
	public static void main(String[] args) {
		new CalculaArray();
	}// fim do método
}// fim da classe
