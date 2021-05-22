package exemplo06;

/**
 * Classe para demonstrar a utilização do objeto Pessoa
 * 
 * @author Lucas Igor A M Nogueira
 * @since 17/02/2021
 */

public class TestaPessoa {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// Declarando o objeto pessoa
		Pessoa joao;

		// inicializando o objeto joao
		joao = new Pessoa(); // instancia de objeto

		// Exibindo o objeto joao
		System.out.println(joao);

		// Atribuindo valor ao objeto joao (objeto Pessoa, chamado joao)
		joao.nome = "Joao Almeida de Souza";
		joao.dataNascimento = "23/05/1986";
		joao.altura = 1.89;
		joao.peso = 85;
		joao.sexo = "Masculino";

		// Declarando objeto pessoa maria
		Pessoa maria;

		// inicializando o objeto Maria
		maria = new Pessoa(); // instancia de objeto

		// Atribuindo valor ao objeto maria (objeto Pessoa, chamado maria)
		maria.nome = "Maria da Silva de Souza";
		maria.dataNascimento = "12/08/1985";
		maria.altura = 1.52;
		maria.peso = 65;
		maria.sexo = "Feminino";

		// Exibindo dados do objeto Joao
		System.out.println("Nome: " + joao.nome);
		System.out.println("Data de nascimento: " + joao.dataNascimento);
		System.out.println("Altura: " + joao.altura);
		System.out.println("Peso: " + joao.peso);
		System.out.println("Sexo: " + joao.sexo);

		// Pulando linha
		System.out.println("");

		// Exibindo dados do objeto Maria
		System.out.println("Nome: " + maria.nome);
		System.out.println("Data de nascimento: " + maria.dataNascimento);
		System.out.println("Altura: " + maria.altura);
		System.out.println("Peso: " + maria.peso);
		System.out.println("Sexo: " + maria.sexo);

		// Pulando linha
		System.out.println("");

		// Exibindo os dados do objeto joao
		joao.exibirDados();

		// Pulando linha
		System.out.println("");

		// Exibindo dados do objeto Maria
		maria.exibirDados();
	}
}
