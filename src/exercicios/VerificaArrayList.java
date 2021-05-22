package exercicios;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

/**
 * Classe para cadastrar de nomes devolve-los conforme as opções apresentadas no
 * menu.
 * 
 * @author Lucas Igor A M Nogueira
 * @since 25 de fev. de 2021
 */

public class VerificaArrayList {

	private ArrayList<String> listaNome;

	// Construtor de classe
	public VerificaArrayList() {

		listaNome = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
		}

		menuPrincipal();
	}

	// Método para criar um menu de opções
	public void menuPrincipal() {

		// Apresentar o menu de opções para o usuario
		String menu = "INFORME A OPÇÃO DESEJADA\n" 
					+ "\n1 - CADASTRAR NOME" 
					+ "\n2 - EXCLUIR NOME"
					+ "\n3 - LISTAR NOMES CADASTRADOS" 
					+ "\n4 - LISTA NOMES EM ORDEM ALFABÉTICA"
					+ "\n5 - LISTAR NOMES IGUAIS" 
					+ "\n6 - LISTAR NOMES POR LETRA INICIAL" 
					+ "\n7 - PESQUISAR UM NOME"
					+ "\n8 - SAIR DO SISTEMA";

		while (true) {
			try {// Bloco onde pode ser lançada uma linha de codigo de exceção
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
				processamentoPrincipal(opcao);
			} catch (Exception e) {// o que ocorrera quando a exceção for lançada
				JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida, Rotulo.verificaArray, 0);
			}
		}
	}

	// Método para controlar o processamento do programa
	public void processamentoPrincipal(int opcao) {

		switch (opcao) {
		case 1: {
			cadastrarNome();
			break;
		}
		case 2: {
			excluirNome();
			break;
		}
		case 3: {
			listarNomesCadastrados();
			break;
		}
		case 4: {
			listarNomesOrdemAlfabetica();
			break;
		}
		case 5: {
			listarNomesIguais();
			break;
		}
		case 6: {
			listarNomesPorLetraInicial();
			break;
		}
		case 7: {
			pesquisarNome();
			break;
		}
		case 8: {
			sairSistema();
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, Mensagem.numeroInvalido, Rotulo.verificaArray, 0);
			break;
		}
	}

	public void cadastrarNome() {

		while (listaNome.size() < 10) {
			listaNome.add(getNome());
		}

		// variável auxiliar para verificar se gravou o livro
		boolean gravado = false;

		// laço para verificar espaço
		for (int i = 0; i < 10; i++) {// inicio do for
			if (listaNome == null) {
				listaNome.add(getNome());
				gravado = true;
				break;
			}
		} // fim do for

		// exibindo para o usuario se o cadastro foi realizado com sucesso
		if (gravado) {
			JOptionPane.showMessageDialog(null, Mensagem.nomeNaoCadastrado, Rotulo.cadastrarNome, 2);

		} else {
			JOptionPane.showMessageDialog(null, Mensagem.nomeCadastrado, Rotulo.cadastrarNome, 1);
		}

	}

	public void excluirNome() {

		if (listaNome.size() == 0) {
			JOptionPane.showMessageDialog(null, Mensagem.listaNaoCadastrada, Rotulo.cadastrarNome, 0);
		} else {

			String mensagem = "Nome excluido! Nova Lista\n\n";

			// removendo um elemento da lista
			listarNomesCadastrados();
			String nome = JOptionPane.showInputDialog(null, Mensagem.informeNome + "\n", 3);

			listaNome.remove(nome);

			for (int i = 1; i < 11; i++) {
				for (String listaNome : listaNome) {
					if (listaNome != null) {
						mensagem += (i++) + " - " + listaNome + "\n";
					}
				}

			}
			JOptionPane.showConfirmDialog(null, mensagem);
		}
	}

	public void listarNomesCadastrados() {// lista os nomes na ordem de cadastro

		String mensagem = "Nomes cadastrados\n\n";
		boolean existe = false;

		for (int i = 1; i < 11; i++) {
			for (String listaNome : listaNome) {
				existe = true;
				mensagem += (i++) + " - " + listaNome + "\n";
			}
		}

		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, Rotulo.cadastrarNome, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, Rotulo.cadastrarNome, 2);
		}

	}

	public void listarNomesOrdemAlfabetica() {// ordem alfabetica

		String mensagem = "Nomes em ordem Alfabética\n\n";
		ArrayList<String> auxListaNome = new ArrayList<String>();
		auxListaNome = listaNome;

		Collections.sort(auxListaNome);

		boolean existe = false;

		for (int i = 1; i < 11; i++) {
			for (String auxListaNome1 : listaNome) {
				existe = true;
				mensagem += (i++) + " - " + auxListaNome1 + "\n";
			}
		}

		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, Rotulo.cadastrarNome, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, Rotulo.cadastrarNome, 2);
		}

	}

	public void listarNomesIguais() {

		if (listaNome.size() == 0) {
			JOptionPane.showMessageDialog(null, Mensagem.listaNaoCadastrada, Rotulo.cadastrarNome, 0);
		} else {

			// Atribuindo e inicializando variáveis auxiliares
			int contador = 1;
			String mensagem = "";

			// Array para numeros repetidos
			ArrayList<String> elementosIguais = new ArrayList<String>();

			Collections.sort(listaNome);

			for (int i = 0; i < listaNome.size(); i++) {

				for (int j = 0; j < listaNome.size(); j++) {
					if (listaNome.get(i).equals(listaNome.get(j)) && i != j) {
						contador++;
						i = j;
					}
				}
				if (contador > 1) {
					elementosIguais.add("O nome " + listaNome.get(i) + " aparece: " + contador + " vezes.\n");

				}

				contador = 1;
			}

			// Armazena os elementos iguais
			for (String string : elementosIguais) {
				mensagem += string + "\n";
			}

			// Exibe a mensagem para o usuario
			if (elementosIguais.size() != 0) {

				JOptionPane.showMessageDialog(null, mensagem, Rotulo.nomesiguaisExibir, 1);

			} else {
				JOptionPane.showMessageDialog(null, Mensagem.nomesIguaisVazio, Rotulo.nomesiguaisExibir, 2);

			}
		}
	}

	public void listarNomesPorLetraInicial() {

		if (listaNome.size() == 0) {
			JOptionPane.showMessageDialog(null, Mensagem.listaNaoCadastrada, Rotulo.cadastrarNome, 0);
		} else {

			// recebendo do usuario qual letra inicial a ser pesquisado
			String letra = JOptionPane.showInputDialog("Informe a letra inicial para pesquisa");

			// variavel auxiliar para exibir a mensagem do resultado pesquisado
			String mensagem = "Pesquisa por letra:\n\n";

			// variavel auxiliar para verificar se existe nome com a inicial cadastrada
			boolean existe = false;

			// varrendo o vetor e verificando a Letra
			for (int i = 0; i < listaNome.size(); i++) {
				if (listaNome.get(i) != null && (listaNome.get(i).substring(0, 1).equals(letra))) {
					mensagem += listaNome.get(i) + "\n";
					existe = true;
				}
			} // fim do for

			// exibindo o resultado da pesquisa para o usuario
			if (existe) {
				JOptionPane.showMessageDialog(null, mensagem, Rotulo.listaPorLetraInicial, 2);
			} else {
				JOptionPane.showMessageDialog(null, Mensagem.letraNaoCadastrada, Rotulo.listaPorLetraInicial, 1);
			}
		}
	}

	public void pesquisarNome() {
		String nome = JOptionPane.showInputDialog(null, Mensagem.informeNome);

		// pesquisando nome especifico na lista
		if (listaNome.contains(nome)) {
			JOptionPane.showMessageDialog(null, Mensagem.nomeEncontrado, Rotulo.cadastrarNome, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.nomeNaoCadastrado, Rotulo.cadastrarNome, 2);
		}
	}

	// Método para sair do sistema
	public void sairSistema() {
		int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "Atenção", JOptionPane.YES_OPTION,
				JOptionPane.CANCEL_OPTION);

		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	//Método para retornar o nome
	private String getNome() {
		boolean execute = true;
		String nome = "";
		while (execute) {
			nome = JOptionPane.showInputDialog(Mensagem.informeNome);
			if (Valida.isString(nome) || Valida.isEmptyOrNull(nome)) {
				JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, Rotulo.cadastrarNome, 0);
				execute = true;
			} else {
				execute = false;
			}
		}

		return nome;
	}

	//Método principal para executar a classe
	public static void main(String[] args) {

		new VerificaArrayList();

	}// fim do método

}// fim da classe
