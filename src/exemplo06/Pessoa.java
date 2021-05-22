package exemplo06;

/**
 * Classe para demonstrar a utiliza��o de objetos. Responsavel por armazenar
 * seus atributos e m�todos
 * 
 * @author Lucas Igor A M Nogueira
 * @since 17/02/2021
 */

public class Pessoa {

	String nome;
	String dataNascimento;
	double altura;
	double peso;
	String sexo;
	String maioroumenorIdade;

	// M�todo para exibir os dados do objeto
	public void exibirDados() {// incio do m�todo

		System.out.println("Nome: " + nome);
		System.out.println("Data de nascimento: " + dataNascimento);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + calcularIdade());
		System.out.println("A pessoa � " + faixaEtaria());

	}// fim do m�todo

	// M�todo para retornar a idade da pessoa
	public int calcularIdade() {

		// declarando a vari�vel de retorno
		int idade = 0;

		// vari�vel para receber o ano de nascimento
		int anoNascimento = 0;
		int anoAtual = 2021;

		// quebrando data do tipo string
		String dataQuebrada[] = dataNascimento.split("/");
		anoNascimento = anoAtual - Integer.parseInt(dataQuebrada[2]);

		// calculando a idade do objeto
		idade = anoAtual - anoNascimento;

		// Retornando a idade calculada
		return idade;

	}
	// m�todo para retornar se � mairo de idade ou n�o
		public String faixaEtaria() {

			// calculo maior idade
			if (calcularIdade() >= 18) {
				return "Maior de idade";
			} else {
				return "Menor de idade";
			}
	}
}

