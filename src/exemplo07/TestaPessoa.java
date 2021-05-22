package exemplo07;

/**
 * Programa para testar o objeto pessoa
 * 
 * @author Lucas Igor A M Nogueira
 * @since 17/02/2021
 */
public class TestaPessoa {

	/*
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {

		// declarar e instanciar o objeto pessoa
		Pessoa joao = new Pessoa();

		// atribuindo valores ao objeto joao
		joao.setNome("João Almeida de Souza");
		joao.setSalario(2598.98);

		// criando e instanciando o objeto de Data
		Data dataNascimento = new Data();

		// inicializando a data do objeto joao
		dataNascimento.setDia(10);
		dataNascimento.setMes(02);
		dataNascimento.setAno(1985);

		// atribui os valores de data para o objeto joao
		joao.setDataNascimento(dataNascimento);

		// exibindo os dados do objeto joao
		System.out.println("Nome: " + joao.getNome());
		System.out.println("Data de nascimento: " + joao.getDataNascimento());
		System.out.println(joao.getDataNascimento().faixaEtaria());
		System.out.println("O salario de João é R$ " + joao.getSalario() + joao.getsalariominimo());
	}

}
